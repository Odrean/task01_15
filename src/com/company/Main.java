package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = readNumber();

        int inverted_number = invertNumber(number);

        System.out.print("Перевернутое число: ");
        System.out.println(inverted_number);
    }

    public static int readNumber() {
        System.out.println("Введите трехзначное число");

        Scanner scanner = new Scanner(System.in);

        int readedNumber = 0;

        if (scanner.hasNextInt()) {
            readedNumber = scanner.nextInt();

        } else {
            System.out.println("Вы ввели некорректные данные");
            return readNumber();
        }

        if ( (readedNumber % 10 != 0) && ((readedNumber > -1000 && readedNumber < -99) || (readedNumber > 99 && readedNumber < 1000)) ) {

            System.out.print("Вы ввели трехзначное число: ");
            System.out.println(readedNumber);

        } else {
            System.out.println("Вы ввели не трехзначное число");
            return readNumber();
        }

        return readedNumber;
    }

    public static int invertNumber(int number) {
        int inverted_number = 0;

        for (int degree = 2; degree >= 0; degree--) {

            inverted_number += number % 10 * Math.pow(10, degree);
            number /= 10;
        }

        return inverted_number;
    }
}
