package Tema5;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int f0 = 1;
        int f1 = 1;

        for (int i = 0; i < n - 1; i++) {
            int fNext = f1 + f0;
            f0 = f1;
            f1 = fNext;
        }
        System.out.println(f1);
    }

}
