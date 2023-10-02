import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoArray;
        
        System.out.print("Digite o tamanho do array: ");
        tamanhoArray = scanner.nextInt();
        
        int[] array = new int[tamanhoArray];
        
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.printf("Digite o valor para a posição %d: ", i);
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Valores do array:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.printf("Posição %d = %d\n", i, array[i]);
        }
    }
}