class Solution {
    public int[] rearrangeArray(int[] nums)
    {
        Stack<Integer> pstk=new Stack<>();
        Stack<Integer> nstk=new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                // System.out.print(nums[i]+" ");
                pstk.push(nums[i]);
            }
            else
            {
                nstk.push(nums[i]);
            }
        }
        // System.out.println();
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i%2==1)
            {
                nums[i]=nstk.pop();
            }
            else
            {
                // System.out.print(nums[i]);
                nums[i]=pstk.pop();
            }
        }
        return nums;
    }
}