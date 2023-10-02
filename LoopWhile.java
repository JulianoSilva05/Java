import java.util.Scanner;

public class LoopWhile { // Uso o while quando não sei o meu final e quero que execute até chegar em uma
                         // condição
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String palavra = "";
        System.out.println("Digite uma palavra que deve repetir:");
        palavra = ler.nextLine();

        // WHILE
        int i = 0;
        // neste caso eu preciso inicializar o contador fora do while
        while (i <= 10) {
            System.out.println(i +" - "+ palavra);
            i += 1;
        }
        System.out.println(" \n--------------------- \n");

        int cont = 10;
        while (cont > 0) {
            System.out.println(cont +" - "+ palavra);
            cont -= 1;
        }
        System.out.println(" \n--------------------- \n");
    }
}
//Atividade
// Mudifique o codigo para que o usuario digite a palavra que queira que repete e a quantidade de vezes que deve repetir

