package ClassWork9;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        String text = scannner.nextLine();
        String[] splitText = text.split(" ");

        for (int i = 0; i < splitText.length; i++) {
            double num = Double.parseDouble(splitText[i]);
            splitText[i] = String.valueOf(Math.round(num));
            System.out.print(splitText[i] + " ");
        }
    }
}


