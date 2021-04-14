package HackerRank;

import static java.awt.SystemColor.text;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *Roy wanted to increase his typing speed for programming contests. His friend suggested that he type the sentence 
 "The quick brown fox jumps over the lazy dog" repeatedly. This sentence is known as a pangram because it contains every letter of the alphabet.
 After typing the sentence several times, Roy became bored with it so he started to look for other pangrams.
 Given a sentence, determine whether it is a pangram. Ignore case.

 FOR example:  We promptly judged antique ivory buckles for the next prize
 OUTPUT : pangram 
 Sample Explanation :  All of the letters of the alphabet are present in the string.
 */
public class PangramAllAlphabetInclude {

    public static void main(String[] args) {
        System.out.println(PangramAllAlphabetInclude.pangrams("We promptly judged antique ivory buckles for the next prize"));
    }

    static String pangrams(String input) {
        String str = "2131Jav412412atpointtt12313";  
        System.out.println("Returning words:");  
        input = input.replaceAll("\\s", "");
        String[] arr = input.split("\\d", 0);  
        for (String w : arr) {  
            System.out.print(w);  
        }  
        System.out.println("");
        String originalAlphabet = "abcdefghijklmnopqrstuvwxyz";
        if (input.length() < originalAlphabet.length()) {
            return "not pangram";
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(input.charAt(i) == originalAlphabet.charAt(count)){
                count++;
            }
        }

        String text = input;
        int numberOfCharacters = 26;
        Set<String> characters = new HashSet<>();

        String regexp = "[a-zA-Z]";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);

        int index = 0;
        boolean foundAll = false;
        
        while (matcher.find() && !foundAll) {
            String s = matcher.group().toLowerCase();
            characters.add(s);
            if (characters.size() == numberOfCharacters) {
                foundAll = true;
            }
            index++;
        }
        if(foundAll){
            return "pangram";
        }else{
            return "not pangram";
        }
    }
}
