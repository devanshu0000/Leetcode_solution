class Solution {
    public int maxProfit(int[] prices) {
        // int max_pro=0;
        // int profit=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[j]<prices[i]){
        //             break;
        //         }
        //         else{
        //             profit=prices[j]-prices[i];
        //             max_pro=Math.max(max_pro,profit);
        //         }
        //     }
        // }
        // return max_pro;

        int bp=Integer.MAX_VALUE;
        int max_pro=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<bp){
                bp=prices[i];
            }
            else{
                max_pro=Math.max(max_pro,prices[i]-bp);
            }
        }
        

        return max_pro;
    }
}