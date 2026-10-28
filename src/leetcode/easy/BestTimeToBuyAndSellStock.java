package leetcode.easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {3,10,1,2};
       int maxprofit = calculateMaxprofit(prices);
        System.out.println(maxprofit);
    }

    private static int calculateMaxprofit(int[] prices) {
        //edge case
        if(prices.length == 0){
            return  0;
        }
        int min_Price = prices[0];
        int max_price = prices[0];
        int max_profit = 0;
        for(int i = 1;i< prices.length;i++){
            min_Price = Math.min(min_Price, prices[i]);
             max_profit = Math.max(max_price,prices[i]) - min_Price;
        }
        return max_profit;
    }
}
