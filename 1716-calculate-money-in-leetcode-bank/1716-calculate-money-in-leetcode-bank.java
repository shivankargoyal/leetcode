class Solution
{
    public int totalMoney(int n)
    {
        int i=1;
        int sum=0;
        int temp=n;
        int count=0;
        while(temp>0)
        {
            if(i==(8+count))
            {
                count++;
                i=1+ count;
            }
            System.out.println(i+ " hi");
            sum+=i;
            i++;
            temp--;
        }
        return sum;
    }
}