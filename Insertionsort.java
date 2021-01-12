/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.Arrays;

/**
 *
 * @author Aleaa
 */
public class Insertionsort {
  static void insert(int arr[]){
      for(int i=1;i<arr.length;i++){
          int key=arr[i];
          int j=i-1;
          for(;j>=0&&arr[j]>key;j--){
              arr[j+1]=arr[j];
              
          }
          arr[j+1]=key;
      }
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int []x={3,2,5,7,8,9};
     insert(x);
     System.out.print(Arrays.toString(x));
           }
          /// System.out.println(x);
       }
        // TODO code application logic here
    
    

 