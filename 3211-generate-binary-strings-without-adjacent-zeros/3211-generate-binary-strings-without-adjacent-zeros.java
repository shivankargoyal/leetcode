class Solution 
{
    public List<String> validStrings(int n) 
    {
        List<String> ans = new ArrayList<>();
        if(n==1)
        {
            ans.add("1");
            ans.add("0");
            return ans;
        }

        ans.add("01");
        ans.add("10");
        ans.add("11");

        for(int i=3; i<=n; i++)
        {
            List<String> curr = new ArrayList<>();
            for(var a : ans)
            {
                if(a.charAt(a.length()-1)=='1')
                {
                    curr.add(a+"1");
                    curr.add(a+"0");
                }
                else
                {
                    curr.add(a+"1");
                }
            }
            ans = curr;
        }
        return ans;
    }
}