package seminar.sem3.teoria;

// пример использования throws

public class Task3 {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        String info = "Важная информация";
        try {
            b();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " " + info); 
            e.printStackTrace();
        }
    }
    private static void b() throws Exception { //перебрасывает обработку исключения на метод выше (в метод а())
        //// logic
        c();
        /// logic
    }

    private static void c() throws Exception { //перебрасывает обработку исключения на метод выше (в метод b())
        throw new MyException("Ошибка: ");
    }
}
