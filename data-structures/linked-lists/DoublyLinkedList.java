/**
 * Implementation of a Doubly Linked List using a dummy head node.
 * 
 * Supports operations such as:
 * - append
 * - prepend
 * - insert at position
 * - remove operations
 * - traversal
 * 
 * Each node maintains references to both next and previous nodes.
 *
 * @author Md Abul Kalam Azad
 */
public class DoublyLinkedList {
	
	// Sentinel node used to simplify insertion and deletion operations
	Node dummyHead;
	
	// Reference to the last node in the list
	Node tail;
	
	// Number of elements currently in the list
	int size;
	
	public DoublyLinkedList() {
		dummyHead = new Node();
		tail = dummyHead;
		size = 0;
	}
	
	public void append(int d) {
		Node newNode = new Node(d);
		if(size == 0) {
			dummyHead.next = newNode;
			newNode.prev = dummyHead;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}
	
	public void prepend(int d) {
		Node newNode = new Node(d);
		if(size == 0) {
			dummyHead.next = newNode;
			newNode.prev = dummyHead;
			tail = newNode;
		}
		else {
			newNode.next = dummyHead.next;
			dummyHead.next.prev = newNode;
			dummyHead.next = newNode;
			newNode.prev = dummyHead;
		}
		size++;
	}
	
	public void insertAtPosition(int pos, int d) {
		
		Node curr = dummyHead;
		if(pos < 0 || pos > size) {
			return;
		}
		else if(pos == 0) {
			prepend(d);
			return;
			
		}
		else if(pos == size) {
			append(d);
			return;
		}
		else {
			Node newNode = new Node(d);
			
			for(int i = 0; i < pos; i++) {
				curr = curr.next;
			}
			
			newNode.next = curr.next;
			curr.next.prev = newNode;
			curr.next = newNode;
			newNode.prev = curr;
			size++;
		}
		
	}
	
	public void removeFirst() {
		if(size == 0) {
			return;
		}
		else if(size == 1) {
			dummyHead.next = null;
			tail = dummyHead;
			size--;
		}
		else {
			dummyHead.next = dummyHead.next.next;
			dummyHead.next.prev = dummyHead;
			size--;
		}
	}
	
	public void removeLast() {
		if(size == 0) {
			return;
		}
		else if(size == 1) {
			dummyHead.next = null;
			tail = dummyHead;
			size--;
			return;
		}
		else {
			Node temp = tail;
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
		}
		size--;
	}
	
	public void removeAtPosition(int pos) {
		if(pos <= 0 || pos > size) {
			return;
		}
		else if(pos == 1) {
			removeFirst();
		}
		else if(pos == size) {
			removeLast();
		}
		else {
			Node curr = dummyHead;
			for(int i = 0; i < pos; i++) {
				curr = curr.next;	
			}
			
			Node n1 = curr.prev;
			Node n2 = curr.next;
      
			n1.next = n2;
			n2.prev = n1;
			
			curr.next = null;
			curr.prev = null;
			size--;
		}
	}
	
	public void printDLL() {
		if (size == 0) {
			System.out.println("The Doubly LinkedList is empty!");
			return;
		}
		Node curr = dummyHead.next;
		while(curr != null) {
			System.out.print(curr.data + " <=> ");
			curr = curr.next;
		}
		System.out.println("null");
		System.out.println("\nThe size of the Doubly LinkedList is: " + size);
	}
	
	public void getHead() {
		if (size == 0) {
			System.out.println("The list is empty.");
			return;
		}
		System.out.println("The head is: " + dummyHead.next.data);
	}
	
	public void getTail() {
		if (size == 0) {
			System.out.println("The list is empty.");
			return;
		}
		System.out.println("The tail is: " + tail.data);
	}

}
