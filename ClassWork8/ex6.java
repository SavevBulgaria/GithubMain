package ClassWork8;
//Even numbers
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String DA = scanner.nextLine();
        String[] split = DA.split(" ");
        for(int i = 0; i < split.length; i++){
            if(Integer.parseInt(split[i])%2 == 0){
                System.out.print(split[i]);
            }
        }


    }
}
