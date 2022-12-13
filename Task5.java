//A phrase is a palindrome if, after converting all uppercase letters into
//lowercase letters and removing all non-alphanumeric characters, it reads the
//same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
public class Task5 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(""));

    }


    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        char startChar;
        char endChar;

        while (left < right) {
            startChar = s.charAt(left);
            endChar = s.charAt(right);
            if (!Character.isLetterOrDigit(startChar)) {
                left += 1;
            }
            else if (!Character.isLetterOrDigit(endChar)) {
                right -= 1;
            }
            else if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                return false;
            }
            else {
                left += 1;
                right -= 1;
            }

        }

        return true;
    }
}
