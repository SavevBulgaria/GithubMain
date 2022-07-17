package Tema5;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean Prime = n >= 2;


        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                Prime = false;
                break;

            }
            if (Prime) {
                System.out.println("Is Prime");
            } else
                System.out.println("Not prime");


        }


    }


}
