package livroJavaComoprogramar.part3Array;

public class arryaString {
    public static void main(String[] args) {
        // Um programa pode criar vários arrays em uma única declaração. A declaração
        // seguinte reserva 100 elementos para b e 27 elementos para x:
        //String[] b = new String[100], x = new String[27];
        // ou
        //String[] j = new String[100]; // cria array j
        //String[] u = new String[27]; // cria array

        /*
         * Quando apenas uma variável é declarada em cada declaração, os *colchetes podem ser colocados após o tipo ou após o nome da variável * de array, como em:
         */
        String f[] = new String[100]; // cria array f
        String y[] = new String[27]; // cria array y
        f[0] = "Juliano";
        y[0] = "Silva";

        System.out.print(f[0]+" "+y[0]);

    }

}
