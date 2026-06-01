class Solution {
    static boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3; i*i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    static int countBits(int n) {
        int count = 0;
        while(n > 0){
           n = n & (n - 1);
           count++;
        }
        return count;
    }    
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i = left; i <= right; i++) {
            int setBits = countBits(i);
            if(isPrime(setBits)) 
            ans++;
        }
        return ans;
    }
}