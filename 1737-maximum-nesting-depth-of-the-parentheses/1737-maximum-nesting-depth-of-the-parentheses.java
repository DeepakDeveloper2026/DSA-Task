class Solution {
    public int maxDepth(String s) {
        int max=0,count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
               count++;
            }
            max=Math.max(max,count);
            if(c==')'){
                count--;
            }
        }
        return max;
    }
}