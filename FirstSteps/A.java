package FirstSteps;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        int minutes = time / 60;
        int seconds = time % 60;

        if (seconds < 10) {
            System.out.println(minutes + ":0" + seconds);
        } else {
            System.out.println(minutes + ":" + seconds);
        }


    }
}


