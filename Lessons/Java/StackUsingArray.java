import java.util.Scanner;

public class StackUsingArray {

    static int top = -1;

    public static void push(int[] arr, int size, Scanner inpPush) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Enter the value you want to push:");
            int x = inpPush.nextInt();
            top++;
            arr[top] = x;
        }
    }

    public static void pop(int[] arr) {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            int n = arr[top];
            top--;
            System.out.println("The popped element is " + n);
        }
    }

    public static void peek(int[] arr) {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            int x = arr[top];
            System.out.println("The top element is " + x);
        }
    }

    // Display the entire array
    public static void display(int[] arr, int size) {
        System.out.println("Displaying the entire array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int ch;

        do {
            System.out.println("1) Push \n2) Pop \n3) Peek \n4) Display \n0) Exit");
            System.out.println("Enter Choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    push(arr, size, sc);  // Reusing the main scanner for input
                    break;
                case 2:
                    pop(arr);
                    break;
                case 3:
                    peek(arr);
                    break;
                case 4:
                    display(arr, size);  // Displaying the entire array
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (ch != 0);
        
        sc.close();  // Close scanner at the end of the program
    }
}
