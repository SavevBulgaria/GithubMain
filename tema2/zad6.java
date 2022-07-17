
package tema2;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int sum1 = 0;
        int maxdiff = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                int number = input.nextInt();
                sum += number;
            }
            if (i == 0) {
                sum1 = sum;
            }
            if (i != 0 && sum1 != sum) {
                if (Math.abs(sum - sum1) > maxdiff) {
                    maxdiff = Math.abs(sum - sum1);
                }
                sum1 = sum;
            }
            sum = 0;

        }

        if (maxdiff == 0) {
            System.out.println("Yes,value = " + sum1);

        } else {
            System.out.println("No,max diff = " + maxdiff);
        }


    }
}