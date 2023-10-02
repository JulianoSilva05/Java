import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        //FOR - Já sei quantas vezes meu loop vai rodar
        //Incremento
        for(int cont=1 ; cont <= 10 ; cont++){ //for(inicialização ; Controle ; Incremento )
            System.out.println(cont+" - Incremento");

        }
        System.out.println("Fim do programa!");
        System.out.println("\n**********************\n");
        //decremento
        for(int cont=10 ; cont >= 0 ; cont--){ //for(inicialização ; Controle ; Incremento )
            System.out.println(cont+" - Decremento");

        }
        System.out.println("Fim do programa!");
    }
}
