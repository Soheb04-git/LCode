class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0, x = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                x = nums[i];
            }
            if(nums[i] == x) count += 1;
            else count += -1;
        }
        return x;
    }
}
