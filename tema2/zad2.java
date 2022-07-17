package tema2;


import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double oddsum = 0;
        double evensum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(i);

            if (i % 2 == 0) {

                System.out.println("is even ");
                evensum += i;
                System.out.println("evensum" + evensum);
            } else {

                System.out.println(" is odd ");

                oddsum += i;
                System.out.println("oddsum" + oddsum);
                scanner.close();
            }
        }
        if (evensum > oddsum) {
            double dif = evensum - oddsum;
            System.out.println("diffarence=" + dif);
        } else if (evensum == oddsum) {
            System.out.println("OddSum=EvenSum");
        }
    }
}
