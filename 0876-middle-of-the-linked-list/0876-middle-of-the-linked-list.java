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
        // int count=0;
        // ListNode curr=head;
        // while(curr!=null)
        // {
        //     count++;
        //     curr=curr.next;
        // }
        // int mid=count/2;
        // curr=head;
        // count=0;
        // while(count<mid)
        // {
        //     count++;
        //     curr=curr.next;
        // }
        // ListNode middle=curr;
        // return middle;
        if(head==null)
        {
            return null;
        }
        ListNode tost=head;
        ListNode hare=head;
        while(hare!=null && hare.next!=null)
        {
            tost=tost.next;
            hare=hare.next.next;
        }
        return tost;
    }
}