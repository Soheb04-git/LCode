class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i =0; i < n; i++){
            if(nums[i] != 0){
                swap(nums,i,j);
                j++;
            }
        }
    }
    static void swap(int[] nums,int a, int b){
        int temp = nums[a]; 
        nums[a] = nums[b];
        nums[b] = temp;
    }
}