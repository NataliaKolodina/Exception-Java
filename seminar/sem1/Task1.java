// package seminar.sem1;

// ���������� �����, ����������� � �������� ���������� ������������� ������ � ��������� ���������� �������.
// ���� ����� ������� ������ ���������� ��������� ��������, ����� ���������� -1,
//  � �������� ���� ������, ����� - ����� �������.

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        System.out.println(getArrayLength(arr, 3));
        
    }

    public static int getArrayLength(int[] array, int min) {
        if (array.length < min) return -1;
        return array.length;
    }
}