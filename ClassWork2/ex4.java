package ClassWork2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = input.nextInt();

            sum += currentNumber;

            if(currentNumber > max){
                max = currentNumber;
            }

        }

        sum -= max;

        if(sum == max){
            System.out.println("Yes, sum = " + sum);
        } else {
            System.out.println("No, diff = " + Math.abs(sum - max));
        }

    }
}
