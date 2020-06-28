package squaresSum;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class NumbersTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Podaj rozmiar tablicy");
        int size = scanner.nextInt();
        double[] userNumbers = new double[size];

        for(int i=0; i < size; i++) {
            System.out.println("Podaj liczbe zmiennoprzecinkowa");
            userNumbers[i] = scanner.nextDouble();
        }
        System.out.println(Arrays.toString(userNumbers));

        double sumSquare = 0;
        for(double number: userNumbers) {
            sumSquare +=  (number * number);
        }
        System.out.println("Suma kwadratów: " + sumSquare);

    }
}
