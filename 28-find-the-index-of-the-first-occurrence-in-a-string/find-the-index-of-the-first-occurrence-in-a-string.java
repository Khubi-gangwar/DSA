class Solution {
    public static void main(String args[]) {
        Solution sol = new Solution();
        System.out.println(sol.strStr("sadbutsad", "sad"));     // Output: 0
        System.out.println(sol.strStr("leetcode", "leeto"));    // Output: -1
        System.out.println(sol.strStr("hello", "ll"));          // Output: 2
    }

    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
