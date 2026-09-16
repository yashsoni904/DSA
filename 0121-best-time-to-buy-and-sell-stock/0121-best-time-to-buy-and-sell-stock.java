class Solution {
    public int maxProfit(int[] prices) {
        int bestbuy=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            int earn=prices[i]-bestbuy;
            max=Math.max(max,earn);
            bestbuy=Math.min(bestbuy,prices[i]);
        }
        return max;
    }
}