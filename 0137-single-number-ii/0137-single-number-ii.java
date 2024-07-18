class Solution {
    public int singleNumber(int[] nums)
    {
        int count=0;
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(nums[i]))
            {
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }
            else
            {
                hmap.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: hmap.entrySet())
        {
            if(entry.getValue()==1)
            {
                count=entry.getKey();
            }
        }
        return count;
    }
}