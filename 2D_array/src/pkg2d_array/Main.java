
package pkg2d_array;

//import java.util.Scanner;


public class Main {
    
    public static void concour(int array[], int first,int mid, int last){
        int Newarray[]=new int [last-first+1];
        int temp1=first;
        int temp2=mid+1;
        int x=0;
        
        while(temp1<=mid && temp2<=last){
            if(array[temp1]<=array[temp2]){
                Newarray[x]=temp1;
            x++;
            temp1++; 
            }
            else{
                if(array[temp1] >= array[temp2]){
                
                  Newarray[x]=temp2;
            x++;
            temp2++; 
            }
            }
           
        }
        while(temp1<=mid ){
           Newarray[x]=temp1;
           x++;
           temp1++;
        }
        while(temp2<=last){
                   Newarray[x]=temp2;
            x++;
            temp2++; 
        }
        for (int i = 0,j=first; i < Newarray.length; i++,j++) {
          
            array[j]=Newarray[i];
    
           
        }
    }
    
    
    public static void dividing(int array[], int first,int last){
        if(first>=last){
            return ;
        }
        int mid=(first+last)/2;
     dividing(array,first,mid);
        dividing (array,mid+1,last);
        concour(array,first,mid,last);
        
    }

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
   
       int array[]={2,7,4,5,9,12,1};
       int first=0;
       int last=array.length;
      dividing(array,first,last-1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            
        }
        System.out.println("");
    }
    
}
