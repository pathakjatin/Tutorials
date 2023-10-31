import java.util.Scanner;
class Arm{
    public static boolean isArmstrong(int x){
    int sum=0;
    int ognum=x;
    while(x!=0){
        int digit = x%10;
        sum += Math.pow(digit,3);
        x /= 10;
    }
    return sum == ognum;
}
}
public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!Enter a number:");
        int x = scanner.nextInt();
        scanner.close();
        Arm res=new Arm();
        boolean result=res.isArmstrong(x);
        System.out.println(result);
    }
}
