package ClassWork5;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();

        while(1>n || 100<n){
            System.out.println("Invalid");
n = scanner.nextInt();
        }
        System.out.println("The number is " + n);



    }

}
