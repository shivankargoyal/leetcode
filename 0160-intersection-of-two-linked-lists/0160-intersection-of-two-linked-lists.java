/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        int lenA=leng(headA);
        int lenB=leng(headB);
        ListNode f1=null,f2=null;
        if(lenA<=lenB)
        {
            f1=headA;
            f2=headB;
            for(int i=0;i<lenB-lenA;i++)
            {
                f2=f2.next;
            }
        }
        else if(lenB<lenA)
        {
            f1=headA;
            f2=headB;
            for(int i=0;i<lenA-lenB;i++)
            {
                f1=f1.next;
            }
        }
        while(f1!=null)
        {
            if(f1==f2)
            {
                return f1;
            }
            else
            {
                f1=f1.next;
                f2=f2.next;
            }
        }
        return null;
    }
    private int leng(ListNode head)
    {
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        return count;
    }
}