package ex09DoublyLinkedList;

public class DoublyLinkedList {

	// Outer class variables
	private Node head;
	private Node tail;
	private int size;
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	// Inner class Node...
	private class Node {
		private Node back;
		private Node next;
		private int data;
		
		public Node(int data) {
			this.back = null;
			this.next = null;
			this.data = data;
		}

		public Node getBack() {
			return back;
		}

		public void setBack(Node back) {
			this.back = back;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
		
	}
	
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		// empty DLL
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			this.size ++;
			return;
		}
		
		// if head already exists...
		this.head.back = newNode;
		newNode.next = this.head;
		this.head = newNode;
		this.size++;
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		// Empty DLL
		if(this.tail == null) {
			this.head = newNode;
			this.tail = newNode;
			this.size++;
			return;
		}
		
		newNode.back = this.tail;
		this.tail.next = newNode;
		this.tail = newNode;
		this.size++;
		
	}
	
	public void deleteAtBeginning() {
		// empty
		if(this.head == null) {
			throw new RuntimeException("No node exists");
		}
		
		//Only one node exists
		if(this.head.next == null) { // or this.head == this.tail
			this.head = null;
			this.tail = null;
			size--;
			return;
		}
		
		// multiple nodes exists
		this.head = this.head.next;
		this.head.back = null;
		this.size--;
	}
	
	public void deletetAtEnd() {
		// Empty
		if(this.tail == null) {
			throw new RuntimeException("No node exists");
		}
		
		// one node exists
		// or this.head == this.tail
		if(this.head.next == null) { // tail is always null so use head to check if only one Node is present
			this.head = null;
			this.tail = null;
			this.size--;
			return;
		}
		
		//for multiple nodes
		Node back = this.tail.back;
		back.next = null;
		this.tail = back;
		this.size--;
	}
	
	public void printForward() {
		// While traversing do not tamper the original head
		Node temp = this.head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void printBackward() {
		// While traversing do not tamper the original tail
		Node temp = this.tail;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.back;;
		}
		System.out.println();
	}
	
	public void reverse() {
		//Node tempHead = this.head;
		Node tempTail = this.tail;
		while(tempTail != null) {
			
			Node temp = tempTail.next;
			Node bk = tempTail.back;
			tempTail.next = tempTail.back;
			tempTail.back = temp;
			
			tempTail = bk;	
		}
		
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

	}
	
	// just swap the next with back and back with next

}
