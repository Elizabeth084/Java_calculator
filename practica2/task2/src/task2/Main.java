//Дан массив x(n). Переписать в массив y(n) отрицательные элементы массива x умноженные на 2.

import java.util.Random;
public class Main {
    private static final int n = 5;
     public static void main(String[] args) {
     int[] array = new Random().ints(n, -99, 99).toArray();
     int[] array2 = new int[array.length];
     int a = 10;
     for(int i = 0;i < array.length;i++) {
         if(array[array.length -i - 1]<a) {
             array2[i]=array[array.length-i-1];
             System.out.println(array2[i]);
         }
     }
  }
}
