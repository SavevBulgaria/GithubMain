package tema11;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String  nis =scanner.nextLine();

        String reversed = "";
        for (int i = nis.length() - 1; i >= 0; i--) {
            reversed += nis.charAt(i);
        }

        if(nis.equals(reversed)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
