public class palindromeNum {
    public static int isPalindrome(int x){
        int originalNumber = x;
        int reversedNumber = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            x /= 10;
        }

        return reversedNumber;
    }
    public static void main(String[] args) {
        int x = -1223221;
        int res = isPalindrome(x);
        System.out.println(res);
    }
}
        // int left = 0;
        // int right = str.length() - 1;
        // while (left < right) {
        //     if (str.charAt(left) != str.charAt(right)) {
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;