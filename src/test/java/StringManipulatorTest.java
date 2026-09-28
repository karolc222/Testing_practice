import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTest {    

    @Test
    @DisplayName("reverses input string")
    void reverseStringReturnsReversedString() {

        //instantiating StringManipulator class 
        StringManipulator stringManipulator = new StringManipulator();
        String input = "hey";

        //calling the method from that class 
        String result = stringManipulator.reverseString(input);

        assertEquals("yeh", result);
    }

    @Test
    @DisplayName("checks if a string is a palindrome")
    void checksIfStringIsAPalindrome() {

        StringManipulator stringManipulator = new StringManipulator();
        String input = "hey";

        boolean resultP = stringManipulator.isPalindrome(input);

        assertEquals(false, resultP);
        }
    }