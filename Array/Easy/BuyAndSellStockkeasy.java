
public class BuyAndSellStockkeasy {

    private static void BSStock(int[] arr) {
        int BuyingPrice = Integer.MAX_VALUE;

        int MaxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (BuyingPrice < arr[i]) {
                int profit = arr[i] - BuyingPrice;
                MaxProfit = Math.max(MaxProfit, profit);
            } else {
                BuyingPrice = arr[i];
            }
        }
        System.out.println("Max profit we can achive in one day is " + MaxProfit);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        BSStock(arr);
    }
}
