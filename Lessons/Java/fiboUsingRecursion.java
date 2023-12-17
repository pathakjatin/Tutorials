import java.util.Scanner;

public class fiboUsingRecursion {
    public static void fibonacci(int a, int b, int x){
        if (x==0) {
            return;
        }
        int c = a + b;
        System.out.print(c+",");
        fibonacci(b, c, x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter the last term of Fibonacci series:");
        int x = sc.nextInt();
        System.out.println("Fibonacci series for first "+x+" terms is:");
        System.out.print(a+",");
        System.out.print(b+",");
        fibonacci(a, b, x-2);
    }
}
