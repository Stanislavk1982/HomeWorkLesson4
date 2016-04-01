package ua.od.hillel;

/**
 * Created by Стивен on 01.04.2016.
 */
public class Lesson4_HW_7 {
    public static void main(String[] args) {
        int sumEven = 0, sumOdd = 0, temp;
        int[] array = {-12, 465, 212, 534, 777, 1, 432, 457, 123, 765};
        for (int i = 0; i < 10; i++) {
            temp = array[i] % 2;
            if (temp == 0) {
                sumEven = sumEven + array[i];
            } else {
                sumOdd = sumOdd + array[i];
            }
        }
        System.out.println("Sum Even numbers:" + sumEven);
        System.out.println("Sum Odd numbers: " + sumOdd);


    }
}
