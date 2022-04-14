package com.lessons.Lessons;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        /* Целочисленные массивы(Пример)
        int[] array = new int[5];
        array[0] = 10;
        System.out.println(array[0]);
        System.out.println(array[1]);
         */

        /*
        //Пример инициализации строчного массива без цикла for/for each.

        String[] string = new String[4];
        string[0] = "Казнить";
        string[1] = "нельзя";
        string[2] = "помиловать";
        string[3] = ",";
        System.out.print( string[0] );
        System.out.print(" " + string[1]);
        System.out.print(string[3]);
        System.out.print(string[2]);
         */

        String[] string = new String[3];
        string[0] = "Казнить";
        string[1] = "нельзя";
        string[2] = "помиловать";

        for(int i = 0; i<string.length; i++){          //Пример цикла for
            System.out.println(string[i]);
        }
        System.out.println();

        for (String strings:string){                  //Пример цикла for each
            System.out.println(strings);
        }
        int [] num = {1,2,3};                        //Подсчет целочисленного массива
        int sum = 0;
        for(int x:num){
            sum = sum+x;
        }
        System.out.println();
        System.out.println(sum);
    }
}
