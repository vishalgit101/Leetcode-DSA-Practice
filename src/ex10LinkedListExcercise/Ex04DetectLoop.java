package ex10LinkedListExcercise;

//141. Linked List Cycle
//https://leetcode.com/problems/linked-list-cycle/description/
public class Ex04DetectLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean hasCycle(ListNode head) {
	        /*// Using HashMap
	        HashMap<ListNode, Integer> map = new HashMap<>();
	        ListNode current = head;
	        //int index = 0;  //Not needed....
	        // Better to store freq or visited
	        while(current != null){
	            if(map.containsKey(current)){
	                return true;
	            }
	            map.put(current,1);
	            current = current.next;
	            //index++;
	        }
	        return false;*/
	        return hasCycle2(head);
	    }

	    // Without extra memory...
	    // Floyd’s cycle-finding algorithm or fast-slow method or TorotiseHare method; all three means same thing

	    public boolean hasCycle2(ListNode head){
	        ListNode slow = head; // moves one step
	        ListNode fast = head; // moves two steps
	        // There will always be collison and wont cross over watch striver
	        
	        while(fast != null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next.next;

	            /*if(slow.equals(fast)){ // bad time complexity 
	                return true;         // and .equals have to be overwritten, remember java Mooc.
	            }*/                      // It was over written in the api but cant be sure

	            if(slow == fast){
	                return true;
	            }
	        }
	        return false;
	    }
	 
	 // Suppose its a inner class inside LinkedList
	 private class ListNode {
		 private ListNode val;
		 private ListNode next;
	 }

}
