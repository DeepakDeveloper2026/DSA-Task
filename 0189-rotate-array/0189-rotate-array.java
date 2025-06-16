class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n; //if k>n
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int[] arr,int st,int ed){
        while(st<ed){
            int temp=arr[st];
            arr[st]=arr[ed];
            arr[ed]=temp;
            st++;
            ed--;
        }
    }
}