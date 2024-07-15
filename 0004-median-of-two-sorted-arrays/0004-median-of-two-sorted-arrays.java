class Solution
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int i=0,j=0,k=0;
        double median=0;
        double [] merge=new double[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length)
        {
            System.out.println("in first while i j "+i+" "+j);
            if(nums1[i]<nums2[j])
            {
                System.out.println("in 1st if while "+nums1[i]+" "+nums2[j]);
                merge[k]=(double)nums1[i];
                k++;
                i++;
                continue;
            }
            else if(nums1[i]==nums2[j])
            {
                System.out.println("in 2nd if while "+nums1[i]+" "+nums2[j]);
                merge[k]=(double)nums1[i];
                i++;
                k++;
                merge[k]=(double)nums2[j];
                j++;
                k++;
                continue;
            }
            else
            {
                System.out.println("in 3rd if while "+nums1[i]+" "+nums2[j]);
                merge[k]=(double)nums2[j];
                j++;
                k++;
                continue;
            }
        }
        while(i<nums1.length)
        {
            System.out.println("in second while i j "+i+" "+j);
            merge[k]=nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length)
        {
            System.out.println("in third while i j "+i+" "+j);
            merge[k]=nums2[j];
            k++;
            j++;
        }
        for(int a=0;a<merge.length;a++)
        {
            System.out.println(merge[a]);
        }
        
        int temp=0;
        if(merge.length==2)
        {
            median=(merge[0]+merge[1])/2;
            return median;
        }
        if(merge.length%2==0)
        {
            temp=merge.length/2;
            median+=merge[temp-1];
            median+=merge[temp];
            median=(median/2);
        }
        else
        {
            temp=merge.length/2;
            median+=merge[temp];
        }
        return median;
    }
}