class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] str = s.toCharArray();
        int i = 0, j = str.length-1;
        while(i < j) {
            char minChar = str[i] < str[j] ? str[i] : str[j];
            str[i] = minChar;
            str[j] = minChar;
            i++;
            j--;
        }
        return new String(str);
    }
}