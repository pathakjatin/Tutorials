import java.util.Scanner;

public class powerUsingRecursion {

    public static int power(int x, int n){
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        // stack height = n
        // int xPownm1 = power(x, n-1);
        // int xPown = x * xPownm1;
        // return xPown;

        // stack height = log_2 n; ( log n to the base 2)
        if (n%2==0) {
            return power(x, n/2) * power(x, n/2);
        }else {
            return power(x, n/2) * power(x, n/2) *x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers x and n to calculate x^n :");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = power(x,n);
        System.out.println("" + x + "^" + n + " = " + result);
    }
}
