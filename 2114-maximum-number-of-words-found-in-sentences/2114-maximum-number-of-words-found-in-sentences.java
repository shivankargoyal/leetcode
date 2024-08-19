class Solution
{
    public int mostWordsFound(String[] sens)
    {
        int i=0;
        int count=0;
        while(i<sens.length)
        {
            String strr=sens[i];
            String []arr=strr.split(" ");
            if(count<arr.length)
            {
                count=arr.length;
            }
            i++;
        }
        return count;
    }
}