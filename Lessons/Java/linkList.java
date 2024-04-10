public class linkList {

    Node head;
    int size;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addStart(String data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }else{           
            newNode.next = head;
            head = newNode;
        }
    }

    public void addEnd(String data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }else{
            Node newHead = head;
            while (newHead.next!= null) {
                newHead = newHead.next;
            }
            newHead.next = newNode;
        }
    }

    public void printData(){
        if (head == null) {
            System.out.println("List is empty!");
        }
        Node newHead = head;
        
        while (newHead != null) {
            System.out.print(newHead.data + " -> ");
            newHead = newHead.next;
        }
        System.out.print("Null");
    }

    public void deleteStart(){
        if (head == null) {
            System.out.println("List is empty!");
        }else{
            head = head.next;
            size--;
        }
    }

    public void deleteEnd(){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        else{
            Node secondLast = head;
            Node last = head.next;
            while (last.next != null) {
                last = last.next;
                secondLast = secondLast.next;
            }
            secondLast.next = null;
            last = null;
        }    
    }
    public void printSize(){
        System.out.println("The size of list is : " + size);
    }
    public void printHead(){

        System.out.println("the head is : " + head.data);
    }
    public static void main(String[] args) {
        linkList l1 = new linkList();
    }
}
