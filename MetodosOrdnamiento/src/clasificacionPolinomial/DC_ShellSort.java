/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificacionPolinomial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class DC_ShellSort {
    
static void printArray(int arr[]){
int n = arr.length;
    for (int i=0; i<n; ++i)
    System.out.print(arr[i] + " ");
    System.out.println();
}
    int sort(int arr[]){
    int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2){
            for (int i = gap; i < n; i += 1){
                 int temp = arr[i];
                 int j;
           for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) arr[j] = arr[j - gap]; arr[j] = temp;
	}
        }
        return 0;
    }
 public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    
    public static int[] leerArreglo(int n) throws IOException{
        int[] a = new int[n];
        System.out.println("-------------------------------------");
        for(int i = 0; i < a.length; i++){
            System.out.println("Escriba el valor [" + i + "]: ");
            entrada = bufer.readLine();
            a[i] = Integer.parseInt(entrada);
        }
        return a;
    }
     public static void imprimirArreglo(int[] a) {
        System.out.println("---------------------------------------");
        System.out.println("Impresión de arreglos");
        for(int i = 0; i < a.length; i++){
            System.out.printf("%4d", a[i]);
        }
         System.out.println("");
    }
     public static int buscar(int[] a, int dato) {
        int inicio = 0;
        int fin = a.length - 1;
        int posicion;
            while(inicio <= fin) {
                posicion = (inicio + fin) / 2;
                if(a[posicion] == dato)
                    return posicion;
                else
                    if(a[posicion] < dato)
                        inicio = posicion + 1;
                    else
                        fin = posicion - 1;
            }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        int[] Array;
        int tamaño, dato;
        
        System.out.println("Introduciendo el array a ordenar ");
        System.out.println("Escribe el tamaño de tu Array: ");
        entrada = bufer.readLine();
        tamaño = Integer.parseInt(entrada);
        
        Array = leerArreglo(tamaño);
        imprimirArreglo(Array);
    }
}


    


