class Solution 
{
    public String replaceDigits(String s) 
    {
        String alpha="abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            String temp = String.valueOf(s.charAt(i)); 
            
            if(!alpha.contains(temp))
            {
                int i1=s.charAt(i)-'0';
                int i2=alpha.indexOf(s.charAt(i-1));
                sb.append(alpha.charAt(i1+i2));
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}