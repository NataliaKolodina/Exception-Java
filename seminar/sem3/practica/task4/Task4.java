package seminar.sem3.practica.task4;

import java.util.HashMap;
import java.util.Map;

// Напишите метод, на вход которого подаётся двумерный строковый массив размером 3х3.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

// 1. Далее метод должен пройтись по всем элементам массива, преобразовать в число и просуммировать.
// Если в каком-то элементе массива преобразование не удалось
// (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException
// с детализацией, в какой именно ячейке лежат неверные данные.

// 2. В методе main() вызвать полученный метод, обработать возможные исключения
// MyArraySizeException и MyArrayDataException и вывести результат расчета
// (сумму элементов, при условии, что подали на вход корректный массив).
// */
public class Task4 {
static String[][] arr = new String[][] {
{"1", "кк", "1.5"},
{"1", "1.5", "gbgngh"},
{"q", "1.5", "1.5"}
};


public static void main(String[] args) {
System.out.println(sum2dV2(arr));
}

public static double sum2d(String[][] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
    if(arr[i].length != arr.length) throw new MyArraySizeException(); // обрабатываем исключение, если не квадрат
        for (int j = 0; j < arr.length; j++) {
            try {
            sum += Double.parseDouble(arr[i][j]);
            } catch (NumberFormatException e) {    // обрабатываем исключение, если не число в ячейке
                throw new MyArrayDataException(i, j);
            }
        }
    }
return sum;
}

public static double sum2dV2(String[][] arr) {
    double sum = 0;
    Map<Point2d, String> cache = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        if(arr[i].length != arr.length) throw new MyArraySizeException();
        for (int j = 0; j < arr.length; j++) {
            try {
                sum += Double.parseDouble(arr[i][j]);
            } catch (NumberFormatException e) {   
                cache.put(new Point2d(i, j), arr[i][j]); // в наш cache добавляем невалидную ячейку
            }
        }
       
    }
    if (!cache.isEmpty()) throw new MyArrayDataException(cache);
return sum;
}

}