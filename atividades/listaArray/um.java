package atividades.listaArray;

public class um {
    public static void main(String[] args) {
        // Array de inteiros
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Variável para contar números pares
        int contadorPares = 0;

        // Loop for para percorrer o array
        for (int numero : numeros) {
            // Verifica se o número é par
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }
        // Exibe a quantidade de números pares
        System.out.println("Quantidade de Números Pares: " + contadorPares);
    }
}