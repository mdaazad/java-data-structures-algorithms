/**
 * Demonstrates basic operations of the DoublyLinkedList implementation.
 */
public class DoublyLinkedListDemo {
	
	public static void main(String[] args) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.append(50);
		list.append(60);
		list.append(70);
		list.append(80);
		list.append(300);
		list.append(200);
			
		list.prepend(500);
		list.prepend(600);
		list.prepend(40);
		list.prepend(30);
		list.prepend(20);
		list.prepend(10);
			
		list.removeFirst();
			
		list.removeLast();
			
		list.insertAtPosition(8, 90);
		list.insertAtPosition(9, 100);
			
		list.removeAtPosition(1);
		list.removeAtPosition(3);
			
		System.out.println("Final Doubly Linked List:");	
		list.printDLL();
		list.getHead();
		list.getTail();
		}
	}
