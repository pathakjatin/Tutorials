public class ReverseNumber {

    public static int reversed(int x){

        int number = Math.abs(x);
        int reversedNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        if(x < 0){
            int negaReversed = -reversedNumber;
            return negaReversed;
        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reversed(x));
    }

}
