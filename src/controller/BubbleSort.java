package controller;

import java.util.ArrayList;

public class BubbleSort {
    public void sort(ArrayList<Integer> lista, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - 1; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, temp);
                }
            }
        }

        for (Integer integer : lista) {
            System.out.println(integer);
        }
    }
}
