class Solution 
{
    public boolean rotateString(String s, String goal)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.equals(goal))
            {
                return true;
            }
            char t=s.charAt(0);
            s=s.substring(1,s.length())+t;
            // System.out.println(s);
        }
        return false;
    }
}