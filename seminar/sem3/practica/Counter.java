package seminar.sem3.practica;

import java.io.IOException;


/**
Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
можно было работать в блоке try-with-resources. Подумайте, что должно происходить
при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
*/
public class Counter implements AutoCloseable {
    int count = 0;
    private boolean closed = false;
    public void add() throws IOException {
        count++;
        if(closed == true) throw new IOException("Resources closed");
    }
    @Override
    public void close() throws Exception {
        closed = true;
    }
}

class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        try(counter) {
            System.out.println(counter.count);
            counter.add();
            System.out.println(counter.count);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        try {
            counter.add();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
