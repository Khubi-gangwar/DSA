class Solution {
    static int freqCount(int nums[], int index) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == nums[index]) {
                count++;
            }
        }
        return count;
    }
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int f1 = freqCount(nums,i);
                int f2 = freqCount(nums,j);

                if(f1 > f2) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                else if(f1 == f2 && nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}