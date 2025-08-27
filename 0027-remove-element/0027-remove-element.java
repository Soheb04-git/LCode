class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int[] temp = new int[n];
        int a = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == val) continue;
            else temp[a++] = nums[i];
        }
        for(int i = 0; i < n; i++){
            nums[i] = temp[i];
        }
        return a;
    }
}