class Solution {
    public String[] sortPeople(String[] names, int[] heights)
    {
        int n=names.length;
        int i=0;
        String[] str=new String[n];
        HashMap<Integer,String> hmap=new HashMap<>();
        while(i<n)
        {
            hmap.put(heights[i],names[i]);
            i++;
        }
        i=n;
        Arrays.sort(heights);
        for ( i = 0; i < n; i++) {
            str[i] = hmap.get(heights[n - i - 1]); 
        }
        return str;
    }
}