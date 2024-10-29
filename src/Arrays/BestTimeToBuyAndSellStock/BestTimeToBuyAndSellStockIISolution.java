package Arrays.BestTimeToBuyAndSellStock;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 10/29/2024
 */
public class BestTimeToBuyAndSellStockIISolution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if((prices[i+1] - prices[i]) > 0){
                maxProfit = maxProfit + (prices[i+1] - prices[i]);
            }
        }
        return maxProfit;
    }
}
