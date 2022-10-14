package copyarray;

import java.text.DecimalFormat;

public class Copyarray {

    public static void main(String[] args) {
        int farr[] = {2, 3, 89, 5};
        int sarr[] = {6, 7, 8, 11};
        int newarray[] = new int[farr.length + sarr.length];
        int i = 0, j = 0, x = 0;

//      for (int index = 0; index < farr.length; index++) {
//            newarray[index] = farr[index];
//        }
//        
//        int firstArrayLength = farr.length;

//        for (int index = 0; index < sarr.length; index++) {
//            int temp = firstArrayLength + index;
//            newarray[temp] = sarr[index];
//        }
//       
//        for (int l=0;l<newarray.length;l++){
//            System.out.println("Index: "+l+"; Element: "+newarray[l]);
//        }
        
        
        
        
        

        int totalLength = farr.length+sarr.length;
        int index = 0;
        
        int newarray2[] = new int[totalLength];
        int firstIndex = 0;        
        int secondIndex = 0;
        
        while (index<totalLength) {
            if (index<farr.length) {
                newarray2[index] = farr[firstIndex];
                firstIndex++;
            } else {
                newarray2[index] = sarr[secondIndex];
                secondIndex++;
            }
            index++;
        }
        
        for (int l=0; l<newarray2.length; l++){
            System.out.println("Index: "+l+"; Element: "+newarray2[l]);
 
    }

}
} 

