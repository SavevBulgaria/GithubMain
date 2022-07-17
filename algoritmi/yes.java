package algoritmi;
import java.util.Scanner;
public class yes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(" *");
        for(int i = 0; i < n; i++){
        System.out.print(" |");
        System.out.println();

        }
        for(int d = 0; d < 1; d++){
            System.out.println("o|o");
        }

    }
}
