package com.test.train.leetCode;

/**
 * @author: xuantf
 * @version: 1.0.0
 * https://github.com/MisterBooo/LeetCodeAnimation/blob/master/notes/LeetCode%E7%AC%AC121%E5%8F%B7%E9%97%AE%E9%A2%98%EF%BC%9A%E4%B9%B0%E5%8D%96%E8%82%A1%E7%A5%A8%E7%9A%84%E6%9C%80%E4%BD%B3%E6%97%B6%E6%9C%BA.md
 */
public class MaxProfit {
    public static void main(String[] args) {

        int[] prices = {1,2,3,4,5};
        int i = maxProfit(prices);
        System.out.println(i);
        int i1 = maxProfit2(prices);
        System.out.println(i1);
    }

    /**
     * 状态
     * 有 买入（buy） 和 卖出（sell） 这两种状态。
     *
     * 转移方程
     * 对于买来说，买之后可以卖出（进入卖状态），也可以不再进行股票交易（保持买状态）。
     *
     * 对于卖来说，卖出股票后不在进行股票交易（还在卖状态）。
     *
     * 只有在手上的钱才算钱，手上的钱购买当天的股票后相当于亏损。也就是说当天买的话意味着损失-prices[i]，当天卖的话意味着增加prices[i]，当天卖出总的收益就是 buy+prices[i] 。
     *
     * 所以我们只要考虑当天买和之前买哪个收益更高，当天卖和之前卖哪个收益更高。
     *
     * buy = max(buy, -price[i]) （注意：根据定义 buy 是负数）
     * sell = max(sell, prices[i] + buy)
     * 边界
     * 第一天 buy = -prices[0], sell = 0，最后返回 sell 即可
     * @param prices
     * @return
     */
    private static int maxProfit(int[] prices){
        if(prices.length <= 1) {
            return 0;
        }
        int buy = -prices[0], sell = 0;
        for(int i = 1; i < prices.length; i++) {
            buy = Math.max(buy, -prices[i]);
            sell = Math.max(sell, prices[i] + buy);

        }
        return sell;
    }

    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     *
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
     *
     * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     *
     * 示例 1:
     *
     * 输入: [7,1,5,3,6,4]
     * 输出: 7
     * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
     *      随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
     * 示例 2:
     *
     * 输入: [1,2,3,4,5]
     * 输出: 4
     * 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
     *      注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
     *      因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
     * 示例 3:
     *
     * 输入: [7,6,4,3,1]
     * 输出: 0
     * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
     * 题目解析
     * 状态
     * 有 买入（buy） 和 卖出（sell） 这两种状态。
     *
     * 转移方程
     * 对比上题，这里可以有无限次的买入和卖出，也就是说 买入 状态之前可拥有 卖出 状态，所以买入的转移方程需要变化。
     *
     * buy = max(buy, sell - price[i])
     * sell = max(sell, buy + prices[i] )
     * 边界
     * 第一天 buy = -prices[0], sell = 0，最后返回 sell 即可。
     */
    private static int maxProfit2(int[] prices){
        if (prices.length <= 1) {
            return 0;
        }
        int buy = -prices[0],sell = 0;
        for (int i = 1; i < prices.length; i++) {
            buy = Math.max(buy, sell - prices[i]);
            sell = Math.max(sell, buy + prices[i]);
        }
        return sell;
    }
}
