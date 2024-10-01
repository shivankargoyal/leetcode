class Solution
{
    public boolean squareIsWhite(String coordinates)
    {
        char a=coordinates.charAt(0);
        char b=coordinates.charAt(1);
        int m=(int)a;
        int n=(int)b -48;
        System.out.println(a+" "+b+" "+m+" "+n);
        if(m%2==0)
        {
            if(n%2==0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            if(n%2==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}