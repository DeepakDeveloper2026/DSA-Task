class Solution {
    public boolean isPerfectSquare(int num) {
        double res=Math.sqrt(num);
        if((int)res*res==num)
        return true;
        return false;
    }
}