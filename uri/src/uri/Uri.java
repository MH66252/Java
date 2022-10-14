
package uri;

import java.util.Scanner;

public class Uri {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       double num[][]= new double [12][12];
       double sum=0;
    //   int n;
       double a;
       char d;
    //   n=input.nextInt();
       d=input.next().charAt(0);
       
       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j]=input.nextDouble();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 4; j++) {
                       sum=sum+num[i][j];
            }
           
        }
        if(d=='S'){
             System.out.println(""+sum);
        }
        else if(d=='M'){
            a=sum/12;
            System.out.println(""+a);
        }
 
    }
    
}
