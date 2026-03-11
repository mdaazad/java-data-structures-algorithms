/**
 * Demonstrates usage of the SinglyLinkedList implementation.
 *
 * Operations demonstrated:
 * - insertFirst
 * - insertLast
 * - insertAtPosition
 * - reverse
 * - printList
 * - getHead
 * - getTail
 *
 * This class serves as a simple test driver for the linked list.
 *
 * @author Md Abul Kalam Azad
 */
public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		// Insert elements
		list.insertLast(60);
		list.insertLast(70);
		list.insertLast(75);
		list.insertLast(85);
		
		list.insertFirst(50);
		list.insertFirst(25);
		list.insertFirst(35);
		list.insertFirst(45);
		
		list.insertAtPosition(1, 100);
		list.insertAtPosition(2, 15);
		
		// Removal operations
		list.removeLast();
		list.removeFirst();
		
		list.removeFirstAnotherWay();
		
		list.removeAtPosition(3);
		
		list.printList();
		
		list.reverse();
		
		
		list.printList();
		list.getHead();
		list.getTail();
	}

}
