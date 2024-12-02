public class ValidPalindrome {

    public static boolean isPalindrome(String s){
        StringBuilder normalized = new StringBuilder();
        // String str = s.toLowerCase().toCharArray();
        if(s.isEmpty()){
            return true;
        }
        for(char c : s.toLowerCase().toCharArray()){
            if (Character.isLetterOrDigit(c)) {
                normalized.append(c);
            }
        }
        int start = 0;
        int rear = normalized.length()-1;
        while(start<rear){
            if (normalized.charAt(start) != normalized.charAt(rear)) {
                return false;
            }
            start++;
            rear--;
        }


        return true;
    }
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
    }
}
