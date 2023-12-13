
public class hollowRectangle {
    public static void main(String[] args) {
        // for outer loop
        for (int i = 1; i <= 4; i++) {
            // for outer loop
            for (int j = 1; j <= 5; j++) {
                // border condition i,j
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//prints
// ***** 
// *   * 
// *   * 
// *****
