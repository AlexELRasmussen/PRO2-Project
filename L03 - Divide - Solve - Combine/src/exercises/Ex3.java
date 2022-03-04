package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(8, 56, 45, 34, 15, 12, 34, 44));
        mergesort(ints);
        System.out.println(ints);

    }

    public static void mergesort(ArrayList<Integer> list) {
        mergesort(list, 0, list.size() - 1);
    }

    private static void mergesort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m);
            mergesort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }

    private static void merge(ArrayList<Integer> list, int low, int middle, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
// <flet list[low..middle] og list[middle+1..high] over i
// en ny liste (temp) ved en total fletning>
// <list[low..high] = temp>
        int i1 = low;
        int i2 = middle+1;

        while (i1 <= middle && i2 <= high) {
            if (list.get(i1) <= list.get(i2)) {
// venstresidens tal er mindst
                temp.add(list.get(i1));
                i1++;
            }
            else {
// højresidens tal er mindst
                temp.add(list.get(i2));
                i2++;
            }
        }
// tøm den del liste der ikke er tom
        while (i1 <= middle) {
            temp.add(list.get(i1));
            i1++;
        }
        while (i2 <= high) {
            temp.add(list.get(i2));
            i2++;
        }

        for (int i = 0; i < temp.size(); i++) {
            list.set(i + low, temp.get(i));
        }
    }
}
