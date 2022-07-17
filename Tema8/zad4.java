package Tema8;
//char neshtoto
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ker = scanner.nextLine();

        for (char sa : ker.toCharArray()) {
            System.out.println(sa + " ->  " + ((int) sa - 'a'));

        }
    }
}
