/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Burbuja;

/**
 *
 * @author eliamyaet
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        
        // Itera a través de todos los elementos del array
        for (int i = 0; i < n - 1; i++) {
            // Últimos i elementos ya están en su posición ordenada
            for (int j = 0; j < n - i - 1; j++) {
                // Compara el elemento actual con el siguiente elemento
                if (arr[j] > arr[j + 1]) {
                    // Realiza el intercambio si el elemento actual es mayor que el siguiente
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        // Imprime el array ordenado
        System.out.println("Array ordenado:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
