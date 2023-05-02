package Loop;

public class fibonanci {
    public static void main(String[] args) {
        int fn, fn_1, fn_2, n;

        n = 5;
        fn_2 = 0;
        fn_1 = 1;
        fn = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println("deret angka " + i + " adalah " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
    }
}
