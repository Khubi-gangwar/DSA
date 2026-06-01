class Solution {
    static boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n-1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j <= n; j++) {
                if(isPalindrome(s.substring(i,j)) == true) {
                    count++;
                }
            }
        }
        return count;
    }
}