package Tema6;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int S = scanner.nextInt();

        for (; N < M; ) {
            if (M == S + 1) {
                break;
            }

            if (M % 2 == 0 && M % 3 == 0) {
                System.out.println(M + "");

            }

            M--;
        }


    }

}

