class Solution {
    public int addDigits(int num)
    {
        if(num<10)
        {
            return num;
        }
        int sum=0;
        while(num>0)
        {
            int temp=num%10;
            sum=sum+temp;
            num=num/10;
            // System.out.println(sum);
        }
        if(sum<10)
        {
            // System.out.println("pass ho gaya bc");
            return sum;
        }
        else
        {
            // System.out.println("recursion bby");
            return addDigits(sum);
        }
    }
}