package assignment5;

/**
 *
 * @author thego
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    /**
     * Generates a certain number of letters of the alphabet
     * @param num the number of letters being generated.
     * @param caseType the case type (Uppercase or Lowercase)
     * @return a string containing the letters of the alphabet
     */
    public static String generateAlphabetString(int num, char caseType) {
        String str = "";
        char alphabet = 'a';
        if (num <= 0)
            return str;
        if (caseType == 'u' || caseType == 'U')
            alphabet = Character.toUpperCase(alphabet);
        else if (caseType == 'l' || caseType == 'L')
            alphabet = Character.toLowerCase(alphabet);
        char letter = alphabet;
        for (int i = 0; i < num; i++) {
            if (i % 26 == 0)
                alphabet = letter;
            str = str + alphabet;
            alphabet++;
        }
        return str;
    }
    /**
     * Takes a string and creates a new string, where all the characters of the 
     * original string are hidden except the one at the index inputted
     * @param str the original string
     * @param idx the index of the character to be shown
     * @return the new string showing only the character at idx.
     */
    public static String hideCharacter(String str, int idx) {
        String newStr = "";
        if (idx < 0 || idx > str.length() - 1)
            return str;
        for (int i = 0; i < str.length(); i++) {
            if (i == idx)
                newStr += str.charAt(idx);
            else
                newStr += '-';
        }
        return newStr;
    }
    /**
     * Checks to see if the string inputted contains the character inputted, while 
     * ignoring the case.
     * @param str the string inputted
     * @param c the character inputted
     * @return true or false, if the string contains the character.
     */
    public static boolean containsIgnoreCase(String str, char c) {
        str = str.toLowerCase();
        c = Character.toLowerCase(c);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==  c) return true;
        }
        return false;
    }
    /**
     * Takes a string and shifts all the characters by "delta" amount in the alphabet.
     * E.g. strIn = Hi, delta = 1 -> newStr = Ij
     * @param strIn the string inputted
     * @param delta the number of times the letters should shift and direction
     * (positive or negative
     * @return a new string with the characters shifted by delta.
     */
    public static String encode(String strIn, int delta) {
        String newStr = "";
        double posDelta;
        for (int i = 0; i < strIn.length(); i++) {
            char c = strIn.charAt(i);
            System.out.println(c);
            if (!Character.isLetter(c))
                newStr += c;
            else {
                if (c + delta < 97  && c + delta >  90) //97 is value for 'a' in ascii table
                    if (delta == -1)                     //90 is value for 'Z' in ascii table
                        c += 27 + delta;
                    else if (delta < -1) 
                        c += 27 + delta + 1;
                if (delta < 0) {
                    posDelta = Math.pow(delta, 2);
                    posDelta = Math.sqrt(posDelta);
                    c -= posDelta;
                }
                else 
                    c += delta;
                newStr += c;
            }    
        }
        return newStr;
    }
}

