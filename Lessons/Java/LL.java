class LL {
    Node head;  // Head of the linked list
    private int size;  // Size of the linked list

    // Constructor to initialize an empty linked list
    LL(){
        this.size = 0;
    }

    // Node class represents each element in the linked list
    class Node{
        String data;  // Data of the node
        Node next;    // Reference to the next node

        // Constructor to create a new node with the given data
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node at the beginning of the linked list
    public void addFirst(String data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            // If the list is empty, the new node becomes the head
            head = newNode;
            return;
        }
        // If the list is not empty, update references to include the new node
        newNode.next = head;
        head = newNode;
    }

    // Method to add a new node at the end of the linked list
    public void addLast(String data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            // If the list is empty, the new node becomes the head
            head = newNode;
            return;
        }
        // If the list is not empty, traverse to the end and add the new node
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Method to print the elements of the linked list
    public void printList(){  
        if (head == null) {
            // If the list is empty, print a message
            System.out.println("List is empty");
        } 
        // If the list is not empty, traverse and print each element
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    // Method to delete the first node in the linked list
    public void deleteFirst(){
        if (head == null) {
            // If the list is empty, print a message
            System.out.println("List is empty");
            return;
        }
        // If the list is not empty, update the head to the next node
        head = head.next;
        size--;
    }

    // Method to delete the last node in the linked list
    public void deleteLast(){
        if (head == null) {
            // If the list is empty, print a message
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            // If there is only one node in the list, set head to null
            head = null;
            return;
        }
        // If there are multiple nodes, traverse to the second last and update references
        Node secondlast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    // Method to get the size of the linked list
    public int getSize(){
        return size;
    }

    // Method to reverse the linked list using iterative approach
    public void reverseIterate(){
        if (head == null || head.next == null) {
            // If the list is empty or has only one node, no need to reverse
            return;
        }
        // If the list has more than one node, reverse it iteratively
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            // Update pointers
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }

    // Method to reverse the linked list using recursive approach
    public Node reverseRecursion(Node head){
        if (head == null || head.next == null) {
            // If the list is empty or has only one node, return the current head
            return head;
        }
        // If the list has more than one node, reverse it recursively
        Node newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // Main method to test the linked list implementation
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("3");
        list.addFirst("2");
        list.addLast("4");
        list.addFirst("1");
        list.printList();
        System.out.println();
        System.out.println(list.getSize() +" is the size of list");
        // Uncomment to test iterative reversal
        // list.reverseIterate();
        // Uncomment to test recursive reversal
        list.head = list.reverseRecursion(list.head);
        System.out.println("Reversed Linked List :");
        list.printList();
    }
}
