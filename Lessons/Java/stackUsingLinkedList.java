public class stackUsingLinkedList {
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack {
        public static Node head;
        public  boolean isEmpty(){
            return head == null;
        }
        public void push(int data){
            Node newNode = new Node(data); 
            if (isEmpty()) {
                head = newNode;
                return;
            }else{
                newNode.next = head;
                head = newNode;
            }
        }
        public int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            // int peekElem = head.data;
            // return peekElem;
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}