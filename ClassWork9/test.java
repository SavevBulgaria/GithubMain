package ClassWork9;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]array ={1,2,3,4,5,6};
        for(int i=0;i< array.length;i++){
            if(i!=array.length-1){
                System.out.print(array[i]+",");
            }else {
                System.out.print(array[i]);
            }
        }
    }
}
