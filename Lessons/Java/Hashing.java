import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();// same syntax as arraylist
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(-1);
        // contains
        if (set.contains(1)) {
            System.out.println("set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("set does not contains 6");
        }
        //remove
        set.remove(3);
        if (!set.contains(3)) {
            System.out.println("3 was deleted from set");
        }
        System.out.println("size of set is : " + set.size());
        System.out.println(set);
        //iterator
        Iterator it = set.iterator();
        //hasNext , next
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
