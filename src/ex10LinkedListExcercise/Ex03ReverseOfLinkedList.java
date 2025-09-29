package ex10LinkedListExcercise;
// 206. Reverse Linked List
// https://leetcode.com/problems/reverse-linked-list/description/
public class Ex03ReverseOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode reverseList(ListNode head) {
        /*ListNode current = head;
        ListNode prev = null;
        while(current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        
        // current is the new head
        return prev;*/

        return reverseList2(head);
    }

    // with recursion
    public ListNode reverseList2(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        return recursion(current, prev);
    }

    public static ListNode recursion(ListNode current, ListNode prev){
        // define base case...
        if(current == null){
            return prev;
        }

        // else;
        ListNode nextNode = current.next;
        current.next = prev;
        prev = current;
        current = nextNode;

        return recursion(current, prev);
    }
    
	 // Suppose its a inner class inside LinkedList
	 private class ListNode {
		 private ListNode val;
		 private ListNode next;
	 }

}
