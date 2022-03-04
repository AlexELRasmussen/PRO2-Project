package bibliotek;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BibliotekTest {

    @Test
    void beregnBøde_1til7_dage_overskreden_voksen() {

        // Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2022,3,1);
        LocalDate faktiskDato1dage = LocalDate.of(2022,3,2);
        LocalDate faktiskDato7dage = LocalDate.of(2022,3,8);
        boolean voksen = true;
        int expectedBøde = 20;
        // Act
        int actualBøde1dage = bibliotek.beregnBøde(beregnetDato,faktiskDato1dage,voksen);
        int actualBøde7dage = bibliotek.beregnBøde(beregnetDato,faktiskDato7dage,voksen);
        // Assert
        assertEquals(expectedBøde,actualBøde1dage);
        assertEquals(expectedBøde,actualBøde7dage);

    }

    @Test
    void beregnBøde_1til7_dage_overskreden_barn() {

        // Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2022,3,1);
        LocalDate faktiskDato1dage = LocalDate.of(2022,3,2);
        LocalDate faktiskDato7dage = LocalDate.of(2022,3,8);
        boolean voksen = false;
        int expectedBøde = 10;
        // Act
        int actualBøde1dage = bibliotek.beregnBøde(beregnetDato,faktiskDato1dage,voksen);
        int actualBøde7dage = bibliotek.beregnBøde(beregnetDato,faktiskDato7dage,voksen);
        // Assert
        assertEquals(expectedBøde,actualBøde1dage);
        assertEquals(expectedBøde,actualBøde7dage);

    }

    @Test
    void beregnBøde_8til14_dage_overskreden_voksen() {

        // Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2022,3,1);
        LocalDate faktiskDato8dage = LocalDate.of(2022,3,9);
        LocalDate faktiskDato14dage = LocalDate.of(2022,3,15);
        boolean voksen = true;
        int expectedBøde = 60;
        // Act
        int actualBøde1dage = bibliotek.beregnBøde(beregnetDato,faktiskDato8dage,voksen);
        int actualBøde7dage = bibliotek.beregnBøde(beregnetDato,faktiskDato14dage,voksen);
        // Assert
        assertEquals(expectedBøde,actualBøde1dage);
        assertEquals(expectedBøde,actualBøde7dage);

    }
}