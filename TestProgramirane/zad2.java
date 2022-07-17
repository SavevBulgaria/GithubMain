package TestProgramirane;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() + 2;
        int z = scanner.nextInt();
        int stars = 1;
        int spaces = (n - stars) / 2;


        if (n % 2 != 0) {
            for (int b = 0; b < n; b++) {
                if (stars == n) {
                    break;
                }


                for (int i = 0; i < spaces; i++) {
                    System.out.print(" ");
                }
                for (int a = 0; a < +stars; a++) {
                    System.out.print("*");
                }
                for (int i = 0; i < spaces; i++) {
                    System.out.print(" ");
                }


                stars += 2;
                spaces -= 1;
                System.out.println();

            }
        } else {
                int stars1=2;
            int spaces1=(z-stars1)/2;
            for (int b = 0; b < z; b++) {
                if (stars1 == z) {
                    break;
                }


                for (int i = 0; i < spaces1; i++) {
                    System.out.print(" ");
                }
                for (int a = 0; a < +stars1; a++) {
                    System.out.print("*");
                }
                for (int i = 0; i < spaces1; i++) {
                    System.out.print(" ");
                }
                stars1+=2;
                spaces1 -= 1;
System.out.println();


            }


        }

    }
}







