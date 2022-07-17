package Tema8;
//obraten red na 123456
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String HELLOWRODL = scanner.nextLine();

        String[]  splitText= HELLOWRODL.split(" ");

        for (int i = splitText.length ;i > 0; i--){
            System.out.print(i + " ");
        }
    }
}
