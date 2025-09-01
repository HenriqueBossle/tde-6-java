import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numeros = {9, 3, 2, 110, 43, 22};

        System.out.println("Escolha o tipo de ordenação: ");

        System.out.println("Opções: 1 - BubbleSort, 2 - SelectionSort, 3 - InsertionSort: ");
        Scanner sc = new Scanner(System.in);
        String tipo = sc.nextLine();

        switch (tipo) {
            case "1":
                Ordenacao.bubbleSort(numeros);
                break;
            case "2":
                Ordenacao.selectionSort(numeros);
                break;
            case "3":
                Ordenacao.insertionSort(numeros);
                break;
        }

        System.out.println(Arrays.toString(numeros));
    }
}
