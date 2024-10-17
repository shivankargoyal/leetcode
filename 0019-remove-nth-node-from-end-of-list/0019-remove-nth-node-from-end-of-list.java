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
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        if(head==null)
        {
            return head;
        }
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }

        count=count-n;
        // System.out.println(count);
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        curr=dummy;
        for(int i=0;i<count;i++)
        {
            curr=curr.next;
        }

        curr.next=curr.next.next;
        return dummy.next;
    }
}