public class towerOfHanoi {
    public static void tower(int n, String src, String helper, String dest){
        if (n==1) {
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        //transfer top n-1 from src to helper using dest as 'helper'
        tower(n-1, src, dest, helper);
        //Time taken = n-1

        //transfer nth from src to dest
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        // Time taken = 1

        //transfer n-1 from helper to dest using src as 'helper'
        tower(n-1, helper, src, dest);
        //Time taken = n-1

        //Total O(2^n - 1) ( refer nb)

    }
    public static void main(String[] args) {
        int n=3;
        tower(n, "S", "H", "D");
    }
}
