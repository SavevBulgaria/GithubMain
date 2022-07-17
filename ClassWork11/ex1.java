package ClassWork11;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter censored word");

        String word = scanner.nextLine();


        String [] censored=new String[word.length()];
        for(int i= 0;i< censored.length;i++){
            censored[i]="*";

        }




        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();
        String[] Sentence = sentence.split(" ");


        for (int i = Sentence.length - 1; i > 0; i--) {
            //proverka dali ima censored nqkude + pechatane (proverka vuv formata na ! equals)
            int j=0;
            if (word.equals(Sentence[i])) {
                Sentence[i] = censored[j];
                System.out.print(Sentence[i]);
                System.out.print(" ");
                j++;
            } else {
                System.out.print(Sentence[i]);
                System.out.print(" ");
            }


        }


    }
}
