package tema10;

import java.util.Scanner;

public class test2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arr = text.split(" ");

        arr = Distinct(arr);
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]!=null) {
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static String[] Distinct(String[] array) {
        int distinctElements = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    if (i != j && array[i].equals(array[j]) && array[i] != null) {
                        array[j] = null;
                        distinctElements-=1;
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
    }
}




