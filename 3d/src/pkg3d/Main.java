
package pkg3d;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int array[][][]=new int[100][100][100];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(array[i][j][k]+"  ");
                }
                System.out.println();
            }
            System.out.println();
        }
       
    }
    
}
