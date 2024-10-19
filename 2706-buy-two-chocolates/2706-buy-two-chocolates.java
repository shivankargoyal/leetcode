class Solution {
    public int buyChoco(int[] price, int money)
    {
        int min1=Integer.MAX_VALUE-1;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++)
        {
            if(min2>=min1 && price[i]<min2)
            {
                min2=price[i];
            }
            else if(min1>min2 && price[i]<min1)
            {
                min1=price[i];
            }
        }
        int sum=min1+min2;
        return (sum<=money)? money-sum:money;
    }
}