class Solution {
    public int[] intersection(int[] nums1, int[] nums2)
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=Math.min(nums1.length,nums2.length);
        ArrayList<Integer> arr=new ArrayList<>();
        int last=-1;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j] && nums1[i]!=last)
                {
                    arr.add(nums1[i]);
                    last=nums1[i];
                }
            }
        }
        int[] ans=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            ans[i]=arr.get(i);
        }
        return ans;
    }
}