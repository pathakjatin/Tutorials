public class SlidingWindow {
    public static void main(String[] args) {
        //Maximum sum of subarray of size K
        int[] nums = {7, 1, 8, 10, 12, 0, 5};
        int n = nums.length;
        int k = 3;

        int max = Integer.MIN_VALUE;
        //Brute Force
        // for(int i = 0; i<n-k+1; i++){
        //     int sum = 0;
        //     for(int j = i; j < i+k ; j++){
        //         sum += nums[j];
        //     }
        //     max = Math.max(max, sum);
        // }
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += nums[i];
        }
        for(int j = 1; j < n-k+1; j++){
            sum = sum - nums[j-1] + nums[j+k-1];
            max = Math.max(max, sum);
        }
        
        System.out.println("Maximum sum of subarray of size " + k + " is: " + max);
    }
}
