import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import palindrom.PalindromValidatorMetoder;

import javax.naming.spi.ObjectFactory;

import static org.junit.jupiter.api.Assertions.*;

class PalindromValidatorTest
{
    ArrayList<String> palindromer;
    ArrayList<Integer> palindromprimtal;

    @BeforeEach
    void setUp() throws Exception
    {
        palindromer = new ArrayList<String>();

        File palindromTxt = new File("C:\\Users\\a-001\\IdeaProjects\\PRO2-Project\\L28 - Recursion øvelse\\test\\test-palindrom.txt");
        Scanner palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine())
        {
            String data = palindromScanner.nextLine();
            palindromer.add(data);
        }
        palindromScanner.close();

        palindromprimtal = new ArrayList<Integer>();

        palindromTxt = new File("C:\\Users\\a-001\\IdeaProjects\\PRO2-Project\\L28 - Recursion øvelse\\test\\test-palindrom-primtal.txt");
        palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine())
        {
            String data = palindromScanner.nextLine();
            palindromprimtal.add(Integer.parseInt(data));
        }
        palindromScanner.close();
    }

    @Test
    void canReadPalindromesAndReturnTrue()
    {
        PalindromValidatorMetoder palindromValidatorMetoder = new PalindromValidatorMetoder();
        for (String tekst : palindromer) {
            assertTrue(palindromValidatorMetoder.erGyldigtPalindrom(tekst));
        }
    }

    @Test
    void canReturnFalseWhenLineIsNotPalindrome()
    {
        // Arrange
        PalindromValidatorMetoder palindromValidatorMetoder = new PalindromValidatorMetoder();
        String notAPalindrome = "Denne Streng er ikke et Palindrom";
        // Act and assert
        assertFalse(palindromValidatorMetoder.erGyldigtPalindrom(notAPalindrome));
    }

}
