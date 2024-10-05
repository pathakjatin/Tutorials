import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        //country , population
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);
        // System.out.println(map);

        map.put("China", 180);
        // System.out.println(map);

        //search
        if(map.containsKey("russia")){
            System.out.println("key exists in map");
        }else{
            System.out.println("key doesn't exist in map");
        }

        System.out.println(map.get("China")); //key exists
        System.out.println(map.get("Russia")); //key doesn't exists

        // int arr[] = {12,15,18};
        // for(int val : arr){
        //     System.out.print(val + " ");
        // }

        for( Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " : ");
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " : " + map.get(key));
        }

        map.remove("China");
        System.out.println(map);
    }
}
