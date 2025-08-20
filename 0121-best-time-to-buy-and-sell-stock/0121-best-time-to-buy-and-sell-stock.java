class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int BP = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            BP = Math.min(BP,prices[i]);
            profit = Math.max(profit,prices[i]-BP);
        }
        return profit;
    }
}
