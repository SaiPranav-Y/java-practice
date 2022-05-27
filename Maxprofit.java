/*
An array is given with prices on every day in a week. You have to buy on one day and sell on another day.
 We have to find out the maximum profit.
*/
public class Maxprofit {
    public static int maxProfit(int[] prices){
        int l = 0;
        int r = 1;
        int maxp = 0;
        int profit = 0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                profit = prices[r]-prices[l];
                maxp = Math.max(profit,maxp);
                
            }
            else{
                l = r;
            }
            r = r+1;
        }
        return maxp;
    }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}

/*
METHOD 2:
public int MaxProfit(int[] prices){
    int mn = prices[0];
    int profit = 0;
    for(int i=0;i<prices.length;i++){
        profit = Math.max(prices[i]-mn,profit);
        mn = Math.min(mn,prices[i]);
    }
    return profit;
}

*/
