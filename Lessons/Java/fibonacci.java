import java.util.Scanner;

public class fibonacci {
    public static void fibo(int n){
        // if user enters 0 number of terms
        if(n==0){
            System.out.println("0");
            return;
        }
        // if user enters 1 number of terms
        else if(n==1){
            System.out.println("1");
            return;
        }
        // if user enters 2 or more number of terms
        else{
            int t1 = 0;
            int t2 = 1;
            int nextTerm = t1 + t2;
            System.out.print("Fibonacci series : " + t1 + " , " + t2);
            for(int i=3; i<=n ; i++){
                System.out.print(" , " + nextTerm);
                t1 = t2;
                t2 = nextTerm;
                nextTerm = t1 + t2;
            }
        }
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of terms :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
    }
}
//Prints the fibonacci series