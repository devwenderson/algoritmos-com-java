package algoritmos;

public class Ordenacao {
    public void quicksort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            // MÉTODO PARA PARTICIONAR E ORDENAR
            int pivo = particionar(arr, inicio, fim);
            // ORDENAR OS MENORES QUE O PIVÔ
            quicksort(arr, inicio, pivo - 1);
            // ORDENAR OS MAIORES QUE O PIVÔ
            quicksort(arr, pivo + 1, fim);
        }
    }

    private int particionar(int[] arr, int inicio, int fim) {
        /*
            ENTRADAS:
                - array de inteiros
                - início do array
                - fim do array
            SAÍDA:
                - POSIÇÃO DO PIVÔ
         */

        int i = inicio - 1; // POSIÇÃO ÍNDICE DO ÚLTIMO ELEMENTO MENOR QUE O PIVÔ
        int pivo = arr[fim];
        for (int j = inicio; j<=fim; j++) {

            if (arr[j] < pivo) {
                i++;
                // TROCA ELEMENTOS
                swap(arr, i, j);
            }
        }

        // i -> ÚLTIMO ELEMENTO MENOR QUE O PIVÔ
        // i + 1 -> POSIÇÃO CORRETA DO PIVÔ
        swap(arr, i + 1, fim); // COLOCA O PIVÔ NA POSIÇÃO CORRETA
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
