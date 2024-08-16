class Solution {
    public int thirdMax(int[] nums){
        Arrays.sort(nums);
        int last=-100000000;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=last){
                arr.add(nums[i]);
                last=nums[i];
            }
        }
        if(arr.size()<3){
            return arr.get(arr.size()-1);
        }
        return arr.get(arr.size()-3);
    }
}