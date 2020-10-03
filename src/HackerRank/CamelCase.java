package HackerRank;

public class CamelCase {

    public static void main(String[] args) {
        CamelCase.camelcase("zaurAdamdirDeyilYada");
    }
    //It is a concatenation of one or more words consisting of English letters.
    //Complete the camelcase function in the editor below. It must return the integer number of words in the input string.

    static int camelcase(String s) {
        int count = 1;
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            boolean bool = Character.isUpperCase(arr[i]);
            if (bool) {
                count++;
            }

        }
        return count;
    }

}
