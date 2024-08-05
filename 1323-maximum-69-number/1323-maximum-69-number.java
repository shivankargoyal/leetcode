class Solution
{
    public int maximum69Number (int num)
    {
        String neww=Integer.toString(num);
        int index=neww.indexOf('6');
        if(index!=-1)
        {
            String ans=neww.substring(0,index)+ '9' + neww.substring(index + 1);
            return Integer.parseInt(ans);
        }
        return num;
    }
}


//     public int reverse(int num)
//     {
//         String temp=Integer.toString(num);
//         String rev="";
//         for(int i=0;i<temp.length();i++)
//         {
//             rev=temp.charAt(i)+rev;
//         }
//         num=Integer.parseInt(rev);
//         return num;
//     }
//     public int maximum69Number (int num)
//     {
//         int rev=reverse(num);
//         for(int i=0;i<)
//     }
// }