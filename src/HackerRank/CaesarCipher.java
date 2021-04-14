package HackerRank;

public class CaesarCipher {
    /*
     Julius Caesar protected his confidential information by encrypting it using a cipher. 
     Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet,
     just rotate back to the front of the alphabet. 
     In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
    
     Original alphabet:      abcdefghijklmnopqrstuvwxyz
     Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
     */

    public static void main(String[] args) {
        CaesarCipher.caesarCipher("middle_Outz",2);
    }

    static String caesarCipher(String s, int k) {
        String originalAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String rotatedAlphabet = voo(k);
        StringBuilder str = new StringBuilder();
            for (char c : s.toCharArray()) {
//                System.out.println(c);
                if(Character.isUpperCase(c)){
                    int old = originalAlphabet.indexOf(Character.toLowerCase(c));
                    str.append(Character.toUpperCase(rotatedAlphabet.charAt(old)));
                    continue;
                }
                int old=originalAlphabet.indexOf(c);
//                System.out.println(old);
                if(!Character.isLetter(c)){
                    str.append(c);
                    continue;
                }
                str.append(rotatedAlphabet.charAt(old));
            }
        
        System.out.println(str);
        return str.toString();
    }
    
    public static String voo(int k){
        String originalAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String cut = originalAlphabet.substring(0, k);
        String alphabetRotated = originalAlphabet.substring(k);;
        return alphabetRotated.concat(cut);
    }

}
