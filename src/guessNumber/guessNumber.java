package guessNumber;

import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int userChoice = scanner.nextInt();
        boolean numberValidator = (userChoice >= 100) && (userChoice <= 200) && (userChoice % 3 == 0);

        while (!numberValidator) {
            if (userChoice < 100) {
                System.out.println("Podana liczba jest za mała");
                System.out.println("Podaj liczbę:");
                userChoice = scanner.nextInt();
            } else if (userChoice > 200) {
                System.out.println("Podana liczba jest za duża");
                System.out.println("Podaj liczbę:");
                userChoice = scanner.nextInt();
            } else if (userChoice % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
                System.out.println("Podaj liczbę:");
                userChoice = scanner.nextInt();
            } else {
                break;

            }
        }
        System.out.println("Twoja liczba jest ok!");
        scanner.close();
    }
}

