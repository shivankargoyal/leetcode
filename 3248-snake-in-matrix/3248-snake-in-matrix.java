class Solution {
    public int finalPositionOfSnake(int n, List<String> commands)
    {
        int i=0;
        int ans=0;
        while (i<n)
        {
            String curr=commands.get(i);
            if(curr.equals("RIGHT"))
            {
                ans++;
            }
            else if(curr.equals("LEFT"))
            {
                ans--;
            }
            else if(curr.equals("UP"))
            {
                ans=ans-2;
            }
            else if(curr.equals("DOWN"))
            {
                ans=ans+2;
            }
            i++;
        }
        return ans;
    }
}