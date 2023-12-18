import java.util.Scanner;

public class reverseString {
    public static void stringPrint(String str, int idx){
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        stringPrint(str, idx-1);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int idx = str.length()-1;
        stringPrint(str, idx);
    }
}
