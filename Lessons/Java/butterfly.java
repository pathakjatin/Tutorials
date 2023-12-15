public class butterfly {
    public static void main(String[] args) {
        int n = 5;
        // for upper half
        // for rows
        for (int i = 1; i <= n; i++) {
            // 1st part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for spaces in between the stars
            int space = 2 * (n - i);
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            // for 2nd part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for lower half
        for (int i = n; i >= 1; i--) {
            // 1st part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for spaces in between the stars
            int space = 2 * (n - i);
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            // for 2nd part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Prints
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *