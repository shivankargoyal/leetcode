class Solution {
    public int[] productExceptSelf(int[] nums)
    {
        int temp=1;
        int []arr1=new int[nums.length];
        int []arr2=new int[nums.length];
        // arr1[0]=1;
        // arr2[nums.length-1]=1;
        for(int i=0;i<nums.length;i++)
        {
            arr1[i]=temp;
            temp=temp*nums[i];
            // System.out.println(arr1[i]);
        }
        temp=1;
        // System.out.println("asdhasgfdashjcvasddfjhgvsa");
        for(int i=nums.length-1;i>=0;i--)
        {
            arr2[i]=temp;
            temp=temp*nums[i];
            // System.out.println(arr2[i]);
        }

        int []result=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            result[i]=arr1[i]*arr2[i];
        }
        return result;
    }
}