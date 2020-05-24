/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author stive
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    
    
    
    static void insertionSort(int[] a, int n) {
        int i, j, k;
        i = 0;
        while (i < n) {
            j = i - 1;
            k = a[i];
            while (j >= 0 && a[j] > k) {
                a[j+1] = a[j];
                a[j] = k;
                j--;
            }
            a[j + 1] = k;
            i++;
        }
    }

    static String mostrarArray(int[] a){
    String msg= "";
    for(int i = 0; i <a.length; i++){
        msg += "ARRAY EN POSICION " + i + "= " + a[i] + "\n";
    }
    return msg;
    }
    
    static void llenarArray(int[] a){
        for(int i = 0; i<a.length; i++){
            a[i] = (int)(100.0 * Math.random());
         }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = new int[10];
        llenarArray(a);
        System.out.println(mostrarArray(a));
        insertionSort(a, 10);
        System.out.println(mostrarArray(a));
    }

}
