
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        int A, B, SOMA;
        //entrada de dados
        A = leia.nextInt();
        B = leia.nextInt();
        //Processamento
        SOMA = (A + B);
        //saida de dados
        System.out.println("SOMA = " + SOMA);
    }
}
