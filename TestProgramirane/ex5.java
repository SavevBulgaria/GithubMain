package TestProgramirane;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //*****
//         ***
//          *
        Scanner scanner = new Scanner(System.in);
        int stars = scanner.nextInt();
        int spaces = 1;
        int n = stars;
        for (int i = 0; i < n; i++) {
            for (int d = 0; d < stars; d++) {

                System.out.print("*");
            }
            System.out.println();
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            stars -= 2;
            spaces++;
        }


    }
}
