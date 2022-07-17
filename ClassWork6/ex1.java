package ClassWork6;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int q2;
        for (int q1 = 0; q1 <= n; q1++) {
            System.out.print(q1);
            for (q2 = 0; q2 < a; q2++) {
                System.out.print(q2);
            }
            for (char l1 = 'a'; l1 < 'a' + 1; l1++) {
                System.out.print(l1);
            }
            for (char l2 = 'a'; l2 < 'a' + 1; l2++) {
                System.out.print(l2);
            }
            for (int q3 = Math.max(q1, q2) + 1; q3 <= n; q3++) {
                System.out.print(q3);
            }

            System.out.println();
        }


    }
}
