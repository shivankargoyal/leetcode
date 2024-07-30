class Solution {
    public int subtractProductAndSum(int n) 
    {
        int mul=1,addi=0;
        while(n!=0)
        {
            int m=n%10;
            mul=m*mul;
            addi+=m;
            n=n/10;
        }
        return mul - addi;
    }
}