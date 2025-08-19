class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int w,x,wt = 0;
        /*w = hight of water
          x = height of baar
          wt = calculation of water*/
        left[0] = height[0];
        right[n-1] = height[n-1];
        int j = n-2;
        for(int i = 1; i < n; i++){
            left[i] = Math.max(height[i],left[i-1]);
            right[j] = Math.max(height[j],right[j+1]);
            j--;
        }
        for(int i = 0; i < n; i++){
            w = Math.min(left[i],right[i]);
            x = height[i];
            wt += (w-x);
        }
        if(n <= 2){
            return 0;
        }
        return wt;
    }
}