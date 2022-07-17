package ClassWork2;


import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        String s = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                sum += 1;
            } else if (s.charAt(i) == 'e') {
                sum += 2;
            } else if (s.charAt(i) == 'o') {
                sum += 3;
            } else if (s.charAt(i) == 'u') {
                sum += 5;

            }
        }
        System.out.println("Vowels sum = " + sum);
    }
}