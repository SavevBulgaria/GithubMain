package tema7;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double avrg = 0;
        int sum = 0;
        String text = scanner.nextLine();

        String[] splittext = text.split(" ");
        int[] newArray = new int[splittext.length];
        int i;
        for (i = 0; i < newArray.length; i++) {
            newArray[i] = Integer.parseInt(splittext[i]);
            sum += newArray[i];
            min = Math.min(min, newArray[i]);
            max = Math.max(max, newArray[i]);
        }

        avrg = (double) sum / newArray.length;
        System.out.println("min" + min);
        System.out.println("max" + max);
        System.out.println("avrg" + avrg);
        System.out.println("sum" + sum);
    }
}
