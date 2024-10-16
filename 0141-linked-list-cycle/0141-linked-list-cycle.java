/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return false;
        }
        ListNode tost=head;
        ListNode hare=head;
        while(hare!=null)
        {
            if(hare==tost)
            {
                return true;
            }
            hare=hare.next;
            tost=tost.next.next;
        }
        return false;
    }
}