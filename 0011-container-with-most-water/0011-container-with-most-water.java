class Solution {
    public int maxArea(int[] height)
    {
        int maxar=0;
        int temp=0;
        int start=0;
        int end=height.length-1;
        while(start<end)
        {
            temp=Math.min(height[start],height[end])*(end-start);
            if(maxar<temp)
            {
                maxar=temp;
            }
            if (height[start] < height[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return maxar;
    }
}