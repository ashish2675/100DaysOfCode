package com.company;

import java.util.Scanner;

public class ForestFire{
    static int m,n,r,c;
    static int temp[][];
    static char mat[][];

    public static void countTime(char mat[][], int temp[][], int n ,int row, int col, int count)
    {
        if((row>=n) || (row<0) || (col<0) || (col >= n) || (mat[row][col] == 'W')){
            return;
        }
        if (temp[row][col] != 0 && count >= temp[row][col])
            return;

        temp [row][col] = count;
        countTime(mat,temp,n,row+1,col,count+1 );
        countTime(mat,temp,n,row-1,col,count+1 );
        countTime(mat,temp,n,row,col+1,count+1 );
        countTime(mat,temp,n,row,col-1,count+1 );
        countTime(mat,temp,n,row+1,col+1,count+1 );
        countTime(mat,temp,n,row+1,col-1,count+1 );
        countTime(mat,temp,n,row-1,col+1,count+1 );
        countTime(mat,temp,n,row-1,col-1,count+1 );
    }
    static int getTime(){
        countTime(mat,temp,n,r-1,c-1,1);
        int max  = Integer.MIN_VALUE;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++)
            {
                if(max <temp[i][j])
                    max = temp[i][j];

            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        r = sc.nextInt();
        c = sc.nextInt();

        mat = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.next().charAt(0);
            }
            temp = new int[m][n];

            System.out.println(getTime());
        }
    }

}