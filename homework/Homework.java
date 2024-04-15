package homework;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) throws ParseException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(
                    "Введите свои данные в формате: \nФамилия Имя Отчество dd.mm.yyyy 8888888888 f/m");
            System.out.println("Где:\ndd.mm.yyyy - дата_рождения, \n8888888888 - номер_телефона, \nf или m - пол.");
            String input = scanner.nextLine();
            String[] array = input.split(" ");

            // проверяем, что введено 6 элементов
            if (array.length != 6) {
                throw new IncorrectAmountOfData();
            }

            // проверяем формат даты рождения

            try {
                Date df = new SimpleDateFormat("dd.mm.yyyy").parse(array[3]);
            } catch (Exception e) {
                throw new InputDateException("Неверный формат даты рождения. Ожидается формат dd.mm.yyyy");
            }

            // проверяем формат номера телефона
            try {
                Integer.parseInt(array[4]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Введите корректный номер телефона.");
            }

            // проверяем пол
            String gender = array[5];
            if (!gender.equals("f") && !gender.equals("m")) {
                throw new IllegalArgumentException("Пол должен быть обозначен символом f или m.");
            }

            Person person = new Person(array[0], array[1], array[2], array[3], array[4], array[5]);

            String fileName = array[0] + ".txt";
            try (FileWriter fw = new FileWriter(fileName, true)) {
                fw.write(person.toString());
                fw.flush();
                System.out.println("Данные успешно записаны в файл");
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }
}

// Колодина Наталия Сергеевна 08.01.1989 899999999 f