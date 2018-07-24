package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nextNum;
        int D = 0;
        int x, y;
        D = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < D; i++) {
            x = 0;
            y = 0;
            int N = 0;
            N = scanner.nextInt();
            scanner.nextLine();
            for (int j = 0; j < N; j++) {
                nextNum = scanner.nextLine().split(" ");
                int direction = Integer.parseInt(nextNum[0]);
                int steps = Integer.parseInt(nextNum[1]);

                switch (direction) {
                    default:
                        break;
                    case 0:
                        y = y + steps;
                        break;
                    case 1:
                        y = y - steps;
                        break;
                    case 2:
                        x = x - steps;
                        break;
                    case 3:
                        x = x + steps;
                        break;
                }
//                if(direction==0){ y = y + steps; }
//                else if(direction==1){y = y - steps;}
//                else if(direction==2){x = x - steps;}
//                else if(direction==3){ x = x + steps;}
            }
            if (x == 0 && y == 0) {
                System.out.println("studnia");
                continue;
            }
            if (x == 0 && y != 0) {
                if (y > 0) {
                    System.out.println(0 + " " + y);
                } else {
                    System.out.println(1 + " " + (-y));
                }
                continue;
            }
            if (x != 0 && y == 0) {
                if (x > 0) {
                    System.out.println(3 + " " + x);
                } else {
                    System.out.println(2 + " " + (-x));
                }
                continue;
            }
            if (y > 0) {
                System.out.println(0 + " " + y);
            } else System.out.println(1 + " " + (-y));
            if (x > 0) {
                System.out.println(3 + " " + x);
            } else System.out.println(2 + " " + (-x));
        }
        scanner.close();

    }
}
