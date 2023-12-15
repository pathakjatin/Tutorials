public class diamond {
    public static void main(String[] args) {
        int n=4;
        //for upper half
        for(int i=1; i<=n; i++){
            //for spaces
            int space = n-i;
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            //for stars
            // int stars = 2*(i-1);
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for lower half
        for(int i=n; i>=1; i--){
            //for spaces
            int space = n-i;
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            //for stars
            // int stars = 2*(i-1);
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Prints
//   *
//  ***
// *****
//******* 
//******* 
// *****
//  ***
//   *