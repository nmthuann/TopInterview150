package Arrays.BestTimeToBuyAndSellStock.Tests;

import Arrays.BestTimeToBuyAndSellStock.BestTimeToBuyAndSellStockIISolution;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 10/29/2024
 */
public class BestTimeToBuyAndSellStockIISolutionTest {
    public static void testMaxProfit() {
        BestTimeToBuyAndSellStockIISolution solution = new BestTimeToBuyAndSellStockIISolution();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int result1 = solution.maxProfit(prices1);
        System.out.println("Max Profit for prices1: " + result1); // Expected output: 7

        int[] prices2 = {1, 2, 3, 4, 5};
        int result2 = solution.maxProfit(prices2);
        System.out.println("Max Profit for prices2: " + result2); // Expected output: 4

        int[] prices3 = {7, 6, 4, 3, 1};
        int result3 = solution.maxProfit(prices3);
        System.out.println("Max Profit for prices3: " + result3); // Expected output: 0
    }
}
