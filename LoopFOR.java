import java.util.Scanner;

public class LoopFOR { //Uso o for quando já sei o final!!!
    public static void main(String[] args){
        //FOR
        for(int i = 1; i <= 10 ; i++) {//for(inicialização ; condição ; ingremento)
            //se declarar a variavel de inicialização do for dentro parametro do laço, ele só será usado no for, e depois de usado irá para o lixo. Sendo assim, essa é uma das boas praticas em programação, não irá ficar ocupando espaço na memoria, evitando uso de SWAP
            System.out.println(i + " - Senai\n");

        }
        System.out.println("\n *******************************\n");
for(int i = 10; i > 0 ; i--) {//for(inicialização ; condição ; ingremento)
            //se declarar a variavel de inicialização do for dentro parametro do laço, ele só será usado no for, e depois de usado irá para o lixo. Sendo assim, essa é uma das boas praticas em programação, não irá ficar ocupando espaço na memoria, evitando uso de SWAP
            System.out.println(i + " - Senai\n");

        }
    }
}
//Atividade
// Mudifique o codigo para que o usuario digite a palavra que ele queira que repete e a quantidade de vezes que deve repetir
