/**
 * Represents a node in a singly linked list.
 * Each node stores an integer value and a reference to the next node.
 *
 * @author Md Abul Kalam Azad
 */
public class Node {
	
	int data;
	Node next;
	
	//Default Constructor
	public Node() {
		this.data = 0;
		this.next = null;
	}
	
	//constructor with data
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	

}
