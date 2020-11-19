package datastructures.arrays;

public class besttimebuysellstock {
    public static void main(String[] args) {
        int[] sortedArray = {1,2,3,4,5};
        System.out.println(maxProfit(sortedArray));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
//        [1,2,3,4,5]
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i -1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }

}
