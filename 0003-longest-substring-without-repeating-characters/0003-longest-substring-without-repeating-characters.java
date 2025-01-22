class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int right=0;
        int maxlength=0;
        for(int left=0;left<s.length();left++){
        while(set.contains(s.charAt(left))){
            set.remove(s.charAt(right));
            right++;
        }
        set.add(s.charAt(left));
        
        maxlength=Math.max(maxlength,left-right+1);
        }
        return maxlength;
    }
}