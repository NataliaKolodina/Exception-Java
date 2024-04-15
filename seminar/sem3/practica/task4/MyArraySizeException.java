package seminar.sem3.practica.task4;

public class MyArraySizeException extends IndexOutOfBoundsException {
    public MyArraySizeException() {
        super("Массив должен быть 3x3");
    }
}
