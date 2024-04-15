package seminar.sem3.teoria;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// как при возникновении cheked исключения бросить его в unchecked исключения
public class Task2 {
    public static void main(String[] args) {
        try(
            FileReader fr = new FileReader("errors1.txt");
            FileWriter fw = new FileWriter("errors.txt")
        ) 
        {
            System.out.println("Читаем файл");
            throw new RuntimeException("Error!");
            //.....
        }
        catch(IOException e) {
            throw new RuntimeException("Не нашел!");
    }
    }
}
