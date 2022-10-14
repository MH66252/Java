
package user;

import java.util.Scanner;
public class User {
public static int addtwosum(int a){
    if(a<0){
        System.out.println("invalid number");
    }
    int fact=1;
   for(int i=a; i>=1; i--){
       fact=fact*i;
   }
   System.out.println("Fact of n = "+fact);
    return 0;

}
    
    
    
    
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      int a,b;
        System.out.println("Enter the value of N");
      a=input.nextInt();
   
      addtwosum(a);
      
       
     
    }
    
}
