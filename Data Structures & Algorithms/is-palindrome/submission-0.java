class Solution {
    public boolean isPalindrome(String s) {
        // Initialize pointers at both ends of the string
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move left pointer forward if the character is not alphanumeric
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } 
            // Move right pointer backward if the character is not alphanumeric
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } 
            // Compare characters after converting to lowercase
            else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false; // Mismatch found
                }
                left++;
                right--;
            }
        }
        return true; // All valid pairs matched
    }
}
