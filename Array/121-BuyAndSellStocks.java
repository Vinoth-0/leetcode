// Leetcode 121. Best Time to Buy and Sell Stock
// Difficulty: Easy

class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int m=Integer.MAX_VALUE;
        int temp=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<m){
                m=prices[i];
            }

            temp=prices[i]-m;
            if(ans<temp){
                ans=temp;
            }
        }
        return ans;
    }
}