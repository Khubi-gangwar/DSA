class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0; // edge case

        int left = 0;   // last unique index
        int right = 1;  // scanning pointer

        while (right < n) {
            if (nums[right] != nums[left]) {  // found new unique
                left++;
                nums[left] = nums[right];    // overwrite in-place
            }
            right++;  // always move right forward
        }

        return left + 1;  // new length
    }
}



