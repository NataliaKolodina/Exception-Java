package lection.lesson2;

public class Task1 {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 2;
            String test = null;
            System.out.println(test.length());
    } catch (ArithmeticException e) {
        System.out.println("Operation divide by zero not supported");
    }
    catch (NullPointerException e) {
        System.out.println("Nullpointer exception");
    }
    System.out.println(number);
}
}
