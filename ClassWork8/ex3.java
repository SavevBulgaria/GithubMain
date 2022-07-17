package ClassWork8;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String HelloWorld = scanner.nextLine();

        String[]  splitText= HelloWorld.split(" ");

        int MostCommonNumber=0;

        int AmountOfTimesItsReapited=0;

        for (int i =0;i< splitText.length;i++){

            int currentNumber=Integer.parseInt(splitText[i]);

            int WhenTheyMeet=0;

            for(int j = 0;j<splitText.length;j++){

                if(Integer.parseInt(splitText[j]) ==currentNumber )
                    WhenTheyMeet+=1;
            }
            if(WhenTheyMeet > AmountOfTimesItsReapited){

                MostCommonNumber = currentNumber;

                AmountOfTimesItsReapited = WhenTheyMeet;
            }

        }
        System.out.println(MostCommonNumber + " CommonNumber  ");
        System.out.println(AmountOfTimesItsReapited+"  How many times it is reapited");

    }
}
