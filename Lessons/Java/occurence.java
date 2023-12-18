import java.util.Scanner;

public class occurence {
    public static int first = -1;
    public static int last = -1;

    public static void findElem(String str, int idx, char elem){
        if (idx == str.length()) {
            System.out.println("First Occurence at index : "+first);
            System.out.println("Last Occurence at index : "+last);
            return;
        }
        int currentChar = str.charAt(idx);
        if (currentChar == elem) {
            if (first==-1) {
                first = idx;
            }else{
                last = idx;
            }
        }
        findElem(str, idx+1, elem);
    }
    public static void main(String[] args) {
        // String str = "abaacdaefaahfedaach";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        System.out.println("Enter a character to find its occurence:");
        char elem = sc.nextLine().charAt(0);
        findElem(str, 0, elem);
    }
}
