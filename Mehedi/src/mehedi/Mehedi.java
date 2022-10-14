
package mehedi;

public class Mehedi {
    public static void concure(int arr[], int first, int mid, int last){
        int narray[]=new int [last-first+1];
        int x=0;
        int i=first, j=mid+1;
        while(i<=mid && j<=last){
            if(arr[i]<=arr[j]){
                narray[x++]=arr[i++];
            }
            else{
                narray[x++]=arr[j++];
             
            }
        }
        while(i<=mid){
            narray[x++]=arr[i++]; 
        }
        while(j<=last){
            narray[x++]=arr[j++];
        }
        for (int k = 0,l=first; k <narray.length ; k++,l++) {
            arr[l]=narray[k];
        }
    }
    public static void divide(int arr[], int first, int last){
        if(first>=last){
            return;
        }
        int mid=(first+last)/2;
        divide(arr,first,mid);
        divide(arr, mid+1, last);
        concure(arr,first, mid,last);
        
    }

    public static void main(String[] args) {
        int arr[]={5,7,3,1,9,13,4};
        int last=arr.length;
        int first=0;
        divide(arr,first,last-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
