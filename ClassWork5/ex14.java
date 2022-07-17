package ClassWork5;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
     for(int row = 0;row < n;row++){
         for(int col = 0;col<n;col++){
             int num = row + col+1;
             if(num>n){
                 num=n*2-num;

             }
System.out.print(num + " ");
         }
System.out.println();

        }
    }
}
