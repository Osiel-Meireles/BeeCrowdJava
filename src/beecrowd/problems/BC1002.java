package beecrowd.problems;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class BC1002 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scanner = new Scanner(System.in);

        double n = 3.14159D;
        double raio = scanner.nextDouble();

        double area = n * Math.pow(raio, 2);

        System.out.printf("A=%.4f", area);

        scanner.close();
    }
}
