package target;
import java.util.Scanner;

public class Target {
    public static void twosum(int array[], int target){
        int sum;
      
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length; j++) {
                sum=array[i]+array[j];
                if(sum==target){
                    System.out.printf("[%d, %d]",i,j);
                    break;
                    
                }
                
            }
        }
    }
    public static void main(String[] args) {
      Scanner input=new Scanner (System.in);
      
      int array[]=new int [20];
        System.out.println("Enter your target");
      int target=input.nextInt();
        System.out.println("Enter the numbers");
        for (int i = 0; i < 5; i++) {
            array[i]=input.nextInt();
        }
      
      twosum(array,target);
      
    }
    
}
