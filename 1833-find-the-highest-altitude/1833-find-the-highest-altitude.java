class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        for(int i = 1; i < n; i++){
            gain[i] = gain[i]+gain[i-1];
        }
        int m = gain[0];
        for(int i = 0; i < n; i++){
            m = Math.max(m,gain[i]);
        }
        if(m < 0) return 0;
        return m;
    }
}