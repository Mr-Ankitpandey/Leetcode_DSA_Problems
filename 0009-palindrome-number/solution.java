class Solution {
    public boolean isPalindrome(int x) {
        int originalNum = x; 
        int reversedNum = 0;
        
        while (x > 0) {
            int digit = x % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Build the reversed number
            x /= 10; // Remove the last digit
        }
        
        return originalNum == reversedNum;
    }
}
