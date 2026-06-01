class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int left = 0, right = 1;
        while(left < n && right < n) {
            if(nums[left] % 2 != 0 && nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
               
            }
            if(nums[left] % 2 == 0) 
              left += 2;

             if(nums[right] % 2 != 0)
             right += 2;
        } 
        return nums;
    }
}