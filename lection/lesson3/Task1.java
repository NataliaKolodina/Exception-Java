package lection.lesson3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


// РєРѕРїРёСЂРѕРІР°РЅРёРµ РѕРґРЅРѕРіРѕ С„Р°Р№Р»Р° РІ РґСЂСѓРіРѕР№ СЃ РїРѕРјРѕС‰СЊСЋ try-with-resources
public class Task1 {
    public static void main(String[] args) {
        
        try (FileReader reader = new FileReader("task3.txt"); 
        FileWriter writer = new FileWriter("test2.txt")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } 
        System.out.println("Copy successfully"); // РїРѕС‚РѕРєРё Р·Р°РєСЂС‹РІР°СЋС‚СЃСЏ Р°РІС‚РѕРјР°С‚РёС‡РµСЃРєРё РїРѕСЃР»Рµ Р±Р»РѕРєР° try
    }
    
}
