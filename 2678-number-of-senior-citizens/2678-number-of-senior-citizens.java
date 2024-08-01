class Solution {
    public int countSeniors(String[] details)
    {
        int ans=0;
        for(int i=0;i<details.length;i++)
        {
            char a=details[i].charAt(11);
            char b=details[i].charAt(12);
            String str=""+a+b;
            int temp=Integer.parseInt(str);
            if(temp>60)
            {
                ans++;
            }
        }
        return ans;
    }
}