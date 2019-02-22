/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author esleider.jaramillo
 */
public class metBusqueda {
    
    public int[] Create(int num){
        int[] vec = new int[num];
        Random rand = new Random(); 
        for(int i = 0; i < num; i++){
            vec[i] = rand.nextInt(10000) + 1;
        }
        return vec;
    }
    
    // QuickSort
    public void QuickSort(int[] vec, int inicial, int ultimo){
        if(inicial < ultimo){
            int position = Particionar(vec, inicial, ultimo);
            QuickSort(vec, inicial, position-1); 
            QuickSort(vec, position+1, ultimo);
        }
    }
    
    public int Particionar(int[] vec, int inicial, int ultimo ){
        int pivot = vec[ultimo];
        int i = inicial-1;
        for(int j=inicial; j<ultimo;j++){
            if(vec[j] <= pivot){
                i++;
                int temp = vec[i]; 
                vec[i] = vec[j]; 
                vec[j] = temp;
            }
        }
        int temp = vec[i+1]; 
        vec[i+1] = vec[ultimo]; 
        vec[ultimo] = temp;
        return i+1;
    }
    
    // Shell
    public void  Shell(int[] vec){
        int n = vec.length;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1){
                 int temp = vec[i];
                 int j;
                 for (j = i; j >= gap && vec[j - gap] > temp; j -= gap) vec[j] = vec[j - gap];
                 vec[j] = temp; 
            }
        }
    }
    
    // Radix
    public void RadixSort(int arr[], int n){
        int m = getMax(arr, n);
        for (int exp = 1; m/exp > 0; exp *= 10) 
            countSort(arr, n, exp); 
    }    
    static void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0);
        for (i = 0; i < n; i++) 
            count[ (arr[i]/exp)%10 ]++; 
        for (i = 1; i < 10; i++) count[i] += count[i - 1]; 
        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
    static int getMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    }
    
    // bucket
    public void bucketsort(int[] a) {
      int [] bucket=new int[ValorMaximo(a) + 1];
 
      for (int i=0; i<bucket.length; i++) {
         bucket[i]=0;
      }
 
      for (int i=0; i<a.length; i++) {
         bucket[a[i]]++;
      }
 
      int outPos=0;
      for (int i=0; i<bucket.length; i++) {
         for (int j=0; j<bucket[i]; j++) {
            a[outPos++]=i;
         }
      }
   }
    
    public int ValorMaximo(int[] a){
        int valormax=0;
        for (int i=0; i<a.length; i++){
            if(valormax < a[i]) valormax=a[i];
        }
        return valormax;
    }
    
    // Merge
    public void Mergesort(int arr[], int l, int r) 
    { 
        if (l < r) 
        {
            int m = (l+r)/2; 
            Mergesort(arr, l, m); 
            Mergesort(arr , m+1, r);
            merge(arr, l, m, r);
        } 
    } 
    
    public void merge(int arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        for (int i=0; i<n1; ++i) L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) R[j] = arr[m + 1+ j];
        int i = 0, j = 0; 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        }
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        }
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
    
}
