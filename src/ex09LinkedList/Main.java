package ex09LinkedList;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9};
		
		MyLinkedList2 linkedList = new MyLinkedList2();
		
		for(int i: arr) {
			linkedList.insertAtEnd(i);
		}
		
		//linkedList.printLinkedList();
		
		linkedList.insertAtBeginning(0);
		
		linkedList.insertAtEnd(11);
		
		linkedList.deleteAtBeginning();
		
		linkedList.deleteAtEnd();
		
		linkedList.printLinkedList();
		
		// delete specific node..
		
		//search a specific element
		
		System.out.println(linkedList.search(8));

	}

}
