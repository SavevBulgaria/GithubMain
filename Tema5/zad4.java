package Tema5;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        for (int i = 0; i <= n; i = i + 1) {
            System.out.println(num);
            num = num * 2;

        }
    }
}