public class PalindromeNumberRange {
    static boolean isPalindrome(int n) {
        // Initialize a variable to
        // store the reverse of the number
        int revNum = 0;
        // Create a duplicate variable to
        // store the original number
        int dup = n;
        // Iterate through each digit of
        // the number until it becomes 0
        while (n > 0) {
            // Extract the last
            // digit of the number
            int ld = n % 10;
            // Build the reverse number
            // by appending the last digit
            revNum = (revNum * 10) + ld;
            // Remove the last digit
            // from the original number
            n = n / 10;
        }
        // Check if the original number
        // is equal to its reverse
        if (dup == revNum) {
            // If equal, return true
            // indicating it's a palindrome
            return true;
        } else {
            // If not equal, return false
            // indicating it's not a palindrome
            return false;
        }
    }
    public static void main(String args[])
        {
            int min = 100;
            int max = 150;
            for(int i=min; i<=max; i++) {
                if(isPalindrome(i)) {
                    System.out.print(i + " ");
                }
            }
     
        }

}
