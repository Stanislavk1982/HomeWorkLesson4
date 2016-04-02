package ua.od.hillel;

/**
 * Created by Стивен on 02.04.2016.
 */
public class Lesson4_HW_10 {
    public static void main(String[] args) {
        int[] array = {23, 55, 1, -6, 89, 1156, -21, 10, -111, -543, 22};
        int[] arrayMinimum = new int[5];
        int i, min;
        arrayMinimum[0] = array[0];
        // Находим сомое минимальное число в массиве
        for (i = 0; i < 10; i++) {
            if (arrayMinimum[0] > array[i])
                arrayMinimum[0] = array[i];
        }

        for (i = 1; i < 5; i++) {
            min = 99999;
            for (int k = 0; k < 10; k++) {
                if (array[k] < min && array[k] > arrayMinimum[i - 1]) {
                    min = array[k];
                }
                arrayMinimum[i] = min;
            }
        }
        System.out.println("Пять минимальных чисел массива:");
        for (i = 0; i < 5; i++)
            System.out.println(arrayMinimum[i]);

    }
}
