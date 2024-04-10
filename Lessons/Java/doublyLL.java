public class doublyLL {

    // Node class to represent elements in the doubly linked list
    class Node {
        String data; // Data stored in the node
        Node prev;   // Reference to the previous node
        Node next;   // Reference to the next node

        // Constructor to initialize a node with data
        Node(String data) {
            this.data = data;
            this.prev = null; // Initialize previous node reference to null
            this.next = null; // Initialize next node reference to null
        }
    }

    // Head of the doubly linked list
    Node head;
    
    // Size of the doubly linked list
    int size;

    // Method to print the size of the doubly linked list
    public void printSize() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("The size of Doubly Linked List is : " + size);
    }

    // Method to print the elements of the doubly linked list
    public void printData() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.print("Null -> ");
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> "); // Print data of the current node
            currNode = currNode.next; // Move to the next node
        }
        System.out.println("Null");
    }

    // Method to add a new node with data to the beginning of the doubly linked list
    public void addFirst(String data) {
        Node newNode = new Node(data); // Create a new node with the given data
        size++; // Increase the size of the list
        if (head == null) {
            head = newNode; // If list is empty, set the new node as the head
            return;
        } else {
            newNode.next = head; // Set the next reference of the new node to the current head
            head.prev = newNode; // Set the previous reference of the current head to the new node
            head = newNode; // Update the head to the new node
        }
    }

    // Method to add a new node with data to the end of the doubly linked list
    public void addLast(String data) {
        Node newNode = new Node(data); // Create a new node with the given data
        size++; // Increase the size of the list
        if (head == null) {
            head = newNode; // If list is empty, set the new node as the head
            return;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next; // Traverse to the last node in the list
            }
            newNode.prev = currNode; // Set the previous reference of the new node to the current last node
            currNode.next = newNode; // Set the next reference of the current last node to the new node
            currNode = newNode; // Update the current node to the new node
        }
    }

    // Method to delete the first node of the doubly linked list
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked list is empty!");
            return;
        }

        head = head.next; // Move the head to the next node
        size--; // Decrease the size of the list
        if (head != null) {
            head.prev = null; // Update the previous reference of the new head to null
        }
    }

    // Method to delete the last node of the doubly linked list
    public void deleteLast() {
        if (head == null) {
            System.out.println("Linked list is empty!");
            return;
        } else if (head.next == null) {
            head = null; // If list has only one node, set head to null
            size--; // Decrease the size of the list
            return;
        } else {
            Node last = head.next;
            Node secondLast = head;

            while (last.next != null) {
                last = last.next; // Traverse to the last node in the list
                secondLast = secondLast.next; // Track the second last node
            }
            secondLast.next = null; // Set the next reference of the second last node to null
            last = null; // Remove the reference to the last node
            size--; // Decrease the size of the list
        }
    }

    // Main method to test the doubly linked list functionality
    public static void main(String[] args) {
        // Create a new instance of doublyLL class
        doublyLL l1 = new doublyLL();

        // Add elements to the doubly linked list
        l1.addFirst("Doubly");
        l1.addFirst("is");
        l1.addFirst("This");
        l1.addLast("Linked");
        l1.addLast("List");

        // Delete the last element from the doubly linked list
        l1.deleteLast();

        // Print the updated doubly linked list and its size
        l1.printData();
        l1.printSize();
    }
}
