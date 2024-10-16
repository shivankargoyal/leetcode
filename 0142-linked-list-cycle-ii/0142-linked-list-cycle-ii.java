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
    public ListNode detectCycle(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }
        ListNode tost=head;
        ListNode hare=head;
        while(tost!=null && tost.next!=null)
        {
            
            hare=hare.next;
            tost=tost.next.next;
            if(hare==tost)
            {
                hare=head;
                while(hare!=tost)
                {
                    tost=tost.next;
                    hare=hare.next;
                }
                return hare;
            }
        }
        return null;
    }
}