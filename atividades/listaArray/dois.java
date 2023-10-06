package atividades.listaArray;

public class dois {
    // ContagemNumerosImpares
    public static void main(String[] args) {
        // Array de inteiros
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Variável para contar números ímpares
        int contadorImpares = 0;

        // Loop for para percorrer o array
        for (int numero : numeros) {
            // Verifica se o número é ímpar
            if (numero % 2 != 0) {
                contadorImpares++;
            }
        }

        // Exibe a quantidade de números ímpares
        System.out.println("Quantidade de Números Ímpares: " + contadorImpares);
    }
}
