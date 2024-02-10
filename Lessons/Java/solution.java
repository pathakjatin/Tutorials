class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newArray = new int[nums.length];
            for(int i=0; i<nums.length; i++){
                int target = nums[i];
                int count=0;
                    for(int j=0; j<nums.length; j++){
                    if(nums[j]<target){
                        count++;
                    }
                    newArray[j] = count; 
                }
        }  
        return newArray[]
    }
}