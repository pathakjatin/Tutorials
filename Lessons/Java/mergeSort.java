public class mergeSort {
    public static void conquer(int array[], int si, int mid, int ei){
        int merge[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (array[idx1] <= array[idx2]) {
                merge[x++] = array[idx1++];
            }else{
                merge[x++] = array[idx2++];
            }
        }
        while (idx1 <= mid) {
            merge[x++] = array[idx1++];
        }
        while (idx2 <= ei) {
            merge[x++] = array[idx2++];
        }
        for(int i=0, j=si; i<merge.length; i++, j++){
            array[j] = merge[i];
        }
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
