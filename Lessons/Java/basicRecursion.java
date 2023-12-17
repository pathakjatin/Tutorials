import java.util.Scanner;
public class basicRecursion {
    
    // basic recursion

    // public static void printNum(int n){
    //     if (n>5) {
    //         return;
    //     }
    //     System.out.println(n);
    //     printNum(n+1);
    //     return;
    // }

    // To print sum of n natural numbers

    // public static void printSum(int n, int sum, int i){
    //     if (i==n) {
    //         sum += i;
    //         System.out.println("The sum of first " + n + " terms is : " + sum);
    //         return;
    //     }
    //     sum += i;
    //     printSum(n, sum, i+1);
    // }

    // To find factorial of n
        // does not works for n=0 
        
    public static void factorial(int n, int i, int fact){
        if (n==i) {
            fact *= i;
            System.out.println("The factorial of " + n + " is : " + fact);
            return;
        }
        fact *= i;
        factorial(n, i+1, fact);
        // System.out.println(i); // to keep a track on i
    }
    // another approach for finding factorial
    // public static int factorial(int n){
    // if(n==1 || n==0){
    // return 1;
    //}
    // int fact_nm1 = factorial(n-1);
    // int fact_n = n * fact_nm1;
    // return fact_n;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last term :");
        int n = sc.nextInt();
        factorial(n, 1, 1);
    }
}
