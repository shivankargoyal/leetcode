// class Solution
// {
//     public int removeDuplicates(int[] nums)
//     {
//         int[] arr=new int[nums.length];
//         int count=0,j=0,k=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             int temp=nums[k];
//             if(nums[i]==nums[k] && count !=2)
//             {
//                 arr[i]=nums[k];
//                 k++;
//                 count++;
//             }
//             else
//             {
//                 count=0;
//                 k++;
//                 continue;
//             }
//         }
//         int len=arr.length;
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]+" ,");
//         }
//         // int len=0;
//         // for(int i=0;i<nums.length;i++)
//         // {
//         //     if(arr[i]!=0)
//         //     {
//         //         len++;
//         //     }
//         //     else
//         //     {
//         //         break;
//         //     }
//         // }
//         return len;


//             // for(int i=0;i<nums.length;i++)
//             // {
//             //     if(count!=2)
//             //     {
//             //         arr[i]=nums[j];
//             //         j++;

//             //     }
//             // }
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {
       int count =0;
            for (final int num : nums){
                if(count < 2 || num > nums[count-2] ){
                    nums[count++] = num;
                }
            }
    return count; 
    }
}