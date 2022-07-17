package ClassWork11;

import java.util.Scanner;

public class ex3 {
    public static class Task5 {

        static String censor(String text, String word) {


            String[] word_list = text.split("\\s+");

            String result = "";

            String stars = "";
            for (int i = 0; i < word.length(); i++)
                stars += '*';

            int index = 0;
            for (String i : word_list) {
                if (i.compareTo(word) == 0)

                    word_list[index] = stars;
                index++;
            }

            for (String i : word_list)
                result += i + ' ';

            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter censored word");
            String word = scanner.nextLine();
            System.out.println("Enter sentence");
            String sentence = scanner.nextLine();
            System.out.println(censor(sentence, word));
        }
    }
}

