package exercises;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(reverse("RANSLIRPA"));
        System.out.println();
        System.out.println(reverse("XELA"));
    }


    public static String reverse(String s) {
        if (null == s || s.length() <= 1) {
            return s;
        } else {
            return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        }
    }
}
