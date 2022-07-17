package ClassWork3;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if(n % 2 == 0){
            int outerDash = n / 2 - 1;
            int midDash = 0;

            for (int rows = 0; rows < n / 2; rows++) {
                for (int i = 0; i < outerDash; i++) {
                    System.out.print("-");
                }

                System.out.print("*");
                for (int i = 0; i < midDash; i++) {
                    System.out.print("-");
                }
                System.out.print("*");

                for (int i = 0; i < outerDash; i++) {
                    System.out.print("-");
                }
                System.out.println();

                outerDash--;
                midDash += 2;
            }

            outerDash = 1;
            midDash = n - 4;

            for (int rows = 0; rows < n / 2 - 1; rows++) {
                for (int i = 0; i < outerDash; i++) {
                    System.out.print("-");
                }

                System.out.print("*");
                for (int i = 0; i < midDash; i++) {
                    System.out.print("-");
                }
                System.out.print("*");

                for (int i = 0; i < outerDash; i++) {
                    System.out.print("-");
                }
                System.out.println();

                outerDash++;
                midDash -= 2;
            }

        }
    }
}