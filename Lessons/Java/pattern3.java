public class pattern3 {
    public static void main(String[] args) {
        int n=4;
        //for rows
        for(int i=1; i<=n; i++){
            //for space 
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            //for star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//prints
//    *
//   **
//  ***
// ****