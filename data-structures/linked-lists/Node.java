/**
 * Represents a node used in linked list data structures.
 *
 * This node supports both:
 * - Singly Linked Lists (uses the next reference)
 * - Doubly Linked Lists (uses both next and prev references)
 *
 * Each node stores an integer value and references to neighboring nodes.
 *
 * Fields:
 * data : the value stored in the node
 * next : reference to the next node in the list
 * prev : reference to the previous node (used in doubly linked lists)
 *
 * @author Md Abul Kalam Azad
 */
public class Node {
	
	int data;
    Node next;
    Node prev;

    /**
     * Default constructor.
     * Initializes a node with value 0 and null references.
     */
    public Node() {
        this(0);
    }

    /**
     * Creates a node with the specified data value.
     *
     * @param data value to store in the node
     */
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
	
}
