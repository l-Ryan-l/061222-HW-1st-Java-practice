//Given an input string s,reverse the order of the words.
//A word is defined as a sequence of non-space characters.
//The words in s will be separated by at least one space.
//Return a string of the words in reverse order concatenated by a single space.
//Note that s may contain leading or trailing spaces or multiple spaces between two words.
//The returned string should only have a single space separating the words.
//Do not include any extra spaces.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(reverseWords("The sky is blue"));

    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end -= 1;
                continue;
            }

            int start = end - 1;

            while (start >= 0 && s.charAt(start) != ' ') {
                start -= 1;
            }
            sb.append(" ");
            sb.append(s.substring(start + 1, end + 1));
            end = start - 1;

        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }

        return sb.toString();

    }



}
