
package cop;

public class Cop {

  
    public static void main(String[] args) {
          int array1[]={2,4,6,3};
     int array2[]={9,1,7,23};
     
     int firstarraylength=array1.length;
     int secondarraylength=array2.length;
    
     
     int array3[]=new int [firstarraylength+secondarraylength];
     
     for(int i=0; i<array1.length; i++){
         array3[i]=array1[i];
     }
     
     for(int j=0; j<array2.length; j++){
          int temp=firstarraylength+j;
         array3[temp]=array2[j];
         System.out.println(temp);
     }
     
     for(int i=0; i<array3.length; i++){
         System.out.print(array3[i]+" ");
     }
    }
    
}
