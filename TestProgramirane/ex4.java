package TestProgramirane;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n + 1; i++) {
            System.out.print(".");
        }

        for (int i = 0; i < n * 2 + 1; i++) {
            System.out.print("_");
        }

        for (int i = 0; i < n + 1; i++) {
            System.out.print(".");
        }
        System.out.println();

        int innerDots = n;
        int midLower = n * 2 - 1;

        for (int rows = 0; rows < n; rows++) {
            for (int i = 0; i < innerDots; i++) {
                System.out.print(".");
            }
            System.out.print("//");
            for (int i = 0; i < midLower; i++) {
                System.out.print("_");
            }
            System.out.print("\\\\");
            for (int i = 0; i < innerDots; i++) {
                System.out.print(".");
            }
            innerDots--;
            midLower += 2;
            System.out.println();
        }

        int lowerStop = (midLower - 5) / 2;
        System.out.print("//");
        for (int i = 0; i < lowerStop+1; i++) {
            System.out.print("_");
        }
        System.out.print("Stop");
        for (int i = 0; i < lowerStop; i++) {
            System.out.print("_");
        }
        System.out.print("\\\\");
        System.out.println();

        int innerDotAfterMid = 0;

        for (int rows = 0; rows < n; rows++) {
            for (int i = 0; i < innerDotAfterMid; i++) {
                System.out.print('.');
            }
            System.out.print("\\\\");
            for (int i = 0; i < midLower; i++) {
                System.out.print("_");
            }
            System.out.print("//");
            for (int i = 0; i < innerDotAfterMid; i++) {
                System.out.print('.');
            }
            System.out.println();
            innerDotAfterMid++;
            midLower -= 2;
        }
    }
}