package seminar.sem2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        String str = null;
        try { 
            Integer.parseInt("abc");
            FileReader fr = new FileReader("test.txt");
            System.out.println("Блок try");
            System.out.println(str.length());
            
        }
        catch (FileNotFoundException e) {
        //  e.printStackTrace();
        try {
        FileWriter fw = new FileWriter("errors.txt", true);
        fw.write("Исключение: " + e.getMessage() + "\n");
        fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        }
        catch (NullPointerException e) {
            str = "string";
            System.out.println(str.length());
        }
        System.out.println("Вне блоков try-catch");
    }
}


