class Solution {
    public int[] sortArrayByParity(int[] nums)
    {
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                stk.push(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                stk.push(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=stk.pop();
        }
        return nums;
    }
}