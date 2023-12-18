public class sortedArray {
    // my approach (not 100% correct)
    // public static void checkSorted(int arr[], int idx){
    //     if (arr[idx]==arr.length) {
    //         return ;
    //     }
    //     if (arr[idx] < arr[idx+1]) {
    //         System.out.println("Array is sorted");
    //     }else{
    //         System.out.println("Array is not sorted");
    //     }
    //     checkSorted(arr, idx+1);

    // actual solution
    public static boolean isSorted(int arr[], int idx){
        if (idx == arr.length-1) {
            return true;
        }
        if (arr[idx] >= arr[idx+1]) {
            //array is unsorted
            return false;
        }
        return isSorted(arr, idx+1);
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // checkSorted(arr, 0);
        System.out.println(isSorted(arr, 0));
    }
}
