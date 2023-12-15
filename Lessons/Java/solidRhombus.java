public class solidRhombus {
    public static void main(String[] args) {
        int n=5;
        //for rows
        for(int i=0; i<=n; i++){

            //for spaces
            int space = n-i;
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Prints
//    *****
//   *****
//  *****
// *****
//***** 