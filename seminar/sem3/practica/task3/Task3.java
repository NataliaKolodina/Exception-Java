package seminar.sem3.practica.task3;

import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(divide(10, 1));
        try {
            fileNotFound("text");    // метод требует обработки на исключения, так как checked
        } catch (NonExistedFileException e) {
            e.printStackTrace();
        }
    }
    public static double divide(int a, int b) {
        try {
            double result = a / b;
            return result;
        } catch (ArithmeticException e) {        
            // выбрасываем свое исключение divideByZero, без throw не увидит, где выбрасывать исключение
            throw new DivideByZeroException();
        }
        
    }

    public static void fileNotFound(String path) throws NonExistedFileException { 
        try (FileReader rd = new FileReader(path)) {
        } catch (IOException e) { 
            // сразу без throw кидать в скобкаб наше исключение NONExistedFleException мы не можем, 
            // поэтому пишем наследуемое исключение IOException
            throw new NonExistedFileException();
        }
    }
}
