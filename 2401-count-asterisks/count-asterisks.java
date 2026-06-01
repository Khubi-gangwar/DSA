class Solution {
    public int countAsterisks(String s) {
        boolean insidePipe = false;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
           char ch = s.charAt(i);
           if(ch == '|') 
             insidePipe = !insidePipe;
             else if(ch == '*' && insidePipe == false)
               count++;
        }
        return count;
    }
}