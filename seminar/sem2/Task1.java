package seminar.sem2;

import java.util.InputMismatchException;
import java.util.Scanner;

// Скорректировать изначальный код

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, " + "в который хотите записать значение 1");
        
        int index = 0;
        if (scanner.hasNextInt()) {
            index = scanner.nextInt();
        } else { System.err.println("Индекс массива должен быть целым числом (int) > -1");
        return;
    }

        try {
            arr[index] = 1;
            System.out.println("Записано успешно");
        } 

        catch (IndexOutOfBoundsException e) {
            System.err.println("Указан индекс за пределами массива, пределы от 0 до 9");
        }

        // catch (InputMismatchException e) {
        //     System.err.println("Индекс массива должен быть целым числом (int) > -1");
        // }

        
    }
}
