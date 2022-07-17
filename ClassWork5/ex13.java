package ClassWork5;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 1;
        for (int row = 0; row < n; row++) {

            for (int col = 0; col < row; col++) {
                if (col > 1) ;
                System.out.print(" ");
                System.out.print(num);
                num++;
                if (num > n) {
                    break;
                }
            }
            System.out.println();
            if (num > n) {
                break;
            }
        }

    }

}
