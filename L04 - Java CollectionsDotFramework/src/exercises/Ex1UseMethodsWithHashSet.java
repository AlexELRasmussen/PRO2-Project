package exercises;

import java.util.HashSet;
import java.util.Set;

public class Ex1UseMethodsWithHashSet {
    public static void main(String[] args) {
//      A
        Set<Integer> set = new HashSet<>();
//      B
        set.add(34);
        set.add(12);
        set.add(23);
        set.add(45);
        set.add(67);
        set.add(98);
//      C
        System.out.println(set);
        System.out.println();
//      D
        set.add(23);
//      E
        System.out.println(set);
        System.out.println();
//      F
        set.remove(67);
//      G
        System.out.println(set);
        System.out.println();
//      H
        System.out.println("Set contains the number 23? = " + set.contains(23));
        System.out.println();
//      I
        System.out.println("Number of  integers in the set: " + set.size());
    }
}
