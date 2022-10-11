import java.util.*;

public class NumerosDiferentes {

    public static void main(String[] args) {

        //TODO: Imprima se os valores numéricos passados são iguais ou não.
        Scanner scan =  new Scanner(System.in);
        int numeroA ;
        int numeroB ;


        numeroA = scan.nextInt();
        numeroB = scan.nextInt();
        if (numeroA == numeroB) {
            System.out.println("Sao iguais!");
        }else if (numeroA != numeroB) {
            System.out.println("Nao sao iguais!");
        }

    }
}