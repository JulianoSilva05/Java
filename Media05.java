import java.util.Scanner; // util é o pacote
// Scanner é a class responsavel por pegar alguma coisa do teclado
public class Media05{
    public static void main(String[] args){
        //Cria o objeto que pega os dados do teclado
        Scanner scan = new Scanner(System.in);

        //Declaraçao de variaveis
        int n1=0, n2=0,n3=0, n4=0, nota=0;
        final float media = 60; //Final, quer dizer que é constante
        String nome="";
        //Solicitar dados do usuario
        System.out.print("Digite seu nome:");
        nome = scan.nextLine();
        System.out.println("Digite a primeir nota:");
        //cria um objeto da class scan e atribui a uma variaveil
        n1=scan.nextInt();

        System.out.println("Digite a segundo nota:");
        n2=scan.nextInt();

        System.out.println("Digite a terceira nota:");
        n3=scan.nextInt();

        System.out.println("Digite a quarta nota:");
        n4=scan.nextInt();

        nota=n1+n2+n3+n4;

        if(nota >= media){
            System.out.printf("O aluno %s foi aprovado com nota %d",nome,nota);
        }else{
            System.out.printf("O aluno %s foi reprovado com nota %d",nome,nota);
        }

        // System.out.println("A soma de "+num1+" + "+num2+" = "+soma);
        
    }
}
