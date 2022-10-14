
package array;

import java.util.Scanner;

public class Array {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int a[]=new int [20];
       int i,j,temp=0;
        System.out.println("How many number you want to entered");
        j=input.nextInt();
        System.out.println("Enter the elements");
        for (int k = 0; k < j; k++) {
            a[k]=input.nextInt();
        }
         int max=a[0];
         int min=a[0];
         
        for (int k = 1; k < j; k++) {  
                if(max<a[k]){
                  max=a[k];   
                }
                if(min>a[k]){
                    min=a[k];
                }
        }
         
     
            System.out.println("Higest number of the elements "+max); 
            System.out.println("Lowest number of the elements "+min);
            
    }
    
}
