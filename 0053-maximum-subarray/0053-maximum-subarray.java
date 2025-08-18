class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int high = Integer.MIN_VALUE;
        int low = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(sum < 0){
                sum = 0;
            }
            high = Math.max(sum,high);
            low = Math.max(nums[i],low);
        }
        if(high == 0){
            return low;
        }
        return high;
    }
}