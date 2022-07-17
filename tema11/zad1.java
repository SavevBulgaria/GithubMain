package tema11;

import javax.swing.plaf.nimbus.NimbusStyle;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nis = scanner.nextLine();

        String reversed = "";
        for (int i = nis.length() - 1; i >= 0; i--) {
            reversed += nis.charAt(i);
        }
        System.out.println(reversed);

    }
}

