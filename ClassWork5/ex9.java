package ClassWork5;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;
        do {
            sum = sum + n% 10;
n =  n/10;

        }while(n>0);
System.out.println(sum);
    }

}