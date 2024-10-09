class Solution
{
    public static void rotate(int []arr)
    {
        int first=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
    }
    public static boolean ifincreasing(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]<=arr[i])
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public boolean check(int[] arr)
    {
        boolean chak=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[j]);
            }
            System.out.println();
            if(ifincreasing(arr))
            {
                return true;
            }
            rotate(arr);
        }
        return false;
    }
}