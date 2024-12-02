import java.util.*;
public class RomanToInteger {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        String s = "MCMXCIV";
        int ans = 0;
        for(int i = s.length()-1; i>=0; i--){
            // System.out.print(s.charAt(i));
            int curr = map.get(String.valueOf(s.charAt(i)));
            if(i < s.length() - 1 && curr < map.get(String.valueOf(s.charAt(i + 1)))){
                ans -= map.get(String.valueOf(s.charAt(i)));
            }else{
                ans += map.get(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(ans);
    }
}
