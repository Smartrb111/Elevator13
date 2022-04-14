package com.task;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        int oldflour = 1;

        boolean isWorking = true;
        while(isWorking) {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите этаж");
            int newflour = console.nextInt();
            if(newflour > 10 || newflour < 0){
                System.out.println("Вы не можете поехать на этот эатж");
            }else if(newflour>oldflour){
                for(int i = oldflour; i < newflour; i++){
                    System.out.println(i);
                }
            }if(newflour < oldflour){
                for(int i = oldflour; i > newflour; i--){
                    System.out.println(i);
                }
            }
            oldflour = newflour;
            System.out.println("Вы на этаже "+ oldflour);
            System.out.println("Закончить? 1 - да/2 - нет");

            int choice = console.nextInt();
            if(choice == 1) {
                isWorking = false;
            }
        }
    }
}