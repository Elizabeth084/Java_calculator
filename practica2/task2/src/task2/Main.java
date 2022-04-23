package com.company;

public class Main {


    private  static  void  printArray(int[]array){
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {

        int n=10;

        int [] c=new int[n];
        int [] x=new int[n];
        for (int i=0, j=0;i<c.length;i++) {
            c[i]= (int) (50-Math.random()*100);
            if (c[i]!=0){
                x[j]=c[i]*4;
                j++;
            }
        }

        printArray(c);
        printArray(x);
    }
}
