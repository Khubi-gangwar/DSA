class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int freq[] = new int[101];
        for(int i = 0; i < n; i++) {
            int num = nums[i];
            freq[num]++;
        }
        int maxFreq = 0;
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }
        int total = 0;
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] == maxFreq) {
                total += freq[i];
            }
        }
        return total;
    }
}