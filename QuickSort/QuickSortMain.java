package QuickSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSortMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random  random = new Random();
        int n = scanner.nextInt();
        int [] array= random.ints(n,0,100).toArray();
        QuickSortMethods methods= new QuickSortMethods();
        methods.quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

}