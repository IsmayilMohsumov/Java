/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Paris
 */
public class StrongPassword {
/*
    Louise joined a social networking site to stay in touch with her friends.
    The signup page required her to input a name and a password. However, the password must be strong.
    The website considers a password to be strong if it satisfies the following criteria:

Its length is at least 6.
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
    */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(StrongPassword.main2("Abc!"));
    }

    public static int main2(String s) {
        int count = 0;

        Pattern patternDigit = Pattern.compile("(\\d)");
        Pattern patternUpper = Pattern.compile("([A-Z])");
        Pattern patternLower = Pattern.compile("([a-z])");
        Pattern patternSpecial = Pattern.compile("(\\W)");

        Matcher matcherDigit = patternDigit.matcher(s);
        Matcher matcherUpper = patternUpper.matcher(s);
        Matcher matcherLower = patternLower.matcher(s);
        Matcher matcherSpecial = patternSpecial.matcher(s);
        
        if (!matcherDigit.find()) {
            count++;
        }
        if (!matcherUpper.find()) {
            count++;
        }
        if (!matcherLower.find()) {
            count++;
        }
        if (!matcherSpecial.find()) {
            count++;
        }
        if ((count + s.length()) < 6) {
            count = count + 6 - (count + s.length());
        }
        return count;
    }

}
