package atividades.listaArray;

import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        // Array predefinido
        int[] numeros = {10, 20, 30, 40, 50};

        // Cria um scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário inserir um número
        System.out.print("Insira um número: ");
        int numeroInserido = scanner.nextInt();

        // Loop while para verificar se o número está presente no array
        int i = 0;
        while (i < numeros.length && numeros[i] != numeroInserido) {
            i++;
        }

        // Exibe o resultado da pesquisa
        if (i < numeros.length) {
            System.out.println("O número " + numeroInserido + " está presente no array.");
        } else {
            System.out.println("O número " + numeroInserido + " não está presente no array.");
        }

        // Fecha o scanner
        scanner.close();
    }
}