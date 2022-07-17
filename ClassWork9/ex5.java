package ClassWork9;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        System.out.println("YOU CAN ONLY ENTER AN EVEN AMOUNT OF NUMBERS!1!1!");
        Scanner scanner = new Scanner(System.in);
        String Text = scanner.nextLine();
        String[] splitText = Text.split(" ");
        int n = splitText.length / 2;
        System.out.print(splitText[n - 1] + ",");
        System.out.print(splitText[n]);

    }
}
