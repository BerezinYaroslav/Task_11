package ru.sc.vsu.berezin_y_a;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Translator translator = new Translator();

        while (true) {
            int number = scanner.nextInt();
            System.out.println(translator.translateNumberToWords(number));
        }

    }

}
