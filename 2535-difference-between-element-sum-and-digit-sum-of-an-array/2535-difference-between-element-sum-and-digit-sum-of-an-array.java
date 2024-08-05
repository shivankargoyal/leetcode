class Solution
{
    public int breaksum(int num)
    {
        String r=Integer.toString(num);
        String [] arr=r.split("");
        int sum = 0;
        for (String str : arr) {
            sum += Integer.parseInt(str);
        }
        return sum;
    }
    public int differenceOfSum(int[] nums)
    {
        int esum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++)
        {
            esum+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%10==nums[i])
            {
                dsum+=nums[i];
            }
            else
            {
                dsum+=breaksum(nums[i]);
            }
        }
        // System.out.println(esum+"  "+dsum);
        return Math.abs(esum-dsum);
    }
}