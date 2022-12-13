// You are given two strings word1 and word2.
// Merge the strings by adding letters in alternating order, starting with word1.
// If a string is longer than the other, append the additional letters onto the end of the merged string.
//Return the merged string.

public class Task1 {

    public static void main(String[] args) {

        System.out.println(mergeAlternately("abcjhk", "poi"));
    }
    public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;

        StringBuilder res = new StringBuilder();
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                res.append(word1.charAt(i));
                i += 1;
            }
            if (j < word2.length()) {
                res.append(word2.charAt(j));
                j += 1;
            }
        }
        return res.toString();

    }

}