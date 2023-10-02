import java.util.Scanner;

public class While {
   public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

      System.out.print("Digite uma palavra: ");
      String palavra = ler.nextLine();

      System.out.print("Digite a quantidade de vezes que a palavra deve repetir: ");
      int quant = ler.nextInt(); 
      
      // While - usando quando não sei quantas vezes o loop repete
      int cont = 0;
      while (cont < quant) {
         System.out.println(cont + " " + palavra);
         cont = cont + 1;
      }
   }
}