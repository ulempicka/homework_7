package revertedGreetings;

import java.util.Arrays;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Podaj 5 imion:");

        for(int i=0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(names));

        for(int i = names.length-1; i >= 0; i--) {
            System.out.println("Cześć " + names[i]);
        }
    }
}
