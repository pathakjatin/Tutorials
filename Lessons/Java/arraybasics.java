import java.util.Scanner;

public class arraybasics {
    public static void main(String[] args) {
        System.out.println("Enter the size of array :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter the elements of array :");
        // for taking input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be found in array :");
        int x = sc.nextInt();
        // for traversing the array
        for (int i = 0; i < size; i++) {
            // searching the given element
            if (numbers[i] == x) {
                System.out.println("The index of " + x + " is : " + i);
            }
        }
    }
}
