package ex10LinkedListExcercise;

import java.util.*;

public class Ex10SortLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode sortList(ListNode head) {
        // Multiple ways... hashmap, arraylist, bucketing etc
        // We will do it  with bucketing 
        // Bucketing wont work as LL might contain -ve;
        // with bucketing could have done this in O(n) as well if it didnt contain -ve;

        

        // Trying Bucketing with ArraysSort that'll give as O(n log n)
        // Wont work either it contains ListNode not vals
       
       // Trying with HashMap <Integer, ListNode>
        //return sortLL(head);

        return sortLL2(head);
    }

    // This approach won't work with repeated values because of key conflicts in the HashMap.
    // A workaround would be using <Integer, List<ListNode>>, but that feels like overkill 
    // for a problem that can be solved much more easily.
    // However, this HashMap-based approach might be more useful for complex objects 
    // with multiple fields where grouping by a key makes sense.

    public static ListNode sortLL(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode current = head;
        while(current != null){
            map.put(current.val, current);
            current = current.next;
        }

        ArrayList<Integer> keyList = new ArrayList<>();

        for(Integer i: map.keySet()){
            keyList.add(i);
        }

        Collections.sort(keyList);

        // Now acess ListNodes using keyList
        for(int i = 0; i <keyList.size(); i++){
            Integer key = keyList.get(i);
            if(i == keyList.size() -1){
                map.get(key).next = null;
                break;
            }

            Integer nextKey = keyList.get(i+1);
            ListNode crr = map.get(key);
            if(crr != null){
                crr.next = map.get(nextKey);
            } 
        }

        return map.get(keyList.get(0));
  
    }

    // Trying just with ArrayLists
    public static ListNode sortLL2(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ArrayList<Integer> list = new ArrayList<>();

        ListNode current = head;
        while(current != null){
            list.add(current.val);
            current = current.next;
        }

        Collections.sort(list);
        //System.out.println(list);
        current = head;
        int i = 0;
        ListNode prev = head;
        while(current != null){ // stops as one before
            prev = current;
            current.val = list.get(i);
            current = current.next;
            i++;
        }

        prev.next = null;

        return head;
    }

    // With Merge sort in the LinkesList values...
    // Dont use Quick Sort much more tricker with LinkedLists...
    public static ListNode mergeSortLL(ListNode head){
    	return null;
    }
    
    // Suppose its a inner class inside LinkedList
	 private class ListNode {
		 private Integer val;
		 private ListNode next;
	 }

}
