package ClassWork9;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());
        int [] array=new int[n];

        for(int i = 0; i < n; i++){
            array[i]= Integer.parseInt(scanner.nextLine());
        }

        for(int i = n-1 ;i>=0;i--){
            if(i!=0){
                System.out.print(array[i]+", ");
            }else {
                System.out.print(array[i]);
            }
        }

    }
}
