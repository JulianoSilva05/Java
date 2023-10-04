package livroJavaComoprogramar.part2InstrucoesDeControle;
// Figura 5.2: ForCounter.java
// Repetição controlada por contador com a instrução de repetição for.

public class for02 {
    public static void main(String[] args) {
        // o cabeçalho da instrução for inclui inicialização,
        // condição de continuação do loop e incremento
        for(int counter = 1 ; counter <= 10 ; counter++){
            System.out.printf("%d ", counter);
            System.out.println();
        }
    }
}//fim da classe for02

/*
 * Uma análise mais atenta do cabeçalho da instrução for
A Figura 5.3 examina mais detalhadamente a instrução for na Figura 5.2. A primeira linha — incluindo a palavra-chave for e tudo mais entre parênteses depois de for (linha 10 na Figura 5.2) — é às vezes chamada cabeçalho da instrução for. O cabeçalho de for "faz tudo" — ele especifica cada item necessário para repetição controlada por contador com uma variável de controle. Se houver mais de uma instrução no corpo do for, as chaves ({ e }) são exigidas para definir o corpo do loop.

-->FORMATO GERAL DA INSTRUÇÃO FOR
 for (inicialização; condiçãoDeContinuaçãoDoLoop; incremento) 
    instrução

-->Representando uma instrução for com uma instrução while equivalente
A instrução for muitas vezes pode ser representada com uma while equivalente desta maneira:

inicialização;
while (condiçãoDeContinuaçãoDoLoop) {
    instrução
    incremento; }
 */