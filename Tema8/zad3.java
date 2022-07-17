package Tema8;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String HELLOWRODL = scanner.nextLine();

        String[]  splitText= HELLOWRODL.split(" ");

        int MOSTCUMMONNUMBER=0;

        int KOLKOPUTIGOSRESHTAM=0;

        for (int i =0;i< splitText.length;i++){

            int kurrentNum=Integer.parseInt(splitText[i]);

            int sreshta=0;

            for(int j = 0;j<splitText.length;j++){

                if(Integer.parseInt(splitText[j]) ==kurrentNum )
                    sreshta+=1;
            }
            if(sreshta > KOLKOPUTIGOSRESHTAM){

                MOSTCUMMONNUMBER = kurrentNum;

                KOLKOPUTIGOSRESHTAM = sreshta;
            }

        }
        System.out.println(MOSTCUMMONNUMBER + " cummonNumber  ");
        System.out.println(KOLKOPUTIGOSRESHTAM+"  Kolko puti se sreshta");

    }
}
