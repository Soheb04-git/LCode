class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = 0;
        for(int i = m; i < (m+n); i++){
            nums1[i] = nums2[x];
            x++;
        }
        Arrays.sort(nums1);
        // int a = m+n;
        // for(int i = 0; i <= a-1; i++){
        //     for(int j = 0; j < a-i-1; j++){
        //         if(nums1[j] > nums1[j+1]){
        //             int temp = nums1[j];
        //             nums1[j] = nums1[j+1];
        //             nums1[j+1] = temp;
        //         }
        //     }
        // }
    }
}