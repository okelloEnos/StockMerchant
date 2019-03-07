/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author okello
 */
import java.util.Arrays;
import java.util.Scanner;
public class Stock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number; //declaring number and array
        int array[];
       
       //user  enters the total bunch of socks
        System.out.println("Enter the total number of socks in the stock");
        number = input.nextInt();
        //verification of users number input
        if((number >=0)&& (number<=100)){
            array =  new int[number];//initializing the size of the array with users input
           System.out.println("Enter the color number of each pair");//user enters the number of pairs
           
           for(int i= 0;i < array.length;i++){//looping for users input
             array[i] = input.nextInt();     //storage of users input to the array
    }
         // comparison of users input and increment

NumberOfPairs(array);
        }else
            System.out.println("Invalid number of socks");
        
        
    }   

    
// method for sorting users input in ascending order
    private static void sort(int array2[]) {
        int temp;
        for(int i =0;i<array2.length;i++){
            for(int p = i+1;p<array2.length;p++){
                if(array2[i]>array2[p]){
                    temp = array2[i];
                    array2[i]=array2[p];
                    array2[p]=temp;
                }
            }
        }
    }
// method that determines the numper of possible pairs
private static void NumberOfPairs(int[] array1) {
    sort(array1);
    System.out.println(Arrays.toString(array1));
  int e=0,count=0;
  while(e<array1.length){
      if(array1[e]==array1[e+1]){
         ++count;
      }
      e+=2;
  }
  if (count>1){
      System.out.println(count+ " pairs");
  }else
  System.out.println(count+ " pair");
}    
}
