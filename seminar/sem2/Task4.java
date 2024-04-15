package seminar.sem2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

// ��������� ����������� ��������� ���
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
//             System.out.println("� ��� ����� ����������!");
//         }
//         System.out.println("� ���!");
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
            // !!!!! Error � catch ������������ ������� ������!!!
            // ����������� ����� catch �������, ��� ��� Throwable ����� ������, 
            // � �� ������������ ��� ��������� ������, ��������� ����� ����� ��� �� �������������� ����� ����
            System.out.println("stack overflow error");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("� ��� ����� ����������!");
        }
        System.out.println("� ���!");
    }

    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();

    }
}
