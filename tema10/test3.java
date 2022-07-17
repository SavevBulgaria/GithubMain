package tema10;

import java.lang.module.FindException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array");
        String text = scanner.nextLine();
        String[] arr = text.split(" ");
        System.out.println("Amount of commands");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (command[0].equals("Reverse")) {
                arr = Reverse(arr);
            } else if (command[0].equals("Distinct")) {
                arr = Distinct(arr);

            } else if (command[0].equals("Replace")) {
                arr = Replace(arr);
            }
        }


        for (int q = 0; q < arr.length; q++) {
            if (q == arr.length-1) {
                System.out.print(arr[q]);
            } else if (arr[q] == null && q != arr.length) {
                System.out.print("");
            } else if (arr[q] != null && q != arr.length) {
                System.out.print(arr[q] + ",");


            }
        }
    }


    public static String[] Reverse(String[] array) {
        String[] reversed = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[j] = array[i];
            j++;
        }
        return reversed;
    }


    public static String[] Distinct(String[] array) {
        int distinctElements = array.length;
        String[] distinctArr = new String[distinctElements];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    if (i != j && array[i].equals(array[j]) && array[i] != null) {
                        array[j] = null;
                        distinctElements--;

                    }

                } catch (NullPointerException ignored) {
                }


            }
        }

        int q = 0;
        for (int p = 0; p < distinctArr.length; p++) {
            distinctArr[q] = array[p];
            q++;
        }


        return distinctArr;
    }


    public static String[] Replace(String[] array) {
        Scanner input = new Scanner(System.in);
        String[] replace = new String[array.length];
        int n = 0;
        System.out.println("Which element do you want to change  ?");
        int change = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (i != change) {
                replace[n] = array[i];
                n++;
            } else {

                replace[n] = "Hello";
                n++;
            }

        }
        return replace;
    }

}




























