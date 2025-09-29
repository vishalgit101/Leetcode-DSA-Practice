package ex09DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9};
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		
		for(int i: arr) {
			doublyLinkedList.insertAtEnd(i);
		}
		
		//doublyLinkedList.printBackward();
		//doublyLinkedList.printForward();
		doublyLinkedList.reverse();
		doublyLinkedList.printForward();
		doublyLinkedList.printBackward();
	}

}
