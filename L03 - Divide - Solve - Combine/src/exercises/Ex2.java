package exercises;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                ints.add(0);
            } else {
                ints.add(i);
            }
        }
        System.out.println(count(ints));
    }

    public static int count(ArrayList<Integer> list) {
        return countOfZeroes(list,0,list.size() - 1);
    }

    private static int countOfZeroes(ArrayList<Integer> list, int l, int h) {
        int count = 0;
        if (l == h) {
            if (list.get(l) == 0) {
                count++;
            }
            return count;
//            return list.get(l) == 0 ? 1 : 0 <-- smart og hurtig måde at lave en "if/else" på
        } else {
            int m = (l + h) / 2;
            int count1 = countOfZeroes(list, l, m);
            int count2 = countOfZeroes(list, m + 1, h);
            return count1 + count2;
        }
    }
}
