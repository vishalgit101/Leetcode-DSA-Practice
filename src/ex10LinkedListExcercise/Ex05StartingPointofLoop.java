package ex10LinkedListExcercise;

import java.util.HashMap;

// 142. Linked List Cycle II
// https://leetcode.com/problems/linked-list-cycle-ii/description/
public class Ex05StartingPointofLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode detectCycle(ListNode head) {
	       // return detectCycle3(head);
	       return detectCycle2(head);
	    }

	    // Two Pointer Torotise and Hare: optimised
	    public static ListNode detectCycle2(ListNode head){
	        ListNode slow = head;
	        ListNode fast = head;
	        ListNode collision = null;
	        while(fast !=null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next.next; 
	            if(slow==fast){
	                collision = fast;
	                break; // important otherwise it will never exit the loop.
	            }
	        }

	        if(collision == null) return null;

	        // Again Traverse but this time both fast and slow by one point;

	        fast = collision;
	        slow = head;

	        while(true){
	            if( slow == fast){ // make sure to check first
	                return fast;
	            }
	            slow = slow.next;
	            fast = fast.next;
	        }  
	    }

	    // HashMap O(n) space solution...
	    public static ListNode detectCycle3(ListNode head){
	        HashMap<ListNode, Integer> map = new HashMap<>();
	        ListNode current = head;
	        while(current != null){
	            if(map.containsKey(current)){
	                return current;
	            }
	            map.put(current, 1);
	            current = current.next;
	        } 

	        return null;
	    }
	 // Suppose its a inner class inside LinkedList
	 private class ListNode {
		 private ListNode val;
		 private ListNode next;
	 }

}
