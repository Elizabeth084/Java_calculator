package com.company;

public class Main {


    private  static  void  printArray(int[]array){
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    private static int[] sortVector(int[] vector)
    {
        boolean flag;
        int temp;
        do {
            flag = false;
            for (int i = 0; i < vector.length-1; i++) {
                if (vector[i] > vector[i+1])
                {
                    temp = vector[i];
                    vector[i] = vector[i+1];
                    vector[i+1] = temp;
                    flag = true;
                }
            }
        } while (flag);
        return vector;
    }
    public static void main(String[] args) {


        int [] x={3,4,5,2,99,56,34,6,1,457,86,356,56,35,98,54,6,5,3,76,54,5};
        for(int i=0;i<x.length;i++){
            if (x[i]==1){
                int [] t=new int[x.length-i-1];
                int i1=i;
                for(int j=0;i1<x.length-1;i1++,j++){
                    t[j]=x[i1+1];

                }
                t=sortVector(t);
                i1=i;
                for(int j=i1+1,k=0;j<x.length;j++,k++){
                    x[j]=t[k];
                }
                printArray(x);
            }
        }
    }
}
