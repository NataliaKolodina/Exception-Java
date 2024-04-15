// package seminar.sem1;

// ���������� �����, ����������� � �������� ��������� ������������� ��������� ������.
// ���������� ��������� � ������� ����� ��������� ����� �������. 
// ��� ���� ����������� �� ����� 2 �����������:
// ����� ����� �������� ������ � ����������� ��������� (���-�� ����� = ���-�� ��������), 
// � � ������ ������ ����� ������ ������ �������� 0 ��� 1. 
// ���� ���������� ���� �� �������, ����� ������ ������� RuntimeException � ���������� �� ������.


public class Task3 {
    public static void main(String[] args) {
        int[][] ints = new int[][]{
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1},
            {1, 0, 1, 1, 1}
            };
            System.out.println(getSumElemArray(ints));
    }
    public static int getSumElemArray(int[][] arr) {
       
        int sum = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if(size != arr[i].length) throw new RuntimeException("Array must be square");
            for (int j = 0; j < size; j++) {
                int el = arr[i][j];
                if(el != 0 && el != 1) throw new RuntimeException("Array invalid");
                sum += el;
            }
        }
        return sum;
}
}
