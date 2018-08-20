package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int x = scanner.nextInt();
        while (x-- > 0) {
            scanner.nextLine();

            int number = scanner.nextInt();
            if (isPrime(number)) {
                System.out.println("TAK");
            } else System.out.println("NIE");

        }
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number == 1) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
