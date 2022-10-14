
package bsearch;
import java.util.Scanner;
public class Bsearch {

    public static void Bsearch(int array[], int first, int last, int target) {
        int mid=(first+last)/2;
        while(first<=last){
            if(array[mid]<target){
                first=mid+1;
            }
            else if(array[mid]==target){
                System.out.println("The elements found in index "+mid);
                break;
            }
            else{
                last=mid-1;
            }
           mid=(first+last)/2;
        }
         if(first>last){
                System.out.println("Elements is not found");
            }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int first=0;
        int array[]=new int [20];
        int last =array.length-1;
        
        
        System.out.println("Enter the elemts");
        for (int i = 0; i < 5; i++) {
           array[i]=input.nextInt(); 
        }
        
        System.out.println("Enter the target value");
        int target;
        target=input.nextInt();
        Bsearch(array,first,last,target);
        
    }
}
