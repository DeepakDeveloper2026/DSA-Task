class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If the current digit is less than 9, increment it and return
                digits[i]++;
                return digits;
            }
            // Otherwise, set the current digit to 0 and continue the carry
            digits[i] = 0;
        }
        
        // If the loop completes, it means all digits were 9
        // Create a new array with an extra digit
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // Set the most significant digit to 1
        return newDigits;
    }
}
