class Solution {
    public int addedInteger(int[] nums1, int[] nums2)
    {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++)
        {
            min1=Math.min(min1,nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            min2=Math.min(min2,nums2[i]);
        }
        // return nums2[0]-nums1[0];
        return min2-min1;
    }
}