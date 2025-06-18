class Solution {
    public int maxProfit(int[] prices) {
    int minPrice=prices[0];
    int index=0;
    int max=0;

    for(int i=1;i<prices.length;i++){        
        int diff=prices[i]-minPrice;
        max=Math.max(max,diff);
        minPrice=Math.min(minPrice,prices[i]);
    }
    return max;    
    }
}