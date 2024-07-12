class Solution
{
    public int findPermutationDifference(String s, String t)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int ind1=t.indexOf(ch);
            int ind2=s.indexOf(ch);
            int temp=ind1-ind2;
            count+=Math.abs(temp);
        }
        return count;
    }
}