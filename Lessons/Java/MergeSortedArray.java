import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2,2,3,0,0,0};
        int[] nums2 = {1,5,6};
        int m = 3;
        int n = 3;
        int last = m + n - 1;
        // for(int i=0; i<nums2.length; i++){
        //     nums1[m+i] = nums2[i];
        // }

        // for(int i = 0; i<nums1.length; i++){
        //     int smallest = i;
        //     for(int j=i+1; j<nums1.length; j++){
        //         if (nums1[smallest] > nums1[j]) {
        //             smallest = j;
        //         }
                
        //     }
        //     int temp = nums1[smallest];
        //         nums1[smallest] = nums1[i];
        //         nums1[i] = temp;
        // }
        while((m>0) && (n>0)){
            if(nums1[m-1] > nums2[n-1]){
                int temp = nums1[last];
                nums1[last] = nums1[m-1];
                nums1[m-1] = temp;
                m--;
            }else{
                int temp = nums1[last];
                nums1[last] = nums2[n-1];
                nums2[n-1] = temp;
                n--;
            }
            last--;
        }
        while(n>0){
            nums1[last] = nums2[n-1];
            n--;
            last--;
        }


        System.out.println(Arrays.toString(nums1));
    }
}
