class Solution {
    public int maxSubArray(int[] arr) {
        int currSum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currSum=Math.max(arr[i],arr[i]+currSum);
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}