class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int high = 0;
        int low = Integer.MAX_VALUE;
        int maxsum = 0;
        int minsum = 0;
        for(int i = 0; i < n; i++){
            maxsum += nums[i];
            if(maxsum < 0) maxsum = 0;
            minsum += nums[i];
            if(minsum > 0) minsum = 0;
            high = Math.max(maxsum,high);
            low = Math.min(minsum,low);
        }
        return Math.max(high,-low);
    }
}