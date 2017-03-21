import java.util.Arrays;
import java.io.FileNotFoundException;

import static java.lang.Math.sqrt;

public class Vector {
    private int[] array;

    private void setPar(int[] array) {
        this.array = array;
    }

    public Vector(int... z) {
        this.setPar(z);
    }

    public Vector(int size) {
        this.array = new int[size];
    }

    public int getValue(int index) {
        return this.array[index];
    }

    public void setValue(int index, int value) {
        this.array[index] = value;
    }

    public int getCount() {
        return this.array.length;
    }

    public String toString() {
        String result = "";
        for (int tmpValue : array) {
            result += String.valueOf(tmpValue) + " ";
        }
        return result;
    }

    public Vector addition(Vector v1) { // сложение
        Vector v2 = this;
        Vector result = new Vector(this.getCount());
        if (v1.getCount() == v2.getCount()) {
            int Value;
            for (int i = 0; i < v1.getCount(); i++) {
                Value = v1.getValue(i) + v2.getValue(i);
                result.setValue(i, Value);
            }
        } else throw new NumberFormatException("неверный формат");
        return result;
    }

    public Vector subtract(Vector v1) { //вычитание
        Vector v2 = this;
        Vector result;
        if (v1.getCount() == v2.getCount()) {
            int Value;
            result = new Vector(v1.getCount());
            for (int i = 0; i < v1.getCount(); i++) {
                Value = v1.getValue(i) - v2.getValue(i);
                result.setValue(i, Value);
            }
        } else throw new NumberFormatException("неверный формат");
        return result;
    }

    public int dotProduct(Vector v1) { //скалярное произведение
        Vector v2 = this;
        int result = 0;
        if (v1.getCount() == v2.getCount()) {
            int tmpValue;
            for (int i = 0; i < v1.getCount(); i++) {
                tmpValue = v1.getValue(i) * v2.getValue(i);
                result += tmpValue;
            }
        } else throw new NumberFormatException("неверный формат");
        return result;
    }


    public Vector multn(int n) { //умножение на число
        Vector result = new Vector(this.getCount());
        for (int i = 0; i < this.getCount(); i++) {
            result.setValue(i, this.getValue(i) * n);
        }
        return result;
    }

    public Vector division(int n) { //деление на число
        Vector result = new Vector(this.getCount());
        if (n != 0) {
            for (int i = 0; i < this.getCount(); i++) {
                result.setValue(i, this.getValue(i) / n);
            }
        } else throw new NumberFormatException("нельзя делить на ноль");
        return result;
    }

    int length(Vector v1) { // длина/модуль вектора
        return (int) sqrt(v1.dotProduct(v1));
    }

    public static Vector vectormult(Vector v1, Vector v2) throws FileNotFoundException { //векторное произведение трехмерных векторов
        Vector result = new Vector(3);
        if ((v1.getCount() == 3) && (v2.getCount() == 3)) {
            int x = v1.getValue(1) * v2.getValue(2) - v1.getValue(2) * v2.getValue(1);
            int y = v1.getValue(2) * v2.getValue(0) - v1.getValue(0) * v2.getValue(2);
            int z = v1.getValue(0) * v2.getValue(1) - v1.getValue(1) * v2.getValue(0);
            result.setValue(0, x);
            result.setValue(1, y);
            result.setValue(2, z);
        } else throw new NumberFormatException("неверный формат");
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Arrays.equals(array, vector.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}

