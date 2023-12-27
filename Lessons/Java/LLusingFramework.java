import java.util.*;

public class LLusingFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("Linked");
        list.add("List");
        list.addFirst("This");
        System.out.println(list);
        System.out.println(list.size() + " is the size of list");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        System.out.println(list);
    }
}
