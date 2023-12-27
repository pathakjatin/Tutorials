import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();

        // add elements
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);
        
        // get elements
        int x = list.get(0);
        System.out.println(x);
        
        // add in between
        list.add(1, 3);
        System.out.println(list);
        
        // set elem
        list.set(0, 5);
        System.out.println(list);
        
        //delete elem
        list.remove(3);
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println(size);

        //for loop
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //sort
        Collections.sort(list);
        System.out.println(list);
    }
}
