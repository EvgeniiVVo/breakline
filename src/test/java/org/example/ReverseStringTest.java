package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

@Test
    public void reverseString_shouldReturnString_ifContainsString(){
        String s = "J@va the be$t!123";
        String result = ReverseString.reverseString(s);
        Assertions.assertEquals("t@eb eht av$J!123", result);
    }

@Test
    public void reverseString_shouldReturnEmptyString_ifContainsNull(){
        String s = null;
        String result = ReverseString.reverseString(s);
        Assertions.assertEquals("", result);
    }

@Test
    public void reverseString_shouldKeepsNonLettersInPlace_ifNonLettersNothingChanges(){
        String s = "123 !@#";
        String result = ReverseString.reverseString(s);
        Assertions.assertEquals("123 !@#", result);
    }

@Test
    public void reverseString_shouldReversesOnlyLetters_ifOnlyLettersReverse(){
        String s = "abcd";
        String result = ReverseString.reverseString(s);
        Assertions.assertEquals("dcba", result);
    }

@Test
    public void reverseString_shouldReversesOneLetter_ifOneLetterNothingHappens(){
        String s = "a";
        String result = ReverseString.reverseString(s);
        Assertions.assertEquals("a", result);
    }

@Test
    public void reverseString_shouldKeepNonLettersInPlace_ifNonLettersOnSamePositions(){
    String s = "1J@va the be$t!";
    String result = ReverseString.reverseString(s);
    Assertions.assertEquals("1t@eb eht av$J!", result);
    }

@Test
    public void reverseString_shouldMoveLettersWithSaveRegister(){
        String s = "J@va";
        String result = ReverseString.reverseString(s);
        Assertions.assertEquals("a@vJ", result);
    }
}
