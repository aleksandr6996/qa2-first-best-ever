package homeworks;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Homework1 {

    @Test

    //METOD, KOTORIJ POSCITAET KOL. SIMVOLOV I SLOV

    public static void main(String[] args) {

        String s = "I am Aleksandrs and do not understand anything!";
        int len = s.length();
        System.out.println("length line: " + len + " symbol.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input words in one line using space");
        String input = sc.nextLine();
        int count = 0;

        if (input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {

                    count++;
                }
            }
        }
        System.out.println("You entered " + count + " words");

    }
}