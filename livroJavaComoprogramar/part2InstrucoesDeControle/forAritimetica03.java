package livroJavaComoprogramar.part2InstrucoesDeControle;

public class forAritimetica03 {
    public static void main(String[] args) {
    
    int x = 2;
    int y = 10;
    

    for (int j = x; j <= 4 * x * y; j += y / x){
        System.out.printf("J = %d \nX = %d \nY = %d",j,x,y);
    }
}
}