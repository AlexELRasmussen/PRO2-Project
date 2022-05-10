package snackssupply;

import snacks.Snack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SnackBar <E extends Comparable<E>>
{
    public ArrayList<E> sortSnacks(E[] snackContainer) {
        ArrayList<E> sorted = new ArrayList<>(Arrays.asList(snackContainer));
        Collections.sort(sorted);
        return sorted;
    }
}
