class Solution {
    public int hammingWeight(int n) {
    int a=n;
    int binary=0,mul=1,count=0;
    while(a!=0){
        int rem=a%2;
        if(rem==1) count++;
        binary=binary+rem*mul;
        a=a/2;
        mul=mul*10;
    }

    return count;
    }
}