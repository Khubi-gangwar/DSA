class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;
       
       for(int right = 0; right < n; right++) {
            if(nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
             
       }

        for(int i = 0; i < nums.length; i++) {
        System.out.print(nums[i]+" ");
        }
    }
}