import algoritmos.Ordenacao;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 7, 9, 5, 10, 11, 98, 23, 65, 22, 33, 21, 11, 22};

        Ordenacao ordenador = new Ordenacao();
        ordenador.quicksort(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
