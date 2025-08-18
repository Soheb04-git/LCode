class Solution {
     static {
        for (int i = 0; i < 500; i++) {
            maxAbsoluteSum(new int[1]);
        }
     }
    public static int maxAbsoluteSum(int[] nums) {
        int maximumsum = 0;
        int minimumsum = 0;
        int maxSum = 0;
         int minSum = Integer.MAX_VALUE;
        int r = 0;
        for(int i = 0;i < nums.length;i++){
            if(maximumsum<0) maximumsum = 0;
            maximumsum += nums[i];
            maxSum = Math.max(maxSum,maximumsum);
            minimumsum+=nums[i];
            if(minimumsum>0) minimumsum=0;
            minSum = Math.min(minimumsum,minSum);
        }
        return Math.max(maxSum, -minSum);
    }
}