package livroJavaComoprogramar.part3Array;

/*Um array é um grupo de variáveis (chamados elementos ou componentes) que contém valores todos do mesmo tipo. */
public class intro {
    public static void main(String[] args) {
        //declarando um array
        //int[] c;
        //c = new int[12]; // cria o array; atribui à variável de array

        int[] c = new int[12];
        c[0] = -45;
        c[1] = 6;
        c[2] = 0;
        c[3] = 72;
        c[4] = 1543;
        c[5] = -89;
        c[6] = 0;
        c[7] = 62;
        c[8] = -3;
        c[9] = 1;
        c[10] = 6453;
        c[11] = 78;

        int x = c[6] / 2;
        int sum = c[0] + c[1] + c[2];//-45+6+0

        System.out.println(sum);
        System.out.println(x);
    }

}
