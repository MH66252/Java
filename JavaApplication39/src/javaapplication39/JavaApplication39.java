
package javaapplication39;

import java.util.Scanner;

public class JavaApplication39 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
      int n,count=0;
      n=input.nextInt();
      for(int i=n; i<1000; i++){
          if(i%2!=0){
              count++;
              
              System.out.println(i);
              if(count==6){
                  break;
              }
          }
      }
    }
    
}
