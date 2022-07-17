package ClassWork5;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (b != 0) {
            int oldB = b;
            b = a % b;
            a = oldB;


        }
        System.out.println(a);

    }
}
