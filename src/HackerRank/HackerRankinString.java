/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

/*
 *
 * We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank.
 * For example :
 * hereiamstackerrank    (YES = hackerrank)
 *  hackerworld          (NO=  hacker....)
 */
public class HackerRankinString {

    public static void main(String[] args) {
        System.out.println(HackerRankinString.hackerrankInString("hackerranoooooo"));;
    }
    static String hackerrankInString(String s) {
        String str = "hackerrank";
        if(s.length()<str.length()){
            return "NO";
        }
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(count<str.length()&&s.charAt(i)==str.charAt(count)){
                count++;
            }
        }
        return (count==str.length() ? "YES":"NO");
    }

}
