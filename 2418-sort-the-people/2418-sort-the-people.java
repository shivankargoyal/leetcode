class Solution {
    public String[] sortPeople(String[] names, int[] heights)
    {
        String [] arr=new String[names.length];
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int index=0;
        for(int i=names.length-1;i>=0;i--)
        {
            // System.out.println(map.get(heights[i]));
            arr[index]=map.get(heights[i]);
            index++;
        }
        return arr;
    }
}