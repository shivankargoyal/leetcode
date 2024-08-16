// class Solution {
//     public char findTheDifference(String s, String t)
//     {
//         char ans='s';
//         Stack<Character> stk=new Stack<>();
//         for(int i=t.length()-1;i>=0;i--)
//         {
//             stk.push(t.charAt(i));
//         }
//         for(int i=0;i<s.length();i++)
//         {
//             stk.pop();
//         }
//         ans=stk.pop();
//         return ans;
        
//     }
// }

class Solution
{
    public char findTheDifference(String s, String t)
    {
        int n = s.length();
        int sum = t.charAt(n);
        for(int i=0;i<n;i++)
        {
            // System.out.println(sum);
            sum+=t.charAt(i)-s.charAt(i);
        }
        return (char)sum;
    }
}