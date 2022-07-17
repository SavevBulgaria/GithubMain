package tema3;

import java.sql.Struct;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        String symbol = " * ";
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }


    }
}
