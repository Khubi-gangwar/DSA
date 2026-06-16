class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n-k+1];
        int z = 0;
        int nse[] = new int[n];
        Stack<Integer> st = new Stack<>();
        nse[n-1] = n;
        st.push(n-1);
        for(int i = n-2; i >= 0; i--) {
        while(st.size() > 0 && nums[st.peek()] <= nums[i]) {
            st.pop();
        }
        if(st.size() == 0) nse[i] = n;
          else 
            nse[i] = st.peek();
            st.push(i);
        }

        int j = 0;
        for(int i = 0; i < n-k+1; i++) {
            if(j >= k+i) j = i; 
            int max = nums[j];
            while(j < k + i) {
                max = nums[j];
                j = nse[j];
            }
            ans[z++] = max;
        }
        return ans;
    }
}