import java.util.Scanner; 

public class factorial {
    public static void calculateFactorial(int n){
        int fact = 1;
        if (n<0) {
            System.out.println("Invalid number!");
            return;
        }
        for(int i=n; i>=1; i--){
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is : " + fact);
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);
    }
}
