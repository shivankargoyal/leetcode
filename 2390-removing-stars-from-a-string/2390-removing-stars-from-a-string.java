class Solution {
    public String removeStars(String s)
    {
        Stack<Character> arr=new Stack<>();
        if(s.length()==1)
        {
            return s;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='*')
            {
                arr.push(s.charAt(i));
            }
            else
            {
                arr.pop();
            }
        }
        String ree="";
        while(!arr.isEmpty())
        {
            ree=Character.toString(arr.pop())+ree;
        }
        return ree;
    }
}