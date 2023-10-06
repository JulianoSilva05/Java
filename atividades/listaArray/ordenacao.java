package atividades.listaArray;

import java.util.Arrays;

public class ordenacao {
    public static void main(String[] args) {
        // Array de números inteiros desordenados
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};

        // Exibe o array antes da ordenação
        System.out.println("Array antes da ordenação: " + Arrays.toString(numeros));

        // Ordenação em ordem crescente usando a biblioteca Arrays
        Arrays.sort(numeros);

        // Exibe o array após a ordenação
        System.out.println("Array após a ordenação: " + Arrays.toString(numeros));
    }
}
