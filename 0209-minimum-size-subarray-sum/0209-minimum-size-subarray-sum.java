// Algo Used: Sliding Window
// TC: O N , SC: O 1
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n= nums.length;
        int l=0;
        int r=0;
        int sum= 0;
        int ans= Integer.MAX_VALUE;
        int currLen= 0;
        while(r < n){ // run till the right pointer reaches end
            sum+= nums[r];
            while(sum >= target){ // if found potential ans then reduce the window and keep on updating the window i.e ans
                currLen= r - l + 1;
                ans= Math.min(ans, currLen);
                sum-= nums[l];
                l++; // shrinkiing window
            }
            r++;   // expanding window
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}