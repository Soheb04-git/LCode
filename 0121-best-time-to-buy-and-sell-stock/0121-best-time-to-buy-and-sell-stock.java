class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int BP = prices[0],SP;
        for(int i = 0; i < n; i++){
            BP = Math.min(BP,prices[i]);
            SP = prices[i];
            profit = Math.max(profit,SP-BP);
        }
        return profit;
    }
}
