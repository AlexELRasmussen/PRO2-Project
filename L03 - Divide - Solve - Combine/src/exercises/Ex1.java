package exercises;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i <= 15; i++) {
            ints.add(i);
        }
        System.out.println(total(ints));

    }
    public static int total(ArrayList<Integer> list) {
        return totalOfList(list,0,list.size() - 1);
    }

    private static int totalOfList(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int total1 = totalOfList(list, l, m);
            int total2 = totalOfList(list, m + 1, h);
            return total1 + total2;
        }
    }
}
