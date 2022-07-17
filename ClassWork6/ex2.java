package ClassWork6;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magic = Integer.parseInt(scanner.nextLine());
        int i1, i2, i3, i4, i5;
        for (int i = 0; i <= 9; i++) {
            for (i1 = 0; i1 <= 9; i1++) {

                for (i2 = 0; i2 <= 9; i2++) {

                    for (i3 = 0; i3 <= 9; i3++) {

                        for (i4 = 0; i4 <= 9; i4++) {

                            for (i5 = 0; i5 <= 9; i5++) {

                                if (i * i1 * i2 * i3 * i4 * i5 == magic) {
                                    System.out.print(i);
                                    System.out.print(i1);
                                    System.out.print(i2);
                                    System.out.print(i3);
                                    System.out.print(i4);
                                    System.out.print(i5);
                                    System.out.println();
                                }

                            }


                        }

                    }
                }
            }
        }
    }
}