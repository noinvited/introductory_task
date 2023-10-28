import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            int number_of_approaches = in.nextInt();
            int workload = in.nextInt();
            if(number_of_approaches < 1 || workload < 1){
                System.out.println("Введены некорректные данные");
                return;
            }
            int sum = 0;
            int number_of_weeks = 16;
            for(int i = 0; i < number_of_weeks; ++i) {
                sum += number_of_approaches * workload;
                System.out.println("К " + (i + 1) + " неделе будет выпито " + sum + " литров жидкости");
            }
            if(sum >= 120){
                System.out.print("Студент принят в IT-клуб");
            } else {
                System.out.print("К сожалению, студент не принят в клуб");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Incorrect input\n");
        }
    }
}