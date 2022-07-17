package Tema5;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        for (int i = 0; i < n; n--) {
            fact = fact * n;

        }
        System.out.println(fact);


    }


}
