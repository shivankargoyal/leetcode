class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int arr[]=new int[2];
        int curr=0;
        for(int i=0;i<nums.length;i++)
        {
            curr=target-nums[i];
            if(hmap.containsKey(curr))
            {
                arr[0]=hmap.get(curr);
                arr[1]=i;
                return arr;
            }
            hmap.put(nums[i],i);
        }
        return arr;
    }
}