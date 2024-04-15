package seminar.sem3.teoria;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// пример применения блока try-with-resources
public class Task1 {
    public static void main(String[] args) {
        try(
            FileReader fr = new FileReader("errors.txt");
            FileWriter fw = new FileWriter("errors.txt")
        ) 
        {
            System.out.println("Читаем файл");
            //.....
        }
        catch(IOException e) {
            e.printStackTrace();
    }
    }
}
