package exercises;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("På cat");
        printAnagrams("","cat");
        System.out.println();
    }

    public static void printAnagrams(String prefix, String word) {
        if (word.length() <= 1) {
            System.out.println(prefix + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                String p = prefix + word.charAt(i);
                String w = word.substring(0, i) + word.substring(i + 1);
                printAnagrams(p, w);
            }
        }
    }
}
