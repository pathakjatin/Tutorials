public class mergeSort {
    public static void conquer(int array[], int si, int mid, int ei) {
        // Create a temporary array to store the merged result
        int merge[] = new int[ei - si + 1];
    
        // Initialize pointers for both halves of the array
        int idx1 = si;       // Points to the start of the first half
        int idx2 = mid + 1;  // Points to the start of the second half
        int x = 0;           // Pointer for the merge array
    
        // Step 1: Merge both halves while both have elements
        while (idx1 <= mid && idx2 <= ei) {
            // Compare elements from both halves
            if (array[idx1] <= array[idx2]) {
                // Add the smaller element to the merge array
                merge[x++] = array[idx1++];
            } else {
                merge[x++] = array[idx2++];
            }
        }
    
        // Step 2: Copy remaining elements from the first half, if any
        while (idx1 <= mid) {
            merge[x++] = array[idx1++];
        }
    
        // Step 3: Copy remaining elements from the second half, if any
        while (idx2 <= ei) {
            merge[x++] = array[idx2++];
        }
    
        // Step 4: Copy the merged array back into the original array
        for (int i = 0, j = si; i < merge.length; i++, j++) {
            array[j] = merge[i];
        }
    
        /*
            Example Dry Run:
            Input: array = {3, 7, 2, 5}, si = 0, mid = 1, ei = 3
            - Subarray 1: [3, 7] (array[0..1])
            - Subarray 2: [2, 5] (array[2..3])
            
            Steps:
            1. Compare 3 and 2 → merge[0] = 2
            2. Compare 3 and 5 → merge[1] = 3
            3. Compare 7 and 5 → merge[2] = 5
            4. Copy remaining 7 → merge[3] = 7
            
            Final merge[] = {2, 3, 5, 7}
            Copy merge[] back to array[0..3].
            
            Output: array = {2, 3, 5, 7}
        */
    }
    
    public static void divide(int array[], int si, int ei){
        if (si >= ei) {
            return;
        }
        int mid = si + (ei-si)/2 ;        // mid = (si+ei)/2;
        divide(array, si, mid);
        divide(array, mid+1, ei);
        conquer(array, si, mid, ei);
    }
    public static void main(String[] args) {
        int array[] = {6,3,9,5,2,8};
        int n = array.length;
        divide(array, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.println(array[i] +" ");
        }
    }
}
