/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.mca.pkg032;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Metrix {
    public static void main(String args[])
    {
        
        int r,c,i,j;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the rows:");
        r=ob.nextInt();
        System.out.print("Enter the columns:");
        c=ob.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] m = new int[r][c];
        System.out.println("Enter the elements of 1st matrix:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=ob.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd matrix");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                b[i][j]=ob.nextInt();
            }
        }
        System.out.println("Added Matrix:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                m[i][j]=a[i][j]+b[i][j];
                System.out.print(m[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }
}
