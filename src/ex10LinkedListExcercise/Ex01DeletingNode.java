package ex10LinkedListExcercise;

//237. Delete Node in a Linked List
//https://leetcode.com/problems/delete-node-in-a-linked-list/description/
public class Ex01DeletingNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public void deleteNode(ListNode node) {
	        // Publically defined fields can access them directly
	        while(node.next.next != null){ // traverse till second last
	            node.val = node.next.val;
	            node = node.next;

	        }
	        node.val = node.next.val;
	        node.next = null;
	    }
	 
	 // Suppose its a inner class inside LinkedList
	 private class ListNode {
		 private ListNode val;
		 private ListNode next;
	 }

}
