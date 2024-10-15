package view;

import controller.BubbleSort;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        BubbleSort bubbleSort = new BubbleSort();

        lista.add(10);
        lista.add(5);
        lista.add(8);
        lista.add(1);
        lista.add(9);
        lista.add(2);
        lista.add(4);
        lista.add(7);
        lista.add(3);
        lista.add(6);

        int tamanho = lista.size();

        bubbleSort.sort(lista, tamanho);
    }
}
