public class quickSort {
    public static int partition(int array[], int low, int high){
        int pivot = array[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[high] = temp;
        return i;
    }
    public static void quick (int array[], int low, int high){
        if (low < high) {
            int pivot = partition(array, low, high);

            quick(array, low, pivot-1);
            quick(array, pivot, high);
        }
    }
    public static void main(String[] args) {
        int array[] = {6,3,9,5,2,8};
        int n = array.length;
        quick(array, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.println(array[i] +" ");
        }
    }
}
