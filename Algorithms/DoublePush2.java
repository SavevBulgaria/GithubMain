package Algorithms;

import java.util.Random;
import java.util.Scanner;

public class DoublePush2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println(r.nextInt(1000));
        int b = r.nextInt(1000);
        int a = scanner.nextInt();
        while (a != b) {
            System.out.print("Enter a number: ");


           if (b == a) {
                System.out.println("That's the number");
                break;
            }

            if (a < b) {
                System.out.println("Number is smaller");
            }
            if (a > b) {
                System.out.println("Number is bigger");
            }


        }

    }
}