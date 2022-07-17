package ClassWork2;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int povtorenia = n * 2;
        int L = 0, R = 0;

        for (int i = 0; i < povtorenia; i++) {
            if (i == 0) {
                System.out.println("Enter Left sum");
            } else if (i == n) {
                System.out.println("Enter Right sum");
            }
            if (i < n) {
                int num1 = Integer.parseInt(input.nextLine());
            } else if (i >= n) {
                int num2 = Integer.parseInt(input.nextLine());

                int dif = 0;
                if (R > L) {
                    dif = R - L;
                    System.out.println("Difference=" + dif);
                } else if (L > R) {
                    dif = L - R;
                    System.out.println("Difference=" + dif);

                }

            }
        }

    }
}