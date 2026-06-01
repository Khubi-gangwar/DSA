class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int num :nums) {
            set.add(num);
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum, num);
        }
        List<Integer> missing = new ArrayList<>();
        for(int num = minNum+1; num < maxNum;num++ ) {
            if(!set.contains(num)) {
                missing.add(num);
            }
        }
        return missing;
    }
}