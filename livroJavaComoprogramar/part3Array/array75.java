// Figura 7.5: SumArray.java

// Calculando a soma dos elementos de um array.

public class array75 {
    public static void main(String[] args) {
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        // adiciona o valor de cada elemento ao total
        for (int counter = 0; counter < array.length; counter++) {
            total = total + array[counter];

            
        }
        System.out.printf("Total soma de todos os elementos = %d\n", total);
    }

}
