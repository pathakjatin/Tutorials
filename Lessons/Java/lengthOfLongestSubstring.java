import java.util.HashSet;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {

        String s = "dvdf";
        int len = 0;
        int l = 0;
        HashSet<Character> set = new HashSet<>();
        for(int r = 0; r<s.length(); r++){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                len = Math.max(len, r-l+1);
            }else{
                while (set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(r));
            }
        }
        System.out.println(len);
    }
}
