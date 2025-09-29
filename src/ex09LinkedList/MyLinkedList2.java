package ex09LinkedList;

public class MyLinkedList2 { // LinkedList with non-static Inner Node Class
	// Outer Class private fields
	private Node2 head;
	private Node2 tail;
	private int size;
	
	public MyLinkedList2() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	// Inner Private Class with fields...
	private class Node2 {
		private int data;
		private Node2 next;
		
		private Node2(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node2 getNext() {
			return next;
		}

		public void setNext(Node2 next) {
			this.next = next;
		}
		
		
	}
	
	public void insertAtBeginning(int data) {
		Node2 node = new Node2(data);
		
		if(this.head == null) {
			this.head = node;
			this.tail = node;
		}else {
			Node2 temp = this.head;
			this.head = node;
			node.setNext(temp);
		}
		
		this.size++;
	}
	
	public void insertAtEnd(int data) {
		
		Node2 node = new Node2(data);
		
		if(tail == null) { // or Head == null... meanings no exits and we are inserting first node
			this.head = node;
			this.tail = node;
		}else {
			this.tail.setNext(node); // current tail's next is being set as the newNode as a pointer to new end
			this.tail = node; 		// now making the tail as the newNode, i.e setting new end	
		}
		
		this.size++;
		
	}
	
	public void deleteAtBeginning() {
		if(this.head == null) { // No node exists
			throw new RuntimeException("No node exits");
		}
		
		if(this.head.getNext() == null) { // meaning only one node exists
			this.head = null;
			this.tail = null;
			size--;
			return;
		}
		
		// Multiple Node exists
		// delete the head and set the original head's next as the current head
		Node2 temp = this.head.getNext();
		this.head = temp;
		size--;
	}
	
	public void deleteAtEnd() {
		if(this.tail == null) {
			throw new RuntimeException("No node exists");
		}
		
		if(this.head.getNext() == null) { // only one node exists
			this.head = null;
			this.tail = null;
			size--;
			return;
		}
		
		// MultiNode exists
		Node2 current = this.head;
		
		while(current.getNext().getNext() != null) { // stopping the loop at second last
			// could also use current.getNext() != tail;
			current = current.getNext();
		}
		
		// After loops end current will be at second last
		current.setNext(null);
		this.tail = current; // setting the tail to second last
		size--;
	}
	
	public void printLinkedList() {
		Node2 current = this.head;
		
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	// With for loop
	/*public void printLinkedList() {
    for (Node2 current = head; current != null; current = current.getNext()) {
        System.out.println(current.getData());
    }
}
*/
	
	public int getSize() {
	    return size;
	}
	
	
	// Delete specific node...
	public void deleteNode(Node2 node) {
		// Traverse and Match
		
		Node2 current = this.head;
	}
	
	// search an element
	public boolean search(int element) {
		Node2 temp = this.head;
		
		
		while(temp != null) {
			if(temp.getData() == element) {
				return true;
			}
			
			temp = temp.next;
		}
		
		return false;
	}
	

	
}
