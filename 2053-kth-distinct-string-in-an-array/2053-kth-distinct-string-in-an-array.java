class Solution
{
    public String kthDistinct(String[] arr, int k)
    {
        int j=0;
        int n=0;
        Map<String,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            j=0;
            String temp=arr[i];
            while(j<arr.length)
            {
                // String t=arr[j];
                if(temp.equals(arr[j]))
                {
                    count++;
                }
                j++;
            }
            if(count<=1)
            {
                n++;
                hmap.put(temp,count);
            }
            if(n==k)
            {
                return temp;
            }
        }
        return "";
    }
}