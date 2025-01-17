class Solution {
    public boolean isPalindrome(String s) {
        String s2=s.replaceAll("[^a-zA-Z0-9]","");
        // s2=s2.toLowerCase();
        int n=s2.length();
        int start=0;
        int end=s2.length()-1;
        while(start<end){
        char ch1=s2.charAt(start);
        char ch2=s2.charAt(end);
        if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2)){
                
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}