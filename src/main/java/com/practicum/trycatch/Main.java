package com.practicum.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
}

class ExceptionHandling {

    static public int getAndPrintInteger() {
        Scanner scanner = new Scanner(System.in);
        boolean isIntInputGiven = false;
        int value;
        while (true) {
            try {
                value = scanner.nextInt();
                System.out.println("Вы ввели с клавиатуры " + value);
                isIntInputGiven = true;
                return value;
            } catch (InputMismatchException ime) {
                System.out.println("Неправильный ввод!");
            } finally {
                System.out.print("Мы в блоке finally и сейчас");
                if (isIntInputGiven) {
                    System.out.println(" закроем сканер");
                    scanner.close();
                } else  {
                    System.out.println(" очистим сканер");
                    scanner.next();
                }
            }
        }
    }

    static public int whatsFinallyReturned(int i) {
        try {
            if (i == 0)
                throw new Exception();
            return 0;
        } catch (Exception e) {
            return 1;
        } finally {
//            return 2;
        }
    }
}