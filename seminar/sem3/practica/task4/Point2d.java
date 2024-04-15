package seminar.sem3.practica.task4;

import java.util.Objects;

public class Point2d {
    private int x;
    private int y;

    public Point2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Координаты: (%d; %d)", x, y);
    }

    @Override
public boolean equals(Object o) {   // принимает аргумент типа Object. 
    // Проверяем, если адрес приходящего объекта уже есть и это один и тот же объект, то true. 
    // Если этого объекта еще нет, то false.
if (this == o) return true;
if (!(o instanceof Point2d)) return false;
Point2d point2d = (Point2d) o;
return x == point2d.x && y == point2d.y;
}

@Override
public int hashCode() {   // высчитывает для нового объекта адрес в памяти
return Objects.hash(x, y);
}

}
