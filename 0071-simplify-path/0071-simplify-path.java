class Solution {
    public String simplifyPath(String path)
    {
        String[] str=path.split("/");
        Stack<String> stk=new Stack<>();
        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals(".."))
            {
                if(!stk.isEmpty())
                {
                    stk.pop();
                }
            }
            else if(!str[i].equals(".") && !str[i].equals(""))
            {
                stk.push(str[i]);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(String s :stk){
            sb.append("/").append(s);
        }
        return sb.length() > 0 ? sb.toString() : "/";
    }
}