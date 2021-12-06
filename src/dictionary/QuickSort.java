/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dictionary;

/**
 *
 * @author ishay
 */
public class QuickSort {

    ;
    Node[] arr;

    QuickSort(Node[] a) {
        this.arr = a;

    }

    public int partition(int l, int h) {
        Node pivot = arr[l];
        int i = l;
        int j = h;
        while (i < j) {
            do {
                i++;
            } while (arr[i].word.compareTo(pivot.word) < 0 );

            do {
                j--;
            } while (arr[j].word.compareTo(pivot.word) > 0);
            if (i < j) {
                Node val1 = arr[i];
                Node val2 = arr[j];
                arr[i] = val2;
                arr[j] = val1;
            }
        }
        arr[l] = arr[j];
        arr[j] = pivot;
        return j;
    }
    
    public void quickSort(int l, int h) {
        if (l < h) {
            int j = partition(l, h);
            quickSort(l, j);
            quickSort(j+1, h);
        }
    }

}
