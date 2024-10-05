public class BinarySearchCeil {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // If target is not found, return value at low index (or check bounds)
        if (low < arr.length) {
            return arr[low];
        } else {
            return -1; // Or handle this case differently based on your needs
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 13;

        int result = binarySearch(arr, target);
        System.out.println("Result: " + result);
    }
}
