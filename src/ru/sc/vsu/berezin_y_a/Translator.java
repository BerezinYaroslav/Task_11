package ru.sc.vsu.berezin_y_a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Translator {

    MoneyInWords moneyInWords = new MoneyInWords();

    private void takeSpace(StringBuilder sb) {
        sb.append(" ");
    }

    public String translateNumberToWords(int number) {

        StringBuilder sb = new StringBuilder(100);

        String strNumber = String.valueOf(number);
        int len = strNumber.length();

        List<Integer> symbols = new ArrayList<>();

        for (int i = 0; i < strNumber.length(); i++) {
            char a = strNumber.charAt(i);
            int b = a - '0';
            symbols.add(b);
        }

        if ((number < 1) || (number > 1000000)) {
            return "Введенное число должно быть от 1 до 1 000 000.";
        } else if (len > 6) {
            sb.append(moneyInWords.rank1[1][0]);
            takeSpace(sb);
            sb.append(moneyInWords.rank5[0]);
            return sb.toString().trim();
        } else {
            if ((len > 5) && (symbols.get(symbols.size() - 6) != 0)) {
                sb.append(moneyInWords.rank3[symbols.get(symbols.size() - 6) - 1]);
                takeSpace(sb);
            }
            if ((len > 4) && (symbols.get(symbols.size() - 5) == 1)) {
                sb.append(moneyInWords.rank2_1[symbols.get(symbols.size() - 4)]);
                takeSpace(sb);
                sb.append(moneyInWords.rank4[2]);
                takeSpace(sb);
            } else {
                if ((len > 4) && (symbols.get(symbols.size() - 5) != 1) && (symbols.get(symbols.size() - 5) != 0)) {
                    sb.append(moneyInWords.rank2_2[symbols.get(symbols.size() - 5) - 2]);
                    takeSpace(sb);
                }
                if ((len > 3) && (symbols.get(symbols.size() - 4) != 0)) {
                    sb.append(moneyInWords.rank1[0][symbols.get(symbols.size() - 4) - 1]);
                    takeSpace(sb);
                    if (symbols.get(symbols.size() - 4) == 1) {
                        sb.append(moneyInWords.rank4[0]);
                    } else if (symbols.get(symbols.size() - 4) > 5){
                        sb.append(moneyInWords.rank4[2]);
                    } else {
                        sb.append(moneyInWords.rank4[1]);
                    }
                    takeSpace(sb);
                } else if ((len > 3) && (symbols.get(symbols.size() - 4) == 0)) {
                    sb.append(moneyInWords.rank4[2]);
                    takeSpace(sb);
                }
            }
            if ((len > 2) && (symbols.get(symbols.size() - 3) != 0)) {
                sb.append(moneyInWords.rank3[symbols.get(symbols.size() - 3) - 1]);
                takeSpace(sb);
            }
            if ((len > 1) && (symbols.get(symbols.size() - 2) != 0) && (symbols.get(symbols.size() - 2) != 1)) {
                sb.append(moneyInWords.rank2_2[symbols.get(symbols.size() - 2) - 2]);
                takeSpace(sb);
            }
            if ((strNumber.length() > 1) && (symbols.get(symbols.size() - 2) == 1)) {
                sb.append(moneyInWords.rank2_1[symbols.get(symbols.size() - 1)]);
            }
            if (len == 1) {
                if (symbols.get(symbols.size() - 1) == 1) {
                    sb.append(moneyInWords.rank1[1][0]);
                } else if (symbols.get(symbols.size() - 1) == 2) {
                    sb.append(moneyInWords.rank1[1][1]);
                } else {
                    sb.append(moneyInWords.rank1[0][symbols.get(symbols.size() - 1) - 1]);
                }
            } else {
                if ((symbols.get(symbols.size() - 1) != 0) && (symbols.get(symbols.size() - 2) != 1)) {
                    if (symbols.get(symbols.size() - 1) == 1) {
                        sb.append(moneyInWords.rank1[1][0]);
                    } else if (symbols.get(symbols.size() - 1) == 2) {
                        sb.append(moneyInWords.rank1[1][1]);
                    } else {
                        sb.append(moneyInWords.rank1[0][symbols.get(symbols.size() - 1) - 1]);
                    }
                }
            }
        }

        return sb.toString().trim();

    }

    public int readIntFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName), "UTF-8");
        String line;
        line = scanner.nextLine();
        return Integer.parseInt(line);
    }

}
