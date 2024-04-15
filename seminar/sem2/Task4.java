package seminar.sem2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

// Заставить выполниться следующий код
// public class Task4 {
//     public static void main(String[] args) {
//         InputStream inputStream;
//         try {
//             String[] strings = {"asdf", "asdf"};
//             String str = strings[2];
//             test();
//             int a = 1/ 0;
//             inputStream = new FileInputStream("bjckjcsdjcks");
//         } catch (Throwable e) {
//             e.printStackTrace();
//         } catch (StackOverflowError error) {
//             System.out.println("stack overflow error");
//         } finally {
//             System.out.println("Я все равно выполнился!");
//         }
//         System.out.println("Я жив!");
//     }

//     private static void test() throws IOException {
//         File file = new File("1");
//         file.createNewFile();
//         FileReader reader = new FileReader(file);
//         reader.read();
//         test();

//     }
// }


public class Task4 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String str = strings[2];
            test();
            int a = 1/ 0;
            inputStream = new FileInputStream("bjckjcsdjcks");
        } catch (StackOverflowError error) { 
            // !!!!! Error в catch обрабатывать никогда нельзя!!!
            // переставили блоки catch местами, так как Throwable общая ошибка, 
            // и он обрабатывает все возможные ошибки, следующие более узкие уже не обрабатываются после него
            System.out.println("stack overflow error");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();

    }
}
