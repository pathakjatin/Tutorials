import java.util.Scanner;


public class bubbleSort {

    public static void arrInput(int array[],int size){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array :");
        // for taking input
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void sort(int array[]){
        // bubble sort
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int array[]= new int[size];
        arrInput(array, size);
        sort(array);
        System.out.println("The sorted array is: ");
        printArray(array);
    }
}
// Time Complexity
// for i till n-1
// for j till n-i-1
// O(n^2) as i , 1 gets small when input gets very large