package tema10;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] array = text.split(" ");

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int xya=0;
            String[] command = scanner.nextLine().split(" ");
            if (command[0].equals("Reversed")) {
                array = Reverse(array);
                xya++;
            } else if (command[0].equals("Distinct")) {
                array = Distinct(array);
                xya++;
            } else if (command[0].equals("Replace")) {


            }
            if(xya==n){
                for (int u = 0; u < array.length; u++) {
                    System.out.print(array[u] + ((u < array.length - 1) ? ", " : ""));
                }
        }

        }
    }


    //qp ij
    public static String[] Distinct(String[] array) {
        int distinctElements = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    if (i != j && array[i].equals(array[j]) && array[i] != null) {
                        array[j] = null;
                        distinctElements -= 1;
                    }
                } catch (NullPointerException ignored) {
                }
            }
            String[] distinctArr = new String[distinctElements];
            int q = 0;
            for (int p = 0; p < distinctArr.length; p++) {
                distinctArr[q] = array[p];
                q++;
            }
        }
        return array;
    }//xy

    public static String[] Reverse(String[] array) {
        String[] reversed = new String[array.length];
        int y = 0;
        for (int x = array.length - 1; x >= 0; x--) {
            reversed[y] = array[x];
            y++;
        }
        return reversed;
    }
}





