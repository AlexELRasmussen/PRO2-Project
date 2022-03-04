package exercises;

import java.util.ArrayList;

public class Ex0 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 1; i < 15; i++) {
            ints.add(i);
        }

        System.out.println(calcEvenNumbers(ints));
    }

    public static int calcEvenNumbers(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return list.size();
        } else {
            return readAndCalc(list);
        }
    }

    public static int readAndCalc(ArrayList<Integer> list) {
        int temp = 0;
        for (int i : list) {
            if (i % 2 == 0) {
                temp++;
            }
        }
        return temp;
    }
}
