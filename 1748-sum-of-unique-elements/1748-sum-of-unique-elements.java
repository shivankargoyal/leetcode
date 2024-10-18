class Solution {
    public int sumOfUnique(int[] nums)
    {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: hmap.entrySet())
        {
            int x=entry.getKey();
            if(hmap.get(x)==1)
            {
                sum+=x;
            }
        }
        return sum;
    }
}