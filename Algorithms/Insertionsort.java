package Algorithms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Insertionsort {

    static int[] MyArr;
    static int N;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random MyRND = new Random();
        System.out.println("Enter the amount of numbers");
        N = input.nextInt();
        MyArr = new int[N];

        for (int i = 0; i < N; i++) {
            MyArr[i] = MyRND.nextInt(100);
        }
        System.out.println("My Array Before Sorting :");
        System.out.println(Arrays.toString(MyArr));

    }

    private static void InsertionSort() {
        int i,j, key;
        for (i = 0; i < N; i++) {
            key = MyArr[i];
            j=i-1;

            while (j>=0&&key<MyArr[j]){
                MyArr[j+1]=MyArr[j];
                j--;
            }
            MyArr[i]=key;
        }
    }

}

