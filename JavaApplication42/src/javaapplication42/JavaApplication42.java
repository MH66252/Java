package javaapplication42;

import java.util.Arrays;
public class JavaApplication42 {

    public static void main(String[] args) {
     int array1[]={2,4,3};
     int array2[]={5,6,4};
     
     int l1=array1.length;
     int l2=array2.length;
     
      
        
        int sum1=0;
        int sum2=0;
        
        for(int i=0; i<l1; i++){
            sum1=(sum1*10)+array1[i];
        }
        for(int i=0; i<l1; i++){
            sum2=(sum2*10)+array2[i];
        }
        
        int temp=sum1;
        int temp2=sum2;
        int Sum2=0;
        int Sum1=0;
        int r,R;

        while(temp!=0){
           r=temp%10;
            Sum1=(Sum1*10)+r;
            temp=temp/10;
        }
             while(temp2!=0){
           R=temp2%10;
            Sum2=(Sum2*10)+R;
            temp2=temp2/10;
        }
             int result=Sum1+Sum2;
             int temps=result;
             int rem,rem1;
     int  array5[]=new int[l1];
     
     
      int x=0;
             while(temps!=0){
                
                 rem=temps%10;
                 rem1=temps/10;
                 temps=rem1;
              array5[x++]=rem;
             
             }
            int array6[] = new int [100];
            
            for (int i = 0; i <array5.length; i++) {
                System.arraycopy(array5[i], 0, array6[i], 0, array5.length);
        }
            

    }
    
}
