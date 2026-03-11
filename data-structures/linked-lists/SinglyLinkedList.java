/**
 * Implementation of a Singly Linked List using a dummy head node.
 *
 * Features:
 * - Insert at beginning and end
 * - Insert at a specific position
 * - Remove first, last, or by position
 * - Reverse the list
 * - Print list contents
 * - Track head, tail, and size
 *
 * Design:
 * Uses a dummy head node to simplify insertion and deletion operations.
 *
 * Time Complexity:
 * Most operations run in O(1) or O(n) depending on traversal requirements.
 *
 * @author Md Abul Kalam Azad
 */
public class SinglyLinkedList {
	
	// Dummy head simplifies insertion and deletion logic
	private Node dummyHead;
	
	// Points to the last node for O(1) tail insertion
	private Node tail;
	
	// Number of elements in the list
	private int size;
	
	public SinglyLinkedList (){
		
		dummyHead = new Node();
		tail = dummyHead;
		size = 0;
	}
	
	/**
	 * Inserts a new node at the end of the list.
	 * Time Complexity: O(1)
	 */
	public void insertLast(int data) {
		Node newNode = new Node(data);
		
		if(size == 0) {
			dummyHead.next = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	/**
	 * Inserts a new node at the beginning of the list.
	 * Time Complexity: O(1)
	 */
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		
		if(size == 0) {
			dummyHead.next = newNode;
			tail = newNode;
		}
		else {
			newNode.next = dummyHead.next;
			dummyHead.next = newNode;
		}
		size++;
	}
	
	public void append(int data) {
		Node newNode = new Node(data);
		
		if(size == 0) {
			dummyHead.next = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
		
	}
	
	public void prepend(int data) {
		Node newNode = new Node(data);
		
		if(size == 0) {
			dummyHead.next = newNode;
			tail = newNode;
		}
		else {
			newNode.next = dummyHead.next;
			dummyHead.next = newNode;
			
		}
		size++;
	}
	
	public void removeFirst() {
		if(size == 0) {
			return;
		}
		
		Node temp = dummyHead.next;
		dummyHead.next = dummyHead.next.next;
		temp.next = null;
		size--;
		
		if(size == 0) {
			tail = dummyHead;
		}
	}
	
	public void removeFirstAnotherWay() {
		if(size == 0) {
			return;
		}
		else if(size == 1) {
			dummyHead.next=null;
			tail=dummyHead;
			size--;
		}
		else {
			dummyHead.next=dummyHead.next.next;
			size--; 
		}
	}
	
	/**
	 * Removes the last node from the list.
	 * Time Complexity: O(n)
	 */
	public void removeLast() {
		if(size == 0) {
			return;
		}
		else if(size == 1) {
			dummyHead.next = null;
			tail = dummyHead;
		}
		else{
			Node current = dummyHead;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
			tail = current;
			
		}
		size--;
	}
	
	/**
	 * Inserts a node at a specified position (0-based index).
	 * Time Complexity: O(n)
	 */
	
	// 0-based position
	public void insertAtPosition(int position, int data) {
		if(position < 0 || position > size) {
			return;
		}
		else if(position == 0) {
			prepend(data);
			return;
		}
		else if(position == size) {
			append(data);
			return;
			}
		
		Node newNode = new Node(data);
		Node current = dummyHead;
		for(int i=0; i<position; i++) {
			current = current.next;
			}
		
		newNode.next = current.next;
		current.next = newNode;
		size++;
		
	}
	
	// 0-based position
	public void removeAtPosition(int position) {
		if(position < 0 || position >= size) {
			return;
		}
		else if(position == 0) {
			removeFirst();
			return;
		}
		else if(position == size-1) {
			removeLast();
			return;
		}
		
		Node current = dummyHead;
		
		for(int i=0; i<position; i++) {
			current = current.next;
			}
		
		Node temp = current.next;
		current.next = current.next.next;
		temp.next = null;
		size--;
			
	}
  
  /**
  * Reverses the linked list in-place.
  * Time Complexity: O(n)
  * Space Complexity: O(1)
  */
	public void reverse() {
		if (size == 1) {
			return;
		}
		
		Node current = dummyHead.next;
		Node previous = null;
		Node nextNode = null;
		
		tail = current;
		
		while(current != null) {
			nextNode = current.next;
			current.next = previous;
			previous = current;
			current = nextNode;
		}
		
		dummyHead.next = previous;
		
		/*Node temp = dummyHead.next;
		dummyHead.next = tail;
		tail = temp;
		Node after = temp.next;
		Node before = null;
		for(int i=0; i<size; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}*/
	}
	
	public void printList() {
		if(dummyHead.next == null) {
			System.out.println("The list is empty!");
			return;
		}
		
		Node current = dummyHead.next;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
		System.out.println("Size: " + size);
	}
	
	public void getHead() {
		if(dummyHead.next == null) {
			System.out.println("The list is empty!");
			return;
		}
		System.out.println("Head: "+ dummyHead.next.data);
	}
	public void getTail() {
		if(size == 0) {
			System.out.println("The list is empty!");
      return;
		}
		System.out.println("Tail: "+ tail.data);
	}
	public int getSize() {
		return size;
	}

}
