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
public class DC_IDirecta {
    public static int[] ordenarArray(int[] a){                                            
    int j;
    int valortemp;
    for (int i = 1; i < a.length; i++){
              valortemp = a[i];
              j = i - 1;
              while ((j >= 0) && (valortemp < a[j])){
                             a[j + 1] = a[j];
                             j--;
              }
              a[j + 1] = valortemp;       // colocamos aux en su sitio
    }
    return a;
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
        int tamaño;
        
        System.out.println("Introduciendo el array a ordenar ");
        System.out.println("Escribe el tamaño de tu Array: ");
        entrada = bufer.readLine();
        tamaño = Integer.parseInt(entrada);
        
        Array = leerArreglo(tamaño);
        imprimirArreglo(Array);
        
        Array = ordenarArray(Array);
        imprimirArreglo(Array);
        
        
    }
    
}


