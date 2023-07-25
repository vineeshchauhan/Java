package linkedin.array;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		int[] prices = { 1, 5, 4, 3, 2, 8, 77, 5, 4, 3, 5, 2 };
		int i = 0;
		int j = 1;
		int max_profit = 0;
		while (j < prices.length) {
			if (prices[j] > prices[i]) {
				int profit = prices[j] - prices[i];
				if (profit > max_profit) {
					max_profit = profit;
				}
			} else {
				i = j;
			}
			j++;
		}
		System.out.println((max_profit < 0) ? 0 : max_profit);
	}

}
