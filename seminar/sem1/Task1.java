// package seminar.sem1;

// –еализуйте метод, принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум.
// ≈сли длина массива меньше некоторого заданного минимума, метод возвращает -1,
//  в качестве кода ошибки, иначе - длину массива.

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        System.out.println(getArrayLength(arr, 3));
        
    }

    public static int getArrayLength(int[] array, int min) {
        if (array.length < min) return -1;
        return array.length;
    }
}