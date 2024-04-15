package seminar.sem3.teoria;

import java.io.IOException;

public class MyException extends IOException { // создаем наше checked исключение
    public MyException(String message) {
        super(message);
    }
    // ??? своя логика конструктора исключения.
}
