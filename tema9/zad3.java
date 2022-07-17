package tema9;


import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");

        for (int i = 0; i < numbers.length / 2; i++) {
            String temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println("( ͡° ͜ʖ ͡°)");
    }
}







