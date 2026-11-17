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
    public boolean hasCycle(ListNode head) {

        ListNode Fast = head ; 
        ListNode slow = head ;

        while(Fast!= null && Fast.next != null){
            slow = slow.next ;
            Fast = Fast.next.next;
        

        if(slow == Fast){
            return true ;
        }
        }
        return false ;
    }
    
}




