class Solution
{
    public int check(int [] num2, int num,int k)
    {
        int count=0;
        for(int i=0;i<num2.length;i++)
        {
            if(num%(num2[i]*k)==0)
            {
                count++;
            }
        }
        return count;
    }
    public int numberOfPairs(int[] nums1, int[] nums2, int k)
    {
        int count=0;
        for(int i=0;i<nums1.length;i++)
        {
            count+=check(nums2,nums1[i],k);
        }
        return count;
    }
}