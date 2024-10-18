class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int carry=0;
        for(int i=0;i<s.length();i++)
        {
            char temp=s.charAt(i);
            if(temp=='|' && carry==0)
            {
                carry=1;
                continue;
            }
            else if(temp=='|' && carry==1)
            {
                carry=0;
                continue;
            }
            if(temp=='*' && carry!=1)
            {
                count++;
            }
        }
        return count;
    }
}