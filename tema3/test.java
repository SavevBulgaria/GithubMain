package tema3;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        for (int i = 5; i < 20; i++) {
            arrow(i);
        }
    }

    public static void arrow(int n){
        firstRow(n);
        afterFirstRow(n);
        mid(n);
        bot(n);
    }

    public static void bot(int n){
        int innerDot = 1;
        int mid = (n * 2) - 5;

        for (int row = 0; row < n - 2; row++) {
            repeatSymbol(innerDot, ".");
            System.out.print("#");
            repeatSymbol(mid, ".");
            System.out.print("#");
            repeatSymbol(innerDot, ".");
            innerDot++;
            mid -= 2;
            System.out.println();
        }

        //System.out.println(innerDot);
        repeatSymbol(innerDot, ".");
        System.out.print("#");
        repeatSymbol(innerDot, ".");
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void mid(int n){
        repeatSymbol(n / 2, "#");
        System.out.print("#");
        repeatSymbol(n - 2, "#");
        System.out.print("#");
        repeatSymbol(n / 2, "#");
        System.out.println();
    }

    public static void firstRow(int n){
        repeatSymbol(n / 2, ".");
        repeatSymbol(n, "#");
        repeatSymbol(n / 2, ".");
        System.out.println();
    }

    public static void afterFirstRow(int n){
        for (int rows = 0; rows < n - 2; rows++) {
            repeatSymbol(n / 2, ".");
            System.out.print("#");
            repeatSymbol(n - 2, ".");
            System.out.print("#");
            repeatSymbol(n / 2, ".");
            System.out.println();
        }
    }

    public static void repeatSymbol(int n,String symbol){
        for (int i = 0; i < n; i++) {
            System.out.print(symbol);
        }
    }
}