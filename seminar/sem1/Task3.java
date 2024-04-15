// package seminar.sem1;

// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива. 
// При этом накладываем на метод 2 ограничения:
// метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), 
// и в каждой ячейке может лежать только значение 0 или 1. 
// Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.


public class Task3 {
    public static void main(String[] args) {
        int[][] ints = new int[][]{
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1}
            };
            System.out.println(getSumElemArray(ints));
    }
    public static int getSumElemArray(int[][] arr) {
       
        int sum = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if(size != arr[i].length) throw new RuntimeException("Array must be square");
            for (int j = 0; j < size; j++) {
                int el = arr[i][j];
                if(el != 0 && el != 1) throw new RuntimeException("Array invalid");
                sum += el;
            }
        }
        return sum;
}
}
