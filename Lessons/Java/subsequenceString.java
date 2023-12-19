import java.util.HashSet;

public class subsequenceString {
    public static void subsequence(String str, int idx, String newStr, HashSet<String> set){
        if (idx==str.length()) {
            // for unique subsequences
            if (set.contains(newStr)) {
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currentChar = str.charAt(idx);
        // to be added in new string
        subsequence(str, idx+1, newStr+currentChar, set);
        
        //or not to be
        subsequence(str, idx+1, newStr, set);
    }
    public static void main(String[] args) {
        String str = "abcd";
        HashSet<String> set = new HashSet<> ();
        System.out.println("The subsequences are:");
        subsequence(str, 0, "", set);
    }
}
