package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma=0;

        try {
            while (scanner.hasNextLine()  && scanner.hasNextInt()){

                suma+=scanner.nextInt();
                System.out.println(suma);
                scanner.nextLine();
            }
        }
        finally{
            scanner.close();
        }

    }
}
