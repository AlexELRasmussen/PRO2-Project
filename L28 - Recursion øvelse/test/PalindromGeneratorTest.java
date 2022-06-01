import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromGeneratorTest
{
    ArrayList<String> palindromdatoer;

    @BeforeEach
    void setUp() throws Exception
    {
        palindromdatoer = new ArrayList<String>();

        File palindromTxt = new File("C:\\Users\\a-001\\IdeaProjects\\PRO2-Project\\L28 - Recursion øvelse\\test\\test-palindrom-datoer.txt");
        Scanner palindromScanner = new Scanner(palindromTxt);
        while (palindromScanner.hasNextLine())
        {
            String data = palindromScanner.nextLine();
            palindromdatoer.add(data);
        }
        palindromScanner.close();
    }

    @Test
    void test()
    {
        fail("Not yet implemented");
    }

}
