package ua.od.hillel;

/**
 * Created by Стивен on 01.04.2016.
 */
public class Lesson4_HW_6 {
    public static void main(String[] args) {
        int min, max;
        int[] array = {12, 54, -11, 345, 2, -867, 123, 55, 856, 987};
        min = array[0];
        max = array[0];
        for (int i = 1; i < 10; i++) {
            if (min > array[i]) min = array[i];
            if (max < array[i]) max = array[i];
        }
        System.out.println("The minimum number:" +min);
        System.out.println("The maximum number:" + max);
    }
}
