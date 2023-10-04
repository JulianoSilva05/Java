package atividades;

import java.util.Scanner;

public class verifica {
    public static void main(String[] args) {
        int[] numeros = { 2, 7, 4, 9, 10, 6, 8, 3, 12, 15 };
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para pesquisar no array: ");
        int numeroPesquisa = scanner.nextInt();

        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == numeroPesquisa) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + numeroPesquisa + " foi encontrado no array.");
        } else {
            System.out.println("O número " + numeroPesquisa + " não foi encontrado no array.");
        }
    }
}