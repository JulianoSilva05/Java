import java.util.ArrayList;
import java.util.Scanner;

public class dowhileArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        String entrada;
        
        do {
            System.out.print("Digite uma palavra (ou 'Pare' para encerrar): ");
            entrada = scanner.nextLine();
            palavras.add(entrada);
        } while (!entrada.equalsIgnoreCase("Pare"));
        
        System.out.println("Palavras digitadas:");
        for (String palavra : palavras) {
            if (!palavra.equalsIgnoreCase("Pare")) {
                System.out.println(palavra);
            }
        }
    }
}