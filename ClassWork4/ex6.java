package ClassWork4;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0,b = 1, c = 1;
        int n = input.nextInt();

        for (int i = 0; i < n * 2 + 2; i++) {
            //Първа половина
            if(i == 0 && i < 2 * n - (n - 1)){
                System.out.print(generateString('.',n + c) + generateString('_', (n * 2) + 1) + generateString('.',n + c));
                c--;
            } else if (i < 2 * n - (n - 1)) {
                System.out.print(generateString('.',n + c) + "//" + generateString('_', ((n * 2) - 1) + a) + "\\\\" + generateString('.',n + c));
                c--;
                a += 2;
            }
            //Среда

            if (i == 2 * n - (n - 1)){
                System.out.print(generateString('.',n + c) + "//" + generateString('_', (((n * 2) - 1) + a)/2 - 2) + "STOP!" + generateString('_', ((((n * 2) - 1) + a))/2 - 2) + "\\\\" + generateString('_',n + c));
            }

            //Втора половина
            if(i > 2 * n - (n - 1)){
                System.out.print(generateString('.',n + c) + "\\\\" + generateString('_', ((n * 2) - 1) + a) + "//" + generateString('.',n + c));
                c++;
                a -= 2;
            }
            System.out.println();
        }
    }
    public static String generateString(char ch, int n){
        String str = "";
        for(int i = 0; i < n; i++){
            str += ch;
        }
        return str;
    }
}