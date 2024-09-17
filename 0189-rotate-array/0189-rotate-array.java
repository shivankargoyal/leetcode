class Solution
{
    public int[] reverse(int[] arr,int left,int right)
    {
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }
    public void rotate(int[] nums, int k) 
    {
        int []rev=new int[nums.length];
        rev=reverse(nums,0,nums.length-1);
        k=k%nums.length;
        rev=reverse(rev,0,k-1);
        rev=reverse(rev,k,nums.length-1);
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=rev[i];
        }
    }
}