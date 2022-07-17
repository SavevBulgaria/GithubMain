package tema3;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.print("+ ");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" - ");
        }
        System.out.print(" + ");

        for (int j = 0; j < n - 2; j++) {
            System.out.println();
            System.out.print("| ");
            for (int i = 0; i < n - 2; i++) {
          System.out.print(" - ");  }
            System.out.print(" |");
        }
        System.out.println();
        System.out.print("+ ");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" - ");
        }
        System.out.print(" + ");


    }
}
