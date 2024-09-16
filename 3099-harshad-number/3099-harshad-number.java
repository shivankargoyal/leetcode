class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x)
    {
        int temp=x;
        int sun=0;
        while(temp>0)
        {
            int t=temp%10;
            sun+=t;
            temp=temp/10;
        }
        if(x%sun==0)
        {
            return sun;
        }
        else
        {
            return -1;
        }
    }
}