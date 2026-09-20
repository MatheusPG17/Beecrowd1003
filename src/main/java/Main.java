
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int A, B, SOMA;
        
        A = leia.nextInt();
        B = leia.nextInt();
        
        SOMA = (A + B);
        
        System.out.println("SOMA = " + SOMA);
    }
}
