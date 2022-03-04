package exercises;

public class Ex3 {
    public static int calcNo(int n) {
        if (n == 0)
            return 2;
        else if (n == 1)
            return 0;
        else if (n == 2)
            return 5;
        else if (n % 2 == 0)
            return 2 * calcNo(n - 3) -calcNo(n -1);
        else {
            return calcNo(n -1) + calcNo(n - 2) + 3 * calcNo(n - 3);
        }
    }

    public static int calcNoIt(int n) {
        if (n == 0)
            return 2;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 5;
        else {
            int resf = 5;
            int resff = 1;
            int resfff = 2;

            for (int i = 3; i <= n; i++) {
                int res;
                if (i % 2 == 0) {
                    res = 2 * resfff - resf;
                } else {
                    res = resf + resff + 3 * resfff;
                }
                resfff = resff;
                resff = resf;
                resf = res;
            }
            return resf;
        }
    }
}
