class Solution {
    public int[] getConcatenation(int[] nums)
    {
        int []arr=new int[nums.length+nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[j];
            arr[i+nums.length]=nums[j];
            j++;
        }
        return arr;
    }
}