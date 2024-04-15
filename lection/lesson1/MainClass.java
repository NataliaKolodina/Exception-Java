
public class MainClass {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));

    
    }

public static int divide(int a, int b) {
    if(b == 0){
        throw new RuntimeException("Нельзя делить на 0");
    }
    return a/b;
}
}