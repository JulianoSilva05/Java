//devemos usar um pacote para leitura de dados do teclado 
// objeto Scanner
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int pos;

        System.out.println("Sua posiçao: ");
        pos = leitor.nextInt();

        switch(pos){
            case 1:
                System.out.println("Primeiro Lugar - R$100.000");
                break;
            case 2:
                System.out.println("Segundo Lugar - R$50.000");
                break;
            case 3:
                System.out.println("Terceiro Lugar - R$10.000");
                break;
            case 4,5,6:
                System.out.println("Premio de participação");
                break;
            default:
                System.out.println("Digite um valor valido");
        }
    }
    
}
