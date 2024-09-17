// class Solution {
//     public int majorityElement(int[] nums)
//     {
//         Arrays.sort(nums);
//         int n=0;
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<nums.length;i++)
//         {
//             int temp=nums[i];
//             map.put(temp,map.getOrDefault(temp, 0)+1);
//         }
//         for(int i=0;i<nums.length;i++)
//         {
//             Integer key=map.get(nums[i]);
//             int temp=key.intValue();
//             if(n<temp)
//             {
//                 n=temp;
//             }
//         }
//         Integer keyfound=0;
//         for (Map.Entry<Integer, Integer> entry : map.entrySet())
//         {
//             if (entry.getValue().equals(n)) {
//                 keyfound = entry.getKey();
//                 break; 
//             }
//         }
        
//         return keyfound;
//     }
// }
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}