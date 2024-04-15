package lection.lesson3;

import java.io.IOException;
import java.sql.Date;

// создание нового типа исключений
public class SaveException extends IOException { // наследование от checked исключения, можно наследовать от unchecked (TimeRunException)
    private Date startDate;
    public SaveException(String message, Date startDate, Exception e) {
        
        super(message,e);
        this.startDate = startDate; // добавляем метод замерения даты 

    }
    public Date getStartDate() {
        return startDate;
    }
}
