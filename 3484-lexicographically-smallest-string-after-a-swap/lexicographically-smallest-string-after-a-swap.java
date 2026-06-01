class Solution {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        for(int i = 1; i < arr.length; i++) {
            char a = arr[i-1];
            char b = arr[i];
           if((a % 2 == b % 2) && (a > b)) {
            char temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i-1] = temp;
            return new String(arr);
           }
        }
        return s;
    }
}