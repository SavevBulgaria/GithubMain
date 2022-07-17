package tema9;

import java.util.Scanner;
//zad4
//9 1 3 2 5
public class funny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] splitText = text.split(" ");

        for (int i = 0; i < splitText.length - 1; i++) {

            for (int j = 0; j < splitText.length - i - 1; j++){
                int Cnum = Integer.parseInt(splitText[j]);
                int Cnum2 = Integer.parseInt(splitText[j+1]);

                    if(Cnum>Cnum2){
                        splitText[j]=String.valueOf(Cnum2);
                        splitText[j+1]=String.valueOf(Cnum);
                    }
            }
        }
        for(int d =0;d< splitText.length;d++) {
            if (d != splitText.length - 1) {
                System.out.print(splitText[d] + ", ");
            }else{
                System.out.print(splitText[d]);


            }
        }
        System.out.println("( ͡° ͜ʖ ͡°)");
    }
}
