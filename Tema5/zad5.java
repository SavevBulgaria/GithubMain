package Tema5;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;
        while (k <= n) {
            System.out.println(k);
            k = 2 * k + 1;
        }


    }
}
