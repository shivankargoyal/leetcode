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
    public ListNode deleteMiddle(ListNode head)
    {
        if(head==null)
        {
            return null;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode curr=head;

        int count=0;
        while(curr!=null)
        {
            curr=curr.next;
            count++;
        }
        int mid=count/2;
        // System.out.println(count+"  "+mid);
        curr=dummy;
        for(int i=0;i<mid;i++)
        {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return dummy.next;
    }
}