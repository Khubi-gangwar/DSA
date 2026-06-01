class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int capCount = 0;
        for(int i = 0; i < n; i++) {
             if(Character.isUpperCase(word.charAt(i))) capCount++;
        }
        if(capCount == n) return true;
        if(capCount == 0) return true;
        if(capCount == 1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}