class Solution 
{
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        ArrayList<Integer> arr=new ArrayList<>();
        int count=0;
        while(left<=right)
        {
            int temp=left;
            while(temp>0)
            {
                int t=temp%10;
                if(t==0 || left%t!=0)
                {
                    count++;
                    break;
                }
                temp=temp/10;
            }
            if(count==0)
            {
                arr.add(left);
            }
            else
            {
                count=0;
            }
            left++;
        }
        return arr;
    }
}