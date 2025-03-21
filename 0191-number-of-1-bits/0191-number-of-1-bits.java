class Solution {
    public int hammingWeight(int n) {
    int a=n;
    int count=0;
    while(a!=0){
        int rem=a%2;
        if(rem==1) count++;
        a=a/2;
    }
    return count;
    }
}