import java.util.Scanner;

class factorial{
        public static int fact(int x){
            if (x==0 || x==1) {
                return 1;
            }
            else{
                return x * fact(x-1);
            }
        }
}
public class hello {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello!Enter a number:");
    int x = scanner.nextInt();
    scanner.close();
    factorial res=new factorial();
    int result=res.fact(x);
    System.out.println(result);
    }
}
