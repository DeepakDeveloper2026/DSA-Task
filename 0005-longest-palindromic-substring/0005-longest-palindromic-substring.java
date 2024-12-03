class Solution {
   
      public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes centered at i
            String odd = expandAroundCenter(s, i, i);
            // Check for even-length palindromes centered between i and i+1
            String even = expandAroundCenter(s, i, i + 1);
            
            // Compare and store the longest palindrome
            if (odd.length() > longest.length()) longest = odd;
            if (even.length() > longest.length()) longest = even;
        }
        
        return longest;
    }
    
    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);  
    }
}