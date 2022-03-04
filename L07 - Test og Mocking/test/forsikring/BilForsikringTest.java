package forsikring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {

    private BilForsikring bilForsikring;
    private double grundPr;

    @BeforeEach
    public void setUpBeforeEach() {
        this.bilForsikring = new BilForsikring();
        this.grundPr = 500;
    }

    @Test
    void setGrundpaemie() {

        // Arrange
        double grundPr = this.grundPr + 1;
        // Act
        bilForsikring.setGrundpaemie(grundPr);
        // Assert
        assertEquals(bilForsikring.getGrundPraemie(), grundPr);
    }

    /**
     * Beregner og returnerer en præmie udregnet ud fra følgende regler:
     * grundPræmie danner udgangspunkt for præmien
     * hvis der er tale om unge under 25 tillægges grundPræmien 25%
     * hvis der er tale om en kvinde reduceres præmien med 5%
     * hvis man har kørt skadefrit i:
     * 0 til 2 år reduceres præmien med 0%
     * 3 til 5 år reduceres præmien med 15%
     * 6 til 8 år reduceres præmien med 25%
     * over 8 år reduceres præmien med 35%
     * ovenstående skal udregnes i den angivne rækkefølge
     *
     * Hvis parametrene ikke er indenfor det gyldige område
     * kastes en exception med en passende tekst
     *
     * Krav: grundPræmie er tildelt værdi.
     */

    @Test
    void beregnPraemie_Throw_RuntimeException() {

        // Arrange
        BilForsikring bf = new BilForsikring();
        int alder = 25;
        boolean kvinde = true;
        int skadeFrieAar = 2;
        // Act & Assert
        Exception exception = assertThrows(RuntimeException.class, () ->
                bf.beregnPraemie(alder,kvinde,skadeFrieAar));
        assertTrue(exception.getMessage().contains("GrundPraemie har ikke faeet en vaerdi"));
    }

    @Test
    void beregnPraemie_alder_under_25_kvinde() {

        // Arrange
        BilForsikring bf = new BilForsikring();
        int alder = 19;
        boolean kvinde = true;
        int skadeFrieAar = 1;
        bf.setGrundpaemie(500);
        // Act
        double praemie = bf.beregnPraemie(alder,kvinde,skadeFrieAar);

        // Assert
        assertEquals(bf.getGrundPraemie() * 1.25 * 0.95,praemie);
    }

    @Test
    void beregnPraemie_alder_over_25_mand_skadeFri_over_2() {

        // Arrange
        BilForsikring bf = new BilForsikring();
        int alder = 30;
        boolean kvinde = false;
        int skadeFrieAar = 3;
        bf.setGrundpaemie(500);
        // Act
        double praemie = bf.beregnPraemie(alder,kvinde,skadeFrieAar);

        // Assert
        assertEquals(bf.getGrundPraemie() * 0.85,praemie);
    }

    @Test
    void beregnPraemie_alder_over_25_mand_skadeFri_over_6() {

        // Arrange
        BilForsikring bf = new BilForsikring();
        int alder = 30;
        boolean kvinde = false;
        int skadeFrieAar = 7;
        bf.setGrundpaemie(500);
        // Act
        double praemie = bf.beregnPraemie(alder,kvinde,skadeFrieAar);

        // Assert
        assertEquals(bf.getGrundPraemie() * 0.75,praemie);
    }

    @Test
    void beregnPraemie_alder_over_25_mand_skadeFri_over_9() {

        // Arrange
        BilForsikring bf = new BilForsikring();
        int alder = 30;
        boolean kvinde = false;
        int skadeFrieAar = 9;
        bf.setGrundpaemie(500);
        // Act
        double praemie = bf.beregnPraemie(alder,kvinde,skadeFrieAar);

        // Assert
        assertEquals(bf.getGrundPraemie() * 0.65,praemie);
    }
}