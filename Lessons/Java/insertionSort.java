import java.util.Scanner;

public class insertionSort {
    public static void arrInput(int array[], int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array :");
        // for taking input
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void sort(int array[]) {
        // insertion sort
        for(int i=1; i<array.length; i++){
            int current = array[i];
            int j=i-1;
            while (j>=0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            //Placement
            array[j+1] = current;
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
// O(n^2)