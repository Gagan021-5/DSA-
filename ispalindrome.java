public class ispalindrome {

    // Given a string s,return true if it is a palindrome, or false otherwise.
    // Example 1:
    // Input:s="A man, a plan, a canal: Panama"
    // Output:true
    // Explanation:"amanaplanacanalpanama"
    // is a palindrome.

    public static void main(String[] args) {
        boolean result = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
    }

    static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str.append(Character.toLowerCase(c));
            }
        }

        String newstr = str.toString();
        String ispalin = str.reverse().toString();

        if (newstr.equals(ispalin)) {
            return true;
        }

        return false;

    }

}
