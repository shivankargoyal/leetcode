class Solution {
    public int maxWidthOfVerticalArea(int[][] points)
    {
        int []arr=new int[points.length];
        for(int i=0;i<points.length;i++)
        {
            arr[i]=points[i][0];
        }
        Arrays.sort(arr);
        int max=0;
        int a=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            int temp=Math.abs(arr[i]-a);
            if(temp>max)
            {
                max=temp;
            }
            a=arr[i];
        }
        return max;
    }
}