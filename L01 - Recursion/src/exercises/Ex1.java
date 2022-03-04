package exercises;

public class Ex1 {

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static int factorial(int n) {
        int result;
        if (n == 1) {
            result = 1;
        } else {
            result = n * factorial(n-1);
        }
        return result;
    }
}
