import java.util.Scanner;

public class selectionSort {
    public static void arrInput(int array[], int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array :");
        // for taking input
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void sort(int array[]) {
        // selection sort
        for (int i = 0; i < array.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        arrInput(array, size);
        sort(array);
        System.out.println("The sorted array is: ");
        printArray(array);
    }
}
// Time Complexity
// for i till n
// for j till n
// O(n^2)