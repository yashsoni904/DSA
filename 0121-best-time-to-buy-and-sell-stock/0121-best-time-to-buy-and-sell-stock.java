class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int bestbuy=prices[0];
        int dif=0;
        for(int i=1;i<prices.length;i++){
            dif=prices[i]-bestbuy;
            if(max<dif){
                max=dif;
            }
            if(bestbuy>prices[i]){
                bestbuy=prices[i];
            }
            dif=0;
        }
        return max;
    }
}