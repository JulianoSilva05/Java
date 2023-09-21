import java.util.Scanner; // util é o pacote
// Scanner é a class responsavel por pegar alguma coisa do teclado
public class Soma{
    public static void main(String[] args){
        //Cria o objeto que pega os dados do teclado
        Scanner scan = new Scanner(System.in);

        //Declaraçao de variaveis
        int num1=0, num2=0, soma=0;
        String nome="";

        //Solicitar dados do usuario
        System.out.print("Digite seu nome:");
        nome = scan.nextLine();
        System.out.println("Digite um número:");
        //cria um objeto da class scan e atribui a uma variaveil
        num1=scan.nextInt();

        System.out.println("Digite o segundo número:");
        num2=scan.nextInt();

        soma=num1+num2;

        System.out.printf("Oi, %s,\nA soma de %d + %d = %d",nome,num1,num2,soma);

        // System.out.println("A soma de "+num1+" + "+num2+" = "+soma);
        
    }
}

