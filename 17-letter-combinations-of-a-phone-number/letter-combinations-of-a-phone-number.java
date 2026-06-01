class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
         if(digits.length() == 0) return ans;
        String kp[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
          backtrack(digits,kp,"",ans);
          return ans;
       }

       void backtrack(String digits, String kp[], String curr, List<String> ans) {
          if(digits.length() == 0) {
            ans.add(curr);
            return;
        }
          int currNum = digits.charAt(0)-'0';
          String currChoices = kp[currNum];
          for(int i = 0; i < currChoices.length(); i++) {
             char ch = currChoices.charAt(i);
             backtrack(digits.substring(1), kp, curr + ch, ans);
          }
       }
}