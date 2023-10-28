import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        try{
            int num = in.nextInt();
            if(num < 1)
                num = 1;
            for(int i = 0; i < num; ++i) {
                System.out.println(s);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Incorrect input\n");
        }
    }
}
