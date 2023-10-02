import java.util.Scanner;

public class DoWhile { // DO WHILE executa o loop pelo menos uma vez
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int cont = 0;
        int tamanho = 3; // Define o tamanho máximo do array
        String[] nome = new String[tamanho]; // Inicializa o array
    
        do{ //primeiro ele faz, e depois testa
            System.out.println("Digite um nome: ");
            nome[cont]= ler.nextLine();
            cont+=1;
        }while(cont < tamanho); // aqui vem o teste

        System.out.println("lista de nomes:");
        for(cont=0; cont < tamanho;cont+=1){
            System.out.print(nome[cont]+" ");
        }
    }
}
//Atividade
// Mudifique o codigo para que o usuario digite a palavra que queira que repete e a quantidade de vezes que deve repetir

