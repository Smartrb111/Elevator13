package com.task;

import java.util.Random;

public class WorkinWithMassive {
    public static void main(String[] args) {
        int[][] numbers = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                numbers[i][j] = random.nextInt(10);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(numbers[i][j] + " ");
            System.out.println();
        }
    }
}
