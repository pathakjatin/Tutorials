public class numberPyramind {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<=n; i++){
            //for spaces
            int space = n-i;
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
//Prints
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5