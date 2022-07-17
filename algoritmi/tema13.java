package algoritmi;


import java.util.Random;
import java.util.Scanner;

//dvoichno tursene
public class tema13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int CPUNUMBER = new Random().nextInt(1000);
        System.out.println("CPUNUMBER IS " + CPUNUMBER);
        int MyNumber = scanner.nextInt();
        int low = 0;
        int high = 1000;
        while (MyNumber > CPUNUMBER || CPUNUMBER > MyNumber) {
            System.out.println("Въведете стойност за да познаете числото" + "");
            MyNumber = scanner.nextInt();
            if (MyNumber < CPUNUMBER) {
                System.out.println("НАГОРЕ");
                low = MyNumber;
                System.out.println((high + low) / 2);


            } else if (MyNumber > CPUNUMBER) {
                System.out.println("НАДОЛО");
                high = MyNumber;
                System.out.println((high + low) / 2);
            }


        }
        System.out.println("Познахте");

    }
}