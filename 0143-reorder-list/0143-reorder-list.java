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
class Solution
{
    public void reorderList(ListNode head)
    {
        int length=count(head);
        if(head==null || head.next==null)
        {
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=reversed(slow.next);
        slow.next=null;
        ListNode first=head;
        while(rev!=null)
        {
            ListNode t1=first.next;
            ListNode t2=rev.next;

            first.next=rev;
            rev.next=t1;

            first=t1;
            rev=t2;
        }

    }
    private int count(ListNode head)
    {
        int len=0;
        while(head!=null)
        {
            len++;
            head=head.next;
        }
        return len;
    }
    private ListNode reversed(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}