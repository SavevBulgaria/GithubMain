package ClassWork3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        String symbol = "$";
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(symbol);
            }
            System.out.println();
            b++;
        }
    }
}