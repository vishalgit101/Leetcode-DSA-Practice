package ex10LinkedListExcercise;

//876. Middle of the Linked List
// https://leetcode.com/problems/middle-of-the-linked-list/description/
public class Ex02MiddleOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode middleNode(ListNode head) {
        // already doing the zero based indexing so thats why size/2 works as the second
        // node after the middle
        int size = 0;
        ListNode current = head;
        while(current != null){
            current = current.next;
            size++;
        }

       int mid = size/2;

        // traverse the LL again...
        current = head;
        size = 0;
        while(size != mid){
            current = current.next;
            size++;
        }

        return current;
    }
	
	 // Suppose its a inner class inside LinkedList
	 private class ListNode {
		 private ListNode val;
		 private ListNode next;
	 }

}
