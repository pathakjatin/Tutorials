class LL {
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        //constructor
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // add at first
    public void addFirst(String data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // add at last
    public void addLast(String data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }
    //print list
    public void printList(){  
        if (head == null) {
            System.out.println("List is empty");
        } 
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
    
        System.out.print("Null");
    }
    //Delete first
    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }
    //Delete last
    public void deleteLast(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlast = head;
        Node last = head.next;          //if head.next = null then last.next which becomes null.next is not possible
        while (last.next != null) {
            last = last.next;
            secondlast = secondlast.next;
        }

        secondlast.next = null;
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");
        list.printList();
        System.out.println();
        System.out.println(list.getSize() +" is the size of list");
    }
}
