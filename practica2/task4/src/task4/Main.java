// Дан двумерный массив А, размером (nxn) (или квадратная матрица А). Найти сумму номеров минимального и максимального элементов её главной диагонали.

package com.company;

public class Main {

    private   static  void printMatrix(int[][]matrix){
        for (int i=0;i<matrix[0].length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        int matrix[][]=new int [n][n];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]=(int) (Math.random()*100);
            }
        }
        printMatrix(matrix);
        System.out.println();
        int min=matrix[0][0];
        int minI=0;
        int minJ=0;
        int maxI=0;
        int maxJ=0;
        int max=matrix[0][0];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==j){
                    if (matrix[i][j]>max) {
                        max = matrix[i][j];
                        maxI=i;
                        maxJ=j;
                    }
                    if (matrix[i][j]<min){
                        min=matrix[i][j];
                        minI=i;
                        minJ=j;
                    }
                }
            }
        }

      int sumIndexMin=minI+minJ;
        int sumIndexMax=maxI+maxJ;
        System.out.println(sumIndexMax);
        System.out.println(sumIndexMin);

    }
}
