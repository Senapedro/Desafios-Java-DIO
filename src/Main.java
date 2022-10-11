import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        if(num == 3) {
            System.out.println("Fizz");
        }else if(num == 5) {
            System.out.println("Buzz");
        }if(num == 15) {
            System.out.println("FizzBuzz");
        }else if(num == 4) {
            System.out.println(num);
        }

    }
}