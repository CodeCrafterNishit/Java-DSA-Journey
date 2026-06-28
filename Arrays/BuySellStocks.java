package Arrays;
public class BuySellStocks {
    public static int BuyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            // if our selling price is high than our buyPrice which means we had bought our
            // stock and now it is time we can sell it
            // to get profit we are looping to check for which day we can get max profit
            if (prices[i] > buyPrice) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // if no profit on that day buy that particular stock for future sell
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(BuyAndSellStocks(prices));
    }
}
