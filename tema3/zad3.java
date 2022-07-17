package tema3;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int a = input.nextInt();

        String symbol = " * ";
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(symbol);
            }
            System.out.println();

        }


    }
}
