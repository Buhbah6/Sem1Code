/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thego
 */
public class Assignment5Test {
    
    public Assignment5Test() {
    }
    /**
     * Test of main method, of class Assignment5.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Assignment5.main(args);
    }

    /**
     * Test of generateAlphabetString method, of class Assignment5.
     */
    @Test
    public void testGenerateAlphabetString() {
        System.out.println("generateAlphabetString");
        int num = 3;
        char caseType = 'u';
        String expResult = "ABC";
        String result = Assignment5.generateAlphabetString(num, caseType);
        assertEquals(expResult, result);
    }
    @Test
    public void testGenerateAlphabetString2() {
        System.out.println("generateAlphabetString");
        int num = 6;
        char caseType = 'l';
        String expResult = "abcdef";
        String result = Assignment5.generateAlphabetString(num, caseType);
        assertEquals(expResult, result);
    }
    @Test
    public void testGenerateAlphabetString3() {
        System.out.println("generateAlphabetString");
        int num = -3;
        char caseType = 'L';
        String expResult = "";
        String result = Assignment5.generateAlphabetString(num, caseType);
        assertEquals(expResult, result);
    }
    @Test
    public void testGenerateAlphabetString4() {
        System.out.println("generateAlphabetString");
        int num = 27;
        char caseType = 'U';
        String expResult = "ABCDEFGHIJKLMNOPQRSTUVWXYZA";
        String result = Assignment5.generateAlphabetString(num, caseType);
        assertEquals(expResult, result);
    }

    /**
     * Test of hideCharacter method, of class Assignment5.
     */
    @Test
    public void testHideCharacter() {
        System.out.println("hideCharacter");
        String str = "hello";
        int idx = 3;
        String expResult = "---l-";
        String result = Assignment5.hideCharacter(str, idx);
        assertEquals(expResult, result);    
    }
    @Test
    public void testHideCharacter2() {
        System.out.println("hideCharacter");
        String str = "java";
        int idx = 1;
        String expResult = "-a--";
        String result = Assignment5.hideCharacter(str, idx);
        assertEquals(expResult, result);    
    }
    @Test
    public void testHideCharacter3() {
        System.out.println("hideCharacter");
        String str = "hmmm";
        int idx = 4;
        String expResult = "hmmm";
        String result = Assignment5.hideCharacter(str, idx);
        assertEquals(expResult, result);    
    }
    @Test
    public void testHideCharacter4() {
        System.out.println("hideCharacter");
        String str = "hmmm";
        int idx = -3;
        String expResult = "hmmm";
        String result = Assignment5.hideCharacter(str, idx);
        assertEquals(expResult, result);    
    }
    
    /**
     * Test of constainsIgnoreCase method, of class Assignment5.
     */
    @Test
    public void testContainsIgnoreCase() {
        System.out.println("constainsIgnoreCase");
        String str = "hello";
        char c = 'H';
        boolean expResult = true;
        boolean result = Assignment5.containsIgnoreCase(str, c);
        assertEquals(expResult, result);
    }
    @Test
    public void testContainsIgnoreCase2() {
        System.out.println("constainsIgnoreCase");
        String str = "java";
        char c = 'A';
        boolean expResult = true;
        boolean result = Assignment5.containsIgnoreCase(str, c);
        assertEquals(expResult, result);
    }
    @Test
    public void testContainsIgnoreCase3() {
        System.out.println("constainsIgnoreCase");
        String str = "hmmm";
        char c = 'A';
        boolean expResult = false;
        boolean result = Assignment5.containsIgnoreCase(str, c);
        assertEquals(expResult, result);
    }
    @Test
    public void testContainsIgnoreCase4() {
        System.out.println("constainsIgnoreCase");
        String str = "";
        char c = 'a';
        boolean expResult = false;
        boolean result = Assignment5.containsIgnoreCase(str, c);
        assertEquals(expResult, result);
    }
    @Test
    public void testContainsIgnoreCase5() {
        System.out.println("constainsIgnoreCase");
        String str = "Wow!";
        char c = '!';
        boolean expResult = true;
        boolean result = Assignment5.containsIgnoreCase(str, c);
        assertEquals(expResult, result);
    }

    /**
     * Test of encode method, of class Assignment5.
     */
    @Test
    public void testEncode() {
        System.out.println("encode");
        String strIn = "hello";
        int delta = 1;
        String expResult = "ifmmp";
        String result = Assignment5.encode(strIn, delta);
        assertEquals(expResult, result);
    }
    @Test
    public void testEncode2() {
        System.out.println("encode");
        String strIn = "java";
        int delta = -1;
        String expResult = "izuz";
        String result = Assignment5.encode(strIn, delta);
        assertEquals(expResult, result);
    }
    @Test
    public void testEncode3() {
        System.out.println("encode");
        String strIn = "hmmm";
        int delta = 3;
        String expResult = "kppp";
        String result = Assignment5.encode(strIn, delta);
        assertEquals(expResult, result);
    }
    @Test
    public void testEncode4() {
        System.out.println("encode");
        String strIn = "Yeah!";
        int delta = -2;
        String expResult = "Wcyf!";
        String result = Assignment5.encode(strIn, delta);
        assertEquals(expResult, result);
    } 
    @Test
    public void testEncode5() {
        System.out.println("encode");
        String strIn = "";
        int delta = 5;
        String expResult = "";
        String result = Assignment5.encode(strIn, delta);
        assertEquals(expResult, result);
    }    
}
