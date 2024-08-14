class Solution {
    public String sortSentence(String s)
    {
        String [] arr=s.split(" ");
        Map<Integer,String> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            String temp=arr[i];
            String str="";
            int n=0;
            for(int j=0;j<temp.length();j++)
            {
                char a=temp.charAt(j);
                if(Character.isDigit(a))
                {
                    String ss=""+a;
                    n=Integer.parseInt(ss);
                }
                else
                {
                    str=str+a;
                }
            }
            hmap.put(n,str);
        }
        // for (Map.Entry<String, Integer> entry : hmap.entrySet())
        // {
        //     System.out.println(entry.getKey() + " = " + entry.getValue());
        // }
        ArrayList<Integer> que=new ArrayList<>(hmap.keySet());
        Collections.sort(que);
        StringBuilder f=new StringBuilder();
        for(Integer key:que)
        {
            f.append(hmap.get(key)).append(" ");
        }
        String finalSentence = f.toString().trim();
        return finalSentence;
    }
}