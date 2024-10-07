/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head)
    {
        List<Integer> list1=new ArrayList<>();
        while(head!=null)
        {
            list1.add(head.val);
            head=head.next;
        }
        int left=0;
        int right= list1.size()-1;
        while(left<=right)
        {
            if(list1.get(left)==list1.get(right))
            {
                left++;
                right--;
            }
            else
            {
                break;
            }
        }
        return left>=right;
    }
}