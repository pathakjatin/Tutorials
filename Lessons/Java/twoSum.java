
    class twoSum {
        public static void twoSum(int[] nums, int target) {
            for(int i=0; i<nums.length; i++){
                int firstVal = nums[i];
                for(int j=0; j<nums.length; j++){
                    int secondVal = nums[j];
                    int sum = firstVal + secondVal;
                    if(sum == target){
                        System.out.println(i + " is first index");
                        System.out.println(j + " is second index");
                    }
                }
            }  
            
        }
        public static void main(String[] args) {
            int nums[] = {2,7,11,15};
            int target = 9;
            twoSum(nums , target);
        }
    }

