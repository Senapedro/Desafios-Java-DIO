import java.util.*;

public class ChamadaRecursiva {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int soma = somatorio(numero);
        System.out.println(soma);
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
