 package lection.lesson3;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;

public class SaveService {
    public void save() throws SaveException {
        Date date = new Date();
        System.out.println("save document started...");
        try(FileWriter writer = new FileWriter("test")) {
            throw new IOException("operation failed");
            } catch(IOException e) {
                System.out.println(e.getMessage());
                throw new SaveException("Save documents failed", date, e);
    }
    
    }
}