package ex09LinkedList;

public class Node {
	
	private int data;
	private Node next;
	
	public Node(int data) { // Constructor
		this.data = data;
		this.next = null;
	}
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	public int getData() {
		return this.data;
	}
	
	public Node getNext() {
		return this.next;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
