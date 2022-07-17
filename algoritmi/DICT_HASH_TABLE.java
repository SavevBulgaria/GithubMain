package algoritmi;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
public class DICT_HASH_TABLE {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        Hashtable<Integer, String> Dictionary = new Hashtable<>();



        Dictionary.put(1, "Jan");
        Dictionary.put(2, "Feb");
        Dictionary.put(3, "March");
        Dictionary.put(4, "April");
        Dictionary.put(5, "May");
        Dictionary.put(6, "June");
        Dictionary.put(7, "July");
        Dictionary.put(8, "Aug");
        Dictionary.put(9, "Sept");
        Dictionary.put(10, "Oct");
        Dictionary.put(11, "Nov");
        Dictionary.put(12, "Dec");

       System.out.println("!Enter 1 to search by number and enter 2 to search by name!");



        int choice = Integer.parseInt(input.nextLine());
        if (choice == 1) {
            Enumeration<Integer> itemKeys = Dictionary.keys();
            Enumeration<String> itemValues = Dictionary.elements();
            System.out.println("Enter the number of the month");
            String monthNumber = input.nextLine();

            while (itemKeys.hasMoreElements()) {
                String currentKey = itemKeys.nextElement().toString();
                String currentValue = itemValues.nextElement();

                if (currentKey.equals(monthNumber)) {
                    System.out.println(currentValue);
                }
            }
        }
        if (choice == 2) {
            Enumeration<Integer> itemKeys = Dictionary.keys();
            Enumeration<String> itemValues = Dictionary.elements();
            System.out.println("Enter the name of the month");
            String monthName = input.nextLine();

            while (itemKeys.hasMoreElements()) {
                String currentKey = itemKeys.nextElement().toString();
                String currentValue = itemValues.nextElement();
                if (currentValue.equals(monthName)) {
                    System.out.println(currentKey);
                }
            }
        }
    }
}

