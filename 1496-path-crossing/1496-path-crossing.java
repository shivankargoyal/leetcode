class Solution {
    public boolean isPathCrossing(String path)
    {
        int x=0;
        int y=0;
        HashSet<Pair<Integer,Integer>> hset=new HashSet<>();
        hset.add(new Pair<>(0,0));
        for(int i=0;i<path.length();i++)
        {
            char ch=path.charAt(i);
            if(ch=='N')
            {
                y++;
            }
            else if(ch=='S')
            {
                y--;
            }
            else if(ch=='E')
            {
                x++;
            }
            else if(ch=='W')
            {
                x--;
            }
            if(hset.contains(new Pair<>(x,y)))
            {
                return true;
            }
            hset.add(new Pair<>(x,y));
        }
        return false;
    }
}