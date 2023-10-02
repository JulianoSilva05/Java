public class While3 {
    public static void main(String[] args) {
        int numero = 1; // Inicializa a variável com o primeiro número
        int soma = 0; // Inicializa a variável para armazenar a soma

        // Inicia um loop while que continuará enquanto o número for menor ou igual a 10
        while (numero <= 10) {
            soma += numero; // Adiciona o número atual à soma
            numero++; // Incrementa o número em 1 para a próxima iteração
        }

        // Imprime a soma dos números de 1 a 10
        System.out.println("A soma dos números de 1 a 10 é: " + soma);
    }
}
