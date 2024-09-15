class Solution
{
    public int maxProfit(int[] price)
    {
        int last=price[0];
        int ans=0;
        for(int i=1;i<price.length;i++)
        {
            int profit=price[i]-last;
            if(profit>ans)
            {
                ans=profit;
            }
            last=Math.min(last,price[i]);
        }
        return ans;
    }
}

// class Solution {
//     public int maxProfit(int[] price)
//     {
//         int curr=0;
//         int last=0;
//         int maxx=0;
//         for(int i=0;i<price.length;i++)
//         {
//             last=price[i];
//             for(int j=i;j<price.length;j++)
//             {
//                 curr=price[j];
//                 if(curr-last>maxx)
//                 {
//                     maxx=curr-last;
//                 }
//             }
//         }
//         return maxx;
//     }
// }