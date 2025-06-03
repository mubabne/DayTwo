import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double s = sc.nextDouble();
            double p = 0, n, ns;

            if (s >= 0 && s <= 400.00) {
                p = 15;
            } else if (s >= 400.01 && s <= 800.00) {
                p = 12;
            } else if (s >= 800.01 && s <= 1200.00) {
                p = 10;
            } else if (s >= 1200.01 && s <= 2000.00) {
                p = 7;
            } else if (s >= 2000.01) {
                p = 4;
            }

            ns = s + (s * (p / 100));
            n = ns - s;

            System.out.printf("Novo salario: %.2f%n", ns);
            System.out.printf("Reajuste ganho: %.2f%n", n);
            System.out.printf("Em percentual: %.0f %%\n", p);
        }
    }
}
