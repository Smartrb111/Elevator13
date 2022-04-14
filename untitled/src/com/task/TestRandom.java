package com.task;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        /*Первый способ получения рандомных чисел.
        for (int i = 0; i < 100; i++){
            System.out.println(Math.round(Math.random()*10));
        }
         */
        Random rand = new Random();

        for (int i = 0; i < 20; i++){
            rand.nextInt();                              //Можно сразу System.out.println(rand.nextInt(10));
            System.out.println(rand.nextInt(10));


        }
    }
}
