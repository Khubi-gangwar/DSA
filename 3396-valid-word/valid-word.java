class Solution {
    public boolean isValid(String word) {
       int n = word.length();
       int vowels = 0, consonants = 0;
       if(n < 3)   return false;
       for(int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        if(!Character.isLetterOrDigit(ch)) return false;

        if("AEIOUaeiou".indexOf(ch) != -1){ vowels++;
        }
         else if(Character.isLetter(ch)){ consonants++;
         }
       }
       return vowels > 0 && consonants > 0;
    }
}