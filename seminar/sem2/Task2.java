package seminar.sem2;

// ����������� ��������� �������������� ��������. "�����" �������� � �������� ������� �������� ������.
// ����� ������ � ��� ������, ������� ����������


public class Task2 {
    public static void main(String[] args) {

        String[][] arr0 = new String[][] {
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
        };

        String[][] arr = new String[][] {
            {"1", "s", "12"},
            {"1", "2", "1", "1", "1"},
            {"1", "2"},
            {"3"},
            {"2", "6"},
        };

        System.out.println(sum2d(arr));
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(isNumber(arr[i][j])) {                 
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
            } 
            else {
                throw new NumberFormatException(
                    String.format("В двумерном массиве по адресу [%d][%d] - не число", i, j));
            }
        }
    }
        return sum;
    }
    
    private static boolean isNumber(String str) { // метод, чтобы понять, лежит ли число в строке
        try {
            Double.parseDouble(str);
            return true;
        } 
        catch (NumberFormatException e) {
            return false;
        }
    }
}

