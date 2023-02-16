package codewars;

public class ReverseWord {

    public String reverseText(String word) {

        char[] reverseWords = new char[word.length()];

        int count = 0;
        for (int index = word.length() -1; index >= 0; index--) {
            reverseWords[count] = word.charAt(index);
            count++;

        }
        return String.valueOf(reverseWords);
    }
}
