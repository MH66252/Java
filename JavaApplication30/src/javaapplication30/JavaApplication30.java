
package javaapplication30;

public class JavaApplication30 {
    
    
    public static void concure(int array[], int first, int mid, int last){
        int array1[]=new int[last-first+1];
        int x=0;
        int i=first; 
        int j=mid+1;
         while(i<=mid && j<=last){
             if(array[i]<=array[j]){
                 array1[x]=i;
                 i++;
                 x++;
             }
             else{
                 if(array[i]>=array[j]){
                 array1[x]=j;
                 j++;
                 x++;
             }
             }
              
         }
         
         while(i<=mid){
             array1[x]=i;
             i++;
              x++;
         }
         while(j>=last){
             array1[x]=j;
             j++;
              x++;
         }
         
          for (int k = 0,l=first; k < array1.length; k++,l++) {
            array[l]=array1[k];
        }
    }
    
    public static void divided(int array[], int first, int last){
        
        if(first>=last){
            return;
        }
        int mid=(first+last)/2;
        divided(array,first, mid);
        divided(array, mid+1, last);
        concure(array,first,mid,last);
        
    }

   
    public static void main(String[] args) {
      int array[]={5,8,9,3,5,1,6,34,23,43,54,65};
      int first=0;
      int last=array.length-1;
      divided(array,first,last);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
      
        System.out.println("");
    }
    
}
