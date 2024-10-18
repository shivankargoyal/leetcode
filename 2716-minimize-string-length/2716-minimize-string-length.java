class Solution {
    public int minimizedStringLength(String s)
    {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            String str=""+s.charAt(i);
            if(ans.contains(str))
            {
                continue;
            }
            ans+=str;
        }
        return ans.length();
    }
}