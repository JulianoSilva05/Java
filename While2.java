public class While2 {
    public static void main(String[] args) {
        int contador = 1; // Inicializa uma variável de contador com o valor 1
        // Inicia um loop while que continuará enquanto o contador for menor ou igual a 5
        while (contador <= 5) {
            System.out.println("Contador: " + contador); // Imprime o valor do contador
            contador++; // Incrementa o contador em 1 a cada iteração
        }
        System.out.println("Loop concluído!");
    }
}