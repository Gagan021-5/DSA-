public class romantointeger {
    // Roman numerals are represented by seven different symbols: I, V, X, L, C, D
    // and M.

    // Symbol Value
    // I 1
    // V 5
    // X 10
    // L 50
    // C 100
    // D 500
    // M 1000

    // Example 1:

    // Input: s = "III"
    // Output: 3
    // Explanation: III = 3.

    public static void main(String[] args) {

    }

    public static int romanToInt(String s) {
        int result = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char currchar = s.charAt(i);
            int currval = romantochar(currchar);

            if (currval < prev) {
                result -= currval;
            } else {
                result += currval;
            }
            currval = prev;
        }

        return result;

    }

    public static int romantochar(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
