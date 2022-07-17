
package FirstSteps;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex3 {

    static int[] myArr;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Задайте размер на масива:");
        int n = input.nextInt();
        myArr = new int[n];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(100);
        }

        System.out.println("Преди сортиране с for: " + Arrays.toString(myArr));
        BBSortFor();
        System.out.println("След сортиране с for: " + Arrays.toString(myArr));

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(100);
        }

        System.out.println("Преди сортиране с do while: " + Arrays.toString(myArr));
        BBSortDoWhile();
        System.out.println("След сортиране с do while: " + Arrays.toString(myArr));


    }


    public static void BBSortFor(){
        for (int i = 0; i < myArr.length - 1; i++) {
            for (int j = 0; j < myArr.length - i - 1; j++) {
                if(myArr[j] > myArr[j + 1]){
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
    }

    public static void BBSortDoWhile(){
        int n = myArr.length - 1;
        boolean swapped = false;
        do{
            swapped = false;
            n--;

            for (int i = 0; i <= n; i++) {
                if(myArr[i] > myArr[i + 1]){
                    int temp = myArr[i];
                    myArr[i] = myArr[i + 1];
                    myArr[i + 1] = temp;

                    swapped = true;
                }
            }

        } while (swapped);
    }
}
