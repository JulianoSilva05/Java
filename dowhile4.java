//Exemplo 2: Solicitando entrada do usuário até que um valor válido seja inserido:
import java.util.Scanner;
public class dowhile4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Digite um número positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0);
        
        System.out.println("Você digitou um número válido: " + numero);
    }
}

