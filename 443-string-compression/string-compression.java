class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;
        int count = 1;
        for(int i = 1; i < n; i++) {
           char curr = chars[i];
           char prev = chars[i-1];

           if(curr == prev) {
              count++;
           }else {
              chars[write++] = prev;
              if(count > 1) {
                 for(char c : String.valueOf(count).toCharArray()) {
                        chars[write++] = c;
                    }
                }

                count = 1; 
           }
        }
         chars[write++] = chars[n - 1];
        if(count > 1) {
            for(char c : String.valueOf(count).toCharArray()) {
                chars[write++] = c;
            }
        }

        return write;
    }
}