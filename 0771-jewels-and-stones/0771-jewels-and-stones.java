class Solution
{
    public int numJewelsInStones(String jewels, String stones)
    {
        int count=0;
        String []arr=jewels.split("");
        for(int i=0;i<stones.length();i++)
        {
            char ch=stones.charAt(i);
            for(int j=0;j<arr.length;j++)
            {
                // System.out.println("in second for loop "+arr[j]+"  "+Character.toString(ch));
                if(arr[j].equals(Character.toString(ch)))
                {
                    // System.out.println("in if loop "+arr[j]);
                    count++;
                }
            }
        }
        return count;
    }
}