class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int profitA = 0;
        int BP = Integer.MAX_VALUE,SP;
        for(int i = 0; i < n; i++){
            BP = Math.min(BP,prices[i]);
            SP = prices[i];
            profitA = SP - BP;
            profit = Math.max(profit,profitA);
        }
        return profit;
    }
}
