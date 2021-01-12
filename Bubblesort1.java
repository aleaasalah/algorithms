/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort2;

import java.util.Arrays;

/**
 *
 * @author Aleaa
 */
public class Bubblesort2 {

   static void bubblesort(int arr[]){
       for(int i=0;i<arr.length-1;i++){  
           boolean swapped=false;
       for(int j=0;j<arr.length-1-i;j++){
           if(arr[j]>arr[j+1]){
               int t=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=t;
               swapped=true;
               
           }
       }
           if(swapped==false){
               break;
           }
           
           }
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
         int []x={5,6,3,9,1,7};
         bubblesort(x);
          System.out.print(Arrays.toString(x));
          
    }
      
}
//the best case complexity =o(n)
//the warse case complexity =o(n^2)