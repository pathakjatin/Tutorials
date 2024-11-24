import java.util.Scanner;

public class A_Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if((w >= 4) && (w%2 == 0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}