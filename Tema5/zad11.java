package Tema5;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {

        int n = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if(n % 2 ==0){
                System.out.println("Even "+n);
                break;
            }else{
                System.out.println("Odd "+n);

            }

        }


    }
}
