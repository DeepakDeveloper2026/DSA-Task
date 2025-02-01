class Solution {
    public int myAtoi(String s) {
        long sum=0;
        int j=0;
        Boolean isMinus=false;
        s=s.trim();
        if(s.length()==0 ) return 0;
        if(s.charAt(0)=='-'){
            isMinus=true;
            j=1;
        }
        if(s.charAt(0)=='+'){
            j=1;
        }
        for(int i=j;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                int num=c-'0';
                if (sum > (Integer.MAX_VALUE - num) / 10) {
                return isMinus ? Integer.MIN_VALUE : Integer.MAX_VALUE; // Clamp
                }
                sum=sum*10+num;
            }
            else
            break;
        }
        // if(isMinus && -sum<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        // else if(!isMinus && sum>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        // else
        return isMinus?(int) -sum:(int)sum;
    }
}