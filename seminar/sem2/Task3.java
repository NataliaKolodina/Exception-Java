package seminar.sem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Запишите в файл следующие строки:
// Анна=4
// Елена=5
// Марина=6
// Владимир=?
// Полина=?
// Константин=?
// Иван=4

// Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив 
// (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных,
// если сохранено значение ?, заменить его на соответствующее число. 
// Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение. 
// Записать в тот же файл данные с замененными ?.


public class Task3 {
    private static final List<String> strings = List.of
        ("Анна=4", "Елена=5", "Марина=6", "Владимир=?", "Полина=?", "Константин=?", "Иван=4");
        // для проверки заменить какое-то значение на null

        public static void main(String[] args) {
            String path = "task3.txt"; // создаем переменную файла
            write(path, strings);
            rewrite(path);
        }

        // метод записи "сырых" данных в файл
        private static void write(String path, List<String> data) { 
            FileWriter fw = null; // инициализируем переменную, для того, чтобы она была видна в блоке finally
            
            try { 
                fw = new FileWriter(path);
                for (String str : data) { // записываем каждую строку в файл с переносом на ноую строку \n
                    fw.write(str + "\n");
                }
                fw.flush(); // делаем flash, чтобы точно все записалось
            } 
            
            catch (IOException e) { // обрабатываем исключение для FileWriter
                e.printStackTrace();
            } 
            
            finally {
                try {
                    fw.close();
                } catch (IOException e) { // отработаели исключение checked в функции close 
                    e.printStackTrace();
                }
            }
        }


        // метод считываем данные файла, анализируем и заменяем данные на нужные
        private static Map<String, Integer> analyze(String path) {
            Map<String, Integer> resultMap = new HashMap<>();
            BufferedReader br = null; // выносим объект за try-catch и инициализируем для видимости
            try { 
                br = new BufferedReader(new FileReader(path));
                String line;
                while ((line = br.readLine()) != null) { // цикл до тех пор, пока есть строки в считываемом файле
                    String[] arr = line.split("=");// разбиваем строчку на значение и ключ по знаку =
                    String key = arr[0];
                    String temp = arr[1];
                    int value;
                    if(temp.equals("?")) {
                        value = key.length();
                    } else {
                        value = Integer.parseInt(temp);
                    }
                    resultMap.put(key, value);
                }
            } 
            catch (IOException e) { // обрабатываем исключение FileReader
                e.printStackTrace();
            }
            catch (NumberFormatException e) { // обрабатываем изключение, если значениепосле = не число и не ?
                throw new NumberFormatException("Невалидные данные");
            }
            finally {
                try {
                    br.close(); // обязательно в finally закрываем поток
                } 
                catch (IOException e) { // обрабатываем исключение close
                    e.printStackTrace();
                } 
            }
            return resultMap;
        }

        // метод перезаписи в файл
        private static void rewrite(String path) {
            write(path, convert(analyze(path)));
        }

        // метод трансформации данных в список
        private static List<String> convert(Map<String, Integer> dataMap) {
            List<String> result = new ArrayList<>();
            for(Map.Entry<String, Integer> entry : dataMap.entrySet()) {
                result.add(entry.toString());    
        }
        return result;
        }

    }
