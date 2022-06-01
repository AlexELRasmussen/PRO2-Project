package palindrom;

import java.util.Locale;

public class PalindromValidatorMetoder implements PalindromValidatorI{

    @Override
    public boolean erGyldigtPalindrom(String tekst) {
        String lowerCasetekst = tekst.toLowerCase(Locale.ROOT);
        String lowerCaseNoSpecialtekst = lowerCasetekst.replaceAll("[^a-zA-Z0-9]", "");
        String noSpaceLowerCaseNoSpecialtekst = lowerCaseNoSpecialtekst.replaceAll("\\s","");
        return erGyldigtPalindrom(noSpaceLowerCaseNoSpecialtekst, 0,noSpaceLowerCaseNoSpecialtekst.length() - 1);
    }

    private boolean erGyldigtPalindrom(String tekst, int start, int slut) {
        Character charStart = tekst.charAt(start);
        Character charSlut = tekst.charAt(slut);
        if (!charStart.equals(charSlut)) {
            return false;
        }
        if (slut - start <= 1) {
            return true;
        } else {
            return erGyldigtPalindrom(tekst,start + 1,slut - 1);
        }
    }






    @Override
    public boolean erGyldigtPalindromPrimtal(int tal) {
        return false;
    }
}
