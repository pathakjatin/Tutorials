import java.util.Scanner;

public class functionBasics {
    public static int calculateSum(int a, int b){
        int sum = a+b;
        System.out.println("The sum is : " + sum);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b); // calling function with arguements a and b
    }
}