
package bainary;

import java.util.Scanner;

public class Bainary {
    public static void binarysearch(int array[], int first, int last, int key) {
        int mid=(first+last)/2;
        while(first<=last){
            if(array[mid]<key){
                first=mid+1;
            }
            else if(array[mid]==key){
                System.out.println("the elements found at index "+mid);
                break;
            }
            else{
                last=mid-1;
            }
           mid=(first+last)/2;
        }
        if(first>last){
            System.out.println("elements not found");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int key;
        int array[]=new int [10];
        System.out.println("Enter the elements");
        for (int i = 0; i < 5; i++) {
            array[i]=input.nextInt();
        }
        System.out.println("Enter the target value");
        key=input.nextInt();
        int first=0,last=array.length-1;
        binarysearch(array,first,last,key);
    }
}
