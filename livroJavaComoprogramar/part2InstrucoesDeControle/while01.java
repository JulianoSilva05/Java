/*
 * 5.2 Princípios básicos de repetição controlada por contador
Esta seção utiliza a instrução de repetição while introduzida no Capítulo 4 a fim de formalizar os elementos necessários para realizar a repetição controlada por contador, o que requer:
1. uma variável de controle (ou contador de loop).
2. o valor inicial da variável de controle.
3. o incremento pelo qual a variável de controle é modificada a cada passagem pelo loop (também conhecido como cada iteração do loop).
4. a condição de continuação do loop que determina se o loop deve continuar.
*/
public class while01 {
    public static void main(String[] args){
        int counter = 1;//declara e inicializa a variavel de controle

        while ( counter <= 10 ){ // condição de continuação do loop
            System.out.printf("%d ", counter);
            ++counter; //variável de controle de incremento
        }
        System.out.println();
    }
}//fim da classe while01
