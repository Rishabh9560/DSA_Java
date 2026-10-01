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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0 ;
        ListNode tempA = headA;
        ListNode tempB = headB ;
        while(tempA != null){
            countA++ ; 
            tempA = tempA.next ;
        }
         int countB = 0 ;
        while(tempB != null){
            countB++ ; 
            tempB = tempB.next ;
        }
        tempA = headA ;
        tempB = headB ;
        if(countA > countB){
            int steps = countA-countB ;
            for(int i= 1 ; i<=steps ;i++){
                tempA = tempA.next ;
            }
        }else{
            int steps = countB-countA ;
            for(int i= 1 ; i<=steps ;i++){
                tempB = tempB.next ;
            }
        }
        
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next ;
        }
        return tempA;
    }
}