package tema10;

import java.util.Scanner;

public class Storage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter products ");
        String prod = scanner.nextLine();
        String[] products = prod.split(" ");


        System.out.print("Enter Quantity ");
        String quan = scanner.nextLine();
        System.out.print("Enter prices ");
        String pric = scanner.nextLine();

        long[] quantity = new long[products.length];
        double[] prices = new double[products.length];

        for (int i = 0; i < products.length; i++) {
            quantity[i] = Long.parseLong(quan.split(" ")[i]);
            prices[i] = Double.parseDouble(pric.split(" ")[i]);
        }
        String command;
        do {
            System.out.print("Enter Product that you want to check ");
            command = scanner.nextLine();
            for (int i = 0; i < products.length; i++) {
                if (command.equals(products[i])) {
                    System.out.println(products[i] + " costs: " + prices[i] + " Quantity available: " + quantity[i]);
                }
            }
        } while (!command.equals("End"));

    }
}
