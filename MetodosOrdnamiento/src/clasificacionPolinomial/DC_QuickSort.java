/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificacionPolinomial;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class DC_QuickSort {
    public static void quicksort(int A[], int izq, int der) {
        int pivote=A[izq];
        int i=izq;         
        int j=der;        
        int aux;
            while(i < j){                                                            
            while(A[i] <= pivote && i < j) i++; 
             while(A[j] > pivote) j--;           
                 if (i < j) {                                        
                    aux= A[i];                      
                    A[i]=A[j];
                    A[j]=aux;
     }
   }
                    A[izq]=A[j];                                   
                    A[j]=pivote;    
                        if(izq < j-1)
                        quicksort(A,izq,j-1);          
                        if(j+1 < der)
                        quicksort(A,j+1,der);         
   
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

