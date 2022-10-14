package javaapplication33;

import java.util.Scanner;

public class JavaApplication33 {
    public static void bsearch(int array[], int first, int last,int target){
        
        while(first<=last){
            int mid=(first+last)/2;
            if(array[mid]<=target){
                first=mid+1;
            }
            else if(array[mid]>=target){
                last=mid-1;
            }
            if(array[mid]==target){
                System.out.println("Element found at index = "+mid);
                break;
            }
           
        }
         if(first>last){
                System.out.println("Element not found");
            }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      int array[]={1,3,5,6,7,8,9};
      int first=0;
      int last=array.length;
      int target;
      
        System.out.println("Enter the target");
        target=input.nextInt();
        bsearch(array,first,last,target);
     
    }
    
}
