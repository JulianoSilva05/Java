package atividades;

public class contar01 {
    public static void main(String[] args) {
        int[] numeros = {2, 7, 5, 9, 10, 6, 8, 3, 12, 15};
        int contadorPares = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + contadorPares);
    }
}