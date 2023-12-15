import java.util.Scanner;

public class sumOfOdd {
    public static void sumOdd(int n){
        int sum=0;
        for(int i=n; i>=1; i--){
            if (i%2!=0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of odd terms from 1 to " + n + " is : " + sum);
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter the last term :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOdd(n);
    }
}
// Prints sum of odd terms from 1 to n