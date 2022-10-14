
package mergeshot1;

public class Mergeshot1 {
    
//    User define concour fungtion
    
    public static void concour(int array[], int first, int mid, int last){
        int Narray[]=new int [last-first+1];
        int i=first;
        int j=mid+1;
        int x=0;
        while(i<=mid && j<=last){
            if(array[i]<=array[j]){
                Narray[x++]=array[i++];
            }
            else{
                    Narray[x++]=array[j++];
                }  
        }
         while(i<=mid){
                 Narray[x++]=array[i++];
            }
            while(j<=last){
                Narray[x++]=array[j++];  
            }
             for (int k = 0,l=first; k < Narray.length; k++,l++) {
                array[l]=Narray[k];
            }
    }
    
    public static void divide(int array[], int first, int last){
        
        if(first>=last){
            return;
        }
        int mid=(first+last)/2;
        divide(array,first,mid);
        divide(array,mid+1, last);
        concour(array,first,mid,last);
        
    }

    public static void main(String[] args) {
       
      int array[]={3,5,8,1,2,7,9,11,13,1,50};
//      int first=0;
      int last=array.length;
//      divide(array,0,last-1);  Call the divide fungtion
      divide(array,0,last);
      
//      print the elements in accendint by using Mergeshot
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
    
}
