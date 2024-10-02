class Solution
{
    public int[] arrayRankTransform(int[] arr)
    {
        int[] rank=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            rank[i]=arr[i];
        }
        Arrays.sort(rank);
        int ranks=1;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!hmap.containsKey(rank[i]))
            {
                hmap.put(rank[i],ranks);
                ranks++;
            }
        }
        for(int i=0;i<rank.length;i++)
        {
            arr[i]=hmap.get(arr[i]);
        }
        return arr;
    }
}