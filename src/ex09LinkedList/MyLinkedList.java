package ex09LinkedList;

public class MyLinkedList {
	private Node head;
	private Node tail;
	private int size;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void insertAtBegining(Node newHead) { // Node: Data and Next-Node
		if(this.head == null) {
			this.head = newHead;
			this.tail = newHead;
		}else {
			Node temp = this.head; 				// Save current head
			this.head = newHead;   				// Update head to new node
			head.setNext(temp);	   				// Link new node to old head
		}
		this.size ++;
	}
	
	public void insertAtEnd(Node newTail) { // Node: Data and Next-Node
		if(this.head == null) {
			this.head = newTail;			
			this.tail = newTail;
		}else {
			this.tail.setNext(newTail);		// tail is also a Node: Data and Next-Node
			this.tail = newTail;
		}
		this.size ++;
	}
	
	public void deleteAtBegining() { // from the head
		if(head == null) {
			throw new RuntimeException("No node exits");
		}else if(head.getNext() == null) { // meaning only one node exits
			this.head = null;
			this.tail = null;
			this.size --;
		}else {
			this.head = this.head.getNext();
			this.size --;
		}
	}
	
	public void deleteAtEnd() { // tail is a Node: Data and Next-Node
		if(tail == null) {  // empty tail means no element in the list
			throw new RuntimeException("No node exits");
		}

		if(this.head.getNext() == null) { // meaning only one node exits
			this.head = null;
			this.tail = null;
			this.size --;
			return;
		}
		
		// Traverse the Singly ArrayList and modify the second last node
		Node current = this.head;
		
		while(current.getNext().getNext() !=null) { // will traverse till second last
			// or you could also do this: current.getNext() != tail
			current = current.getNext();
		}
		
		// Loop ends at second last node... so current will be second last node after loop ends
		current.setNext(null);
		tail = current;
		this.size --;
	}
	
	public void printLinkedList() {
		Node temp = this.head;
		while(temp != null) {
			System.out.println(temp.getData());
			Node next = temp.getNext();
			temp = next;	
		}
	}
	
	public int getSize() {
		return this.size;
	}
	
	public Node getHead() {
		return this.head;
	}
	

	
}
