import java.util.Arrays;

public class Solution{
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum=prices[0]+prices[1];
        if(sum<=money)
        return money-sum;
        return money;
    }

}