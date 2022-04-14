package com.lessons.Lessons;

public class MultiArrays {
    public static void main(String[] args) {
        /*
        Это пример одномерного массива
        int[] num = {1,2,3};
        System.out.println(num[1]);
         */
        int[][] matrice = {{1,2,3},  // Пример вывода двмерного массива
                          {4,5,6},
                          {7,8,9}};
       for (int i = 0; i<matrice.length; i++){
           for(int j = 0; j<matrice.length; j++){
               System.out.print(matrice[i][j] +" ");
           }
           System.out.println();
       }
    }


}
