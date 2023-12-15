import java.util.Scanner;

public class power {
        public static void calculatePower(int x, int n){
            if((n==0)&&(x==0)){
                System.out.println("Indeterminate!");
                return;
            }
            else if(n<0){
                System.out.println("Indeterminate!");
                return;
            }
            int answer=1;
            for(int i=n; i>=1; i--){
                answer=answer*x;
            }
            System.out.println("" + x + "^" + n + " = " + answer);
            return;
        }
        public static void main(String[] args) {
        System.out.println("Enter the numbers x and n to calculate x^n :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        calculatePower(x, n);
    }
}
