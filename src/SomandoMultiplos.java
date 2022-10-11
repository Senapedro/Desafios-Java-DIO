import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        Scanner scan = new Scanner(System.in);

        int A, B;
        A = scan.nextInt();
        B = scan.nextInt();
        int resultado = 0;

        for (int i = 1; i <= B; i++) {
            if (i % A == 0) {
                resultado +=i;
            }
        }
        System.out.println(" " + resultado);
    }
}