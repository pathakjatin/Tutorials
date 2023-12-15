import java.util.Scanner;

public class average {
    public static void calculateAverage(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.println("The average of "+ a +","+ b +" and "+ c +" is : "+avg);
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        calculateAverage(a, b, c);
    }
}
