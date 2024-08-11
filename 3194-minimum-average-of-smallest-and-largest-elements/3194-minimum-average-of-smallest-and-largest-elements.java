class Solution
{
    public static int parti(int []arr, int l,int h)
    {
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<h;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        //swap
        int temp=arr[i];
        arr[i]=arr[h];
        arr[h]=temp;
        return i;
    }

    public static void quicksort(int []arr,int low,int high)
    {
        if(low<high)
        {
            int pivot=parti(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }
    public double minimumAverage(int[] nums)
    {
        int n=nums.length;
        quicksort(nums,0,n-1);
        double minElement = Double.MAX_VALUE;
        int i = 0;
        int j = nums.length-1;
        double avg;
        while(i < j){
            avg = ((double) nums[i] + nums[j])/2;
            if(avg < minElement){
                minElement = avg;
            }
            i++;
            j--;
        }
        return minElement;
    }
}