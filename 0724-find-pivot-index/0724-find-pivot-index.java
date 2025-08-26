class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] r = new int[n];
        int[] l = new int[n];
        l[0] = nums[0];
        r[n-1] = nums[n-1];
        int left = 0;
        int right = 0;
        if(n == 1) return 0;
        for(int i = 1; i < n; i++){
            l[i] = nums[i]+l[i-1];
        }
        for(int i = n-2; i >= 0; i--){
            r[i] = nums[i]+r[i+1];
        }
        for(int i = 0; i < n; i++){
            if(i == 0){
                left = 0;
                right = r[i+1];
            }
            else if(i == n-1){
                right = 0;
                left = l[i-1];
            }
            else{
                right = r[i+1];
                left = l[i-1];
            }
            if(left == right) return i;
        }
        return -1;
    }
}