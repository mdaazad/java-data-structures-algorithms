# Linked Lists (Java)

This module contains implementations of **Linked List data structures in Java**.  
Both **Singly Linked Lists** and **Doubly Linked Lists** are implemented with common operations such as insertion, deletion, and traversal.

---

# Implementations

## 1. Singly Linked List

A **Singly Linked List** is a linear data structure where each node contains:

- data
- reference to the next node

Node → Node → Node → null


### Operations Implemented

- Insert at beginning
- Insert at end
- Insert at position
- Remove first node
- Remove last node
- Remove at position
- Reverse list
- Traverse / Print list

### Files
Node.java
SinglyLinkedList.java
SinglyLinkedListDemo.java


---

## 2. Doubly Linked List

A **Doubly Linked List** stores references to both:

- next node
- previous node

This allows traversal in **both directions**.

null ← Node ⇄ Node ⇄ Node → null


### Operations Implemented

- Append
- Prepend
- Insert at position
- Remove first node
- Remove last node
- Remove at position
- Traverse / Print list

### Files
DoublyLinkedList.java
DoublyLinkedListDemo.java


---

# Time Complexity

| Operation | Singly LL | Doubly LL |
|-----------|-----------|-----------|
| Insert at head | O(1) | O(1) |
| Insert at tail | O(n) | O(1) (with tail pointer) |
| Delete head | O(1) | O(1) |
| Delete tail | O(n) | O(1) |
| Search | O(n) | O(n) |

---

## Author

**Md Abul Kalam Azad**

Computer Science Student  
Queens College (CUNY)
