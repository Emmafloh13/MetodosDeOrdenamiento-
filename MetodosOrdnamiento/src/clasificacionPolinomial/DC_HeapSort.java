/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificacionPolinomial;

/**
 *
 * @author HP
 */
public class DC_HeapSort {
    
public class HeapSort { 

public static void main(String a[]) { 

int i; 
int arr[] = 0;

System.out.println("\nHeap Sort\n---------------"); 
System.out.println("\nUnsorted Array\n---------------"); 

for (i = 0; i < arr.length; i++){ 

System.out.print(" " + arr[i]); 

} 

for (i = arr.length; i > 1; i--) { 

fnSortHeap(arr, i - 1); 

} 

System.out.println("\n\nSorted array\n---------------"); 

for (i = 0; i < arr.length; i++){ 

System.out.print(" " + arr[i]); 

} 

} 

public static void fnSortHeap(int array[], int arr_ubound) { 

int i, o; 
int lChild, rChild, mChild, root, temp; 

root = (arr_ubound - 1) / 2; 

for (o = root; o >= 0; o--) { 

for (i = root; i >= 0; i--) { 

lChild = (2 * i) + 1; 
rChild = (2 * i) + 2; 

if ((lChild <= arr_ubound) && (rChild <= arr_ubound)) { 

if (array[rChild] >= array[lChild]) 
mChild = rChild; 
else 
mChild = lChild; 

} else { 

if (rChild > arr_ubound) 
mChild = lChild; 
else 
mChild = rChild; 

} 

if (array[i] < array[mChild]) { 

temp = array[i]; 
array[i] = array[mChild]; 
array[mChild] = temp; 

} 
} 
} 
temp = array[0]; 
array[0] = array[arr_ubound]; 
array[arr_ubound] = temp; 
return; 
} 
}
}

