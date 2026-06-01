class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int st = 0, end = n-1;
        int ans = Integer.MAX_VALUE;
        while(st <= end) {
            int mid = st+(end-st)/2;
            while(st < end && nums[st] == nums[mid] && nums[end] == nums[mid]) {
                st++;
                end--;
            }
            if(nums[mid] <= nums[end]) {
                ans = Math.min(ans,nums[mid]);
                end = mid-1;
            } else 
                 st = mid+1;
        }
        return ans;
    }
}