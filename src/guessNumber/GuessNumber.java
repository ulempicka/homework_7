package guessNumber;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("Podaj liczbę:");
            userChoice = scanner.nextInt();
            if (userChoice < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (userChoice > 200) {
                System.out.println("Podana liczba jest za duża");
            } else if (userChoice % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
            }
        } while (!((userChoice >= 100) && (userChoice <= 200) && (userChoice % 3 == 0)));

        System.out.println("Twoja liczba jest ok!");
        scanner.close();
    }
}

