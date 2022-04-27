package exercise2;

public class CounterMain {

    public static void main(String[] args) {
        Counter c1 = Counter.getInstance();
        Counter c2 = Counter.getInstance();

        System.out.println(c1.getValue());
        c1.count();
        System.out.println(c1.getValue());
        c1.count();
        System.out.println(c2.getValue());
        c2.times2();
        System.out.println(c2.getValue());
        c2.zero();
        System.out.println(c1.getValue());
    }
}
