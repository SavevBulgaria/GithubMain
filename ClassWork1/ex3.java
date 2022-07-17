package tema1;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        int a, b, c, sum;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
        sum = a + b + c;
        System.out.println("The sum is equivalent to " + sum);
    }
}