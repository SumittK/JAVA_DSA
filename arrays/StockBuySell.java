package arrays;

public class StockBuySell {
    /*
     * You are given an array prices where prices[i] is the price of a given stock
     * on the ith day.
     * 
     * You want to maximize your profit by choosing a single day to buy one stock
     * and choosing a different day in the future to sell that stock.
     * 
     * Return the maximum profit you can achieve from this transaction. If you
     * cannot achieve any profit, return 0.
     * 
     * Brute force ==.
     * 
     * Check each and every diffrence return max diff as max Profit
     * Time Complexity = O(n2)
     */

    public static int maxProfit(int[] nums) {

        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int diff = 0;
            for (int j = i + 1; j < nums.length - 1; j++) {

                diff = nums[j] - nums[i];

                maxProfit = Math.max(maxProfit, diff);
                if (diff < 0) {
                    maxProfit = 0;
                }
            }
        }

        return maxProfit;

    }

    /*
     * Time Complexity O(n)
     * 
     * Two Pointer approach
     * 
     * 
     * 
     */

    public static int maxProfitTwoPointer(int[] prices) {
        //Time Complexity ===> O(n)
        int maxProfit = 0;
        int buyDay = 0;

        for (int sellDay = 1; sellDay < prices.length; sellDay++) {

            if (prices[sellDay] > prices[buyDay]) {
                int profit = prices[sellDay] - prices[buyDay];

                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyDay = sellDay;
            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 6, 4, 3, 1 };

        System.out.println(maxProfit(prices));
    }

}