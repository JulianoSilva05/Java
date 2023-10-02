//somar todos os numeros e s[o parar quando o usuario digitar 0
import java.util.Scanner;
public class dowhile5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;
        
        do {
            System.out.print("Digite um número (ou 0 para sair): ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);
        
        System.out.println("A soma dos números digitados é: " + soma);
    }
}