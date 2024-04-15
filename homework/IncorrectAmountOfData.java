package homework;

public class IncorrectAmountOfData extends IndexOutOfBoundsException {
    public IncorrectAmountOfData() {
            super("Было введено неверное количество данных.");
        }
    }

