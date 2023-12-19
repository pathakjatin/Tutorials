public class duplicateString {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx,  String newStr){
        if (idx==str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(idx);
        if (map[currentChar-'a'] == true) {
            removeDuplicates(str, idx+1, newStr);
        }else{
            newStr += currentChar;
            map[currentChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr);
        }
    }

    public static void main(String[] args){
        String str = "abbccdaefddfe";
        removeDuplicates(str, 0, "");
    }
}
