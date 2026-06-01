class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder str = new StringBuilder(title.toLowerCase());
         int n = str.length();
         int start = 0;
         for(int i = 0; i <= n; i++) {
            if(i == n || str.charAt(i) == ' ') {
                int len = i-start;
                if(len >= 3) {
                    char ch = str.charAt(start);
                    str.setCharAt(start,(char)(ch - 32));
                }
                start = i+1;
            }
         }
         return str.toString();
    }
}