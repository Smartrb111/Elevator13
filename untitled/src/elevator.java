import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int oldFlour = 1;

        boolean isExit = false;
        while (!isExit) {
            System.out.println("Введите кнопку этажа,как закончите поездку напишите ВЫХОД");
            int newFlour = console.nextInt();

            if (newFlour > 10 || newFlour < 0) {
                System.out.println("Вы не можете поехать на этот этаж");

            } else if (newFlour > oldFlour) {
                for (int i = oldFlour; i < newFlour; i++) {
                    System.out.println("Вы на этаже " + i);

                }
                if (newFlour < oldFlour) {
                    for (int i = oldFlour; i < newFlour; i--) {
                        System.out.println("Вы на этаже " + i);
                    }
                    Scanner console1 = new Scanner(System.in);
                    String line = console1.nextLine();
                    if (line.equals("ВЫХОД")) {
                        isExit = true;


                    }
                }


            }

        }
    }
}
