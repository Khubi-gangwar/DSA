class Solution {
    static boolean isPossible(int[] nums, int k, int maxAllowed) {
        int n = nums.length;
        int giveArray = 1;
        int largestSum = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] > maxAllowed) return false;
            if(nums[i]+largestSum <= maxAllowed) {
                 largestSum += nums[i];
            } else {
                giveArray++;
                largestSum = nums[i];
            }
        }
        if(giveArray > k) return false;
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int st = 0, end = 0;
        for(int x : nums) {
            st = Math.max(st, x);
            end += x;
        }
        int ans = 0;
        while(st <= end) {
            int mid = st+(end-st)/2;
            if(isPossible(nums,k,mid)) {
                ans = mid;
                end = mid-1;
            } else 
             st = mid+1;
        }
        return ans;
    }
}