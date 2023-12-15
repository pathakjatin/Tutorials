import java.util.Scanner;

public class twoDArrays {
    public static void main(String[] args) {
        System.out.println("Enter the size of 2 dimensional array :");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];
        System.out.println("Enter the elements of array :");
        
    // for taking input
        // for rows
        for(int i=0; i<rows; i++){
            //for columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to be found in array :");
        int x = sc.nextInt();
    // for traversing the array
        // for rows
        for(int i=0; i<rows; i++){
            //for columns
            for(int j=0; j<cols; j++){
                // for searching
                if(numbers[i][j]==x){
                    System.out.println("The index of " + x + " is : " + i + " , " + j);
                }
            }
        }
    }
}
