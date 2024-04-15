package homework;

public class Person {
    String surname;
    String name;
    String patronymic;
    String birthdate;
    String phoneNumber;
    String gender;

    public Person(
        String surname, String name, String patronymic, String birthdate, String phoneNumber, String gender) {
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.birthdate = birthdate;
            this.phoneNumber = phoneNumber;
            this.gender = gender;
        }

       @Override
       public String toString() {
        return String.format("<%s> <%s> <%s> <%s> <%s> <%s>\n", surname, name, patronymic, birthdate, phoneNumber, gender);
       } 


        }
