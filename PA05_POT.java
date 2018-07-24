package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 1000000000;
        int[][] array;
        array = new int[][]{{0, 0, 0, 0},
                {1, 1, 1, 1},
                {6, 2, 4, 8},
                {1, 3, 9, 7},
                {6, 4, 6, 4},
                {5, 5, 5, 5},
                {6, 6, 6, 6},
                {1, 7, 9, 3},
                {6, 8, 4, 2},
                {1, 9, 1, 9}};
        int D = 0;
        Scanner scanner = new Scanner(System.in);
        String[] nextNum;
        D = scanner.nextInt();
        scanner.nextLine();
        for (int j = 0; j < D; j++) {
            nextNum = scanner.nextLine().split(" ");
            int a = Integer.parseInt(nextNum[0]);
            int b = Integer.parseInt(nextNum[1]);
            int x = a % 10;
            int y = b % 4;
            System.out.println(array[x][y]);
        }
        scanner.close();
    }
}
