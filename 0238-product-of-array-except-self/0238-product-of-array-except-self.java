class Solution
{
    // public int value(int[] arr,int ind)
    // {
    //     int prod=1;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(i!=ind)
    //         {
    //             prod=prod*arr[i];
    //         }
    //     }
    //     return prod;
    // }
    public int[] productExceptSelf(int[] nums)
    {
        int total=1;
        int zerot=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0 && total==0)
            {
                zerot=0;
            }
            total=total*nums[i];
            // System.out.println("total= "+total);
            if(zerot==0 && total!=0)
            {
                // System.out.println("zerot to 1");
                zerot++;
            }
            // if(nums[i]!=0 && total!=1)
            if(nums[i]!=0)
            {
                zerot=zerot*nums[i];
                // System.out.println("zerot= "+zerot);
            }
            
        }

        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                arr[i]=zerot;
                continue;
            }
            arr[i]=total/nums[i];
        }
        return arr;
    }
}