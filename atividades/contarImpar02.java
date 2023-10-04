package atividades;

public class contarImpar02 {
    public static void main(String[] args) {
        int[] numeros = { 2, 7, 4, 9, 10, 6, 8, 3, 12, 15 };
        int contadorImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                contadorImpares++;
            }
        }

        System.out.println("Quantidade de números ímpares: " + contadorImpares);

    }
}
