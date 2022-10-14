/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solution;

import java.io.IOException;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num[][] = new double[12][12];
        double sum = 0;
        int n;
        double a;
        char d;
//        n = input.nextInt();
        d = input.next().charAt(0);

        int size = 12;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                num[i][j] = i + j;
                System.out.println("Total: [i][j] " + i + "," + j + " -> " + (i + j));
            }
        }

        System.out.println("*********************");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                sum = sum + num[i][j];
                System.out.println("Total: [i][j] " + i + "," + j + " -> " + sum);
            }
        }

        DecimalFormat df = new DecimalFormat("#.#");
        if (d == 'S') {
            System.out.println(df.format(sum));
        } else if (d == 'M') {
            a = sum / size;
            System.out.println(df.format(a));
        }

    }

}
