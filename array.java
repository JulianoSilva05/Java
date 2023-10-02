public class array {// array são conjuntos de dados do mesmo tipo
    public static void main(String[] args) {
        int indice = 5;
        int[] num = new int[indice];
        num[0] = 1;
        num[1] = 3;
        num[2] = 5;
        num[3] = 7;
        num[4] = 9;

        int i;
        for (i = 0; i < indice; i++) {
            System.out.printf("Posição %d = %d\n", i, num[i]);
        }
    }
}