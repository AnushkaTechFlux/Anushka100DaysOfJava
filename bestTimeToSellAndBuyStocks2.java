public class bestTimeToSellAndBuyStocks2 {
    public static void main(String[] args) {
        int[]prices = { 7 , 1 , 5 , 3 , 6 , 4};
        int i = 0;
        int n = prices.length;
        int profit = 0;
        while(i < n - 1){
            //finding local minima , buy , nextprice bigger
            while(i< n - 1 && prices[i+1] <= prices[i]){
                i++;
            }
            int buy = prices[i];
        }

        while(i < n - 1 && prices[i] <= prices[i+1]){
            i++;

        }
        int sell = prices[i];
        profit += sell - buy ;
    }
    System.out.println(profit);
}
