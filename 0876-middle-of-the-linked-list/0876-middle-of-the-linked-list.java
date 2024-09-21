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
    public ListNode middleNode(ListNode head)
    {
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        // System.out.println(count);
        count=count/2;
        ListNode midd=null;
        int i=0;
        while(i!=count)
        {
            head=head.next;
            i++;
        }
        midd=head;
        return midd;
    }
}