package seminar.sem2;

public class CheckFloat {
    public static void main(String[] args) {
        
    }

    private boolean isFloat(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
