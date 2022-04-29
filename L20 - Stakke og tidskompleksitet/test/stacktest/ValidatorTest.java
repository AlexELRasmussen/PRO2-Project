package stacktest;

import org.junit.jupiter.api.Test;
import stack.Validator;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void validateBrackets() {
        // Arrange
        Validator validator = new Validator();
        String beTrue = "(3+{5{99{*}}[23[{67}67]]})";
        String befalse = "(}){";

        // Act and Assert
        assertTrue(validator.validateBrackets(beTrue));
        assertFalse(validator.validateBrackets(befalse));


    }
}