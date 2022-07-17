package ClassWork10;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//sposobnost da pishem v konzolata
        String[] array = {"one ", "two ", "three ", "four ", "five "};//array

        int n = 5; //edinica za proverka
        int a = scanner.nextInt();//edinica za proverka
        if (n == a) {//proverka dali te sa ravni
            String[] second = new String[array.length];//suzdavane na nov array
            //koito da sudurja novite danni
            int j = 0;//izpolzvame go s cel da napulnim VSEKI EDIN ELEMENT NA NOV ARRAY
            for (int i = array.length - 1; i >= 0; i--) {//for cycle koito ni vurti na obratno arrya
                second[j] = array[i]; //populvane na noviqt array
                j++;//dobavqne na +1 kum j s cel preminavaneto na sledvashtiqt element na arraya
            }
            for (int b = 0; b < second.length; b++)//printirane na noviqt veche oburnat array
                System.out.print(second[b]);


        }
    }

}
