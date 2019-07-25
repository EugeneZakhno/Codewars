package ru.pojava;

import java.util.Scanner;

// http://pojava.ru/zadachi-po-java
public class JavaTasks {

    public static void main(String[] args) {

        System.out.println("Введите первое целое число");
        // считываю первое число из клавиатуры
        Scanner firstOperator = new Scanner(System.in);

        if (firstOperator.hasNextInt()) {
            int i = firstOperator.nextInt();

        System.out.println("Введите второе целое число");
        Scanner seconOperator = new Scanner(System.in);
        if (seconOperator.hasNextInt()) {
            int k = seconOperator.nextInt();

        System.out.println("Сумма " + i + " и " + k + " = " + (i + k));
            } else System.out.println("Ошибка. Вы ввели не целое число");
        } else System.out.println("Ошибка. Вы ввели не целое число");
    }
}

