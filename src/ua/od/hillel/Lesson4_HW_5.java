package ua.od.hillel;

import java.util.Scanner;

/**
 * Created by Стивен on 01.04.2016.
 */
public class Lesson4_HW_5 {
    public static void main(String[] args) {
        int counter, sum = 0;
        int[] array1 = {2, 3, 65, 123, 667, 412, -4, 84, 77, 1235, 767, 4};
        Scanner scanner = new Scanner(System.in);
        counter = scanner.nextInt();
        for (int i = 0; i < counter; i++) {
            sum = sum + array1[i];
            //System.out.println(array1[i]);
            //System.out.println(sum);
        }
        System.out.println("Total sum: " + sum);
    }
}
