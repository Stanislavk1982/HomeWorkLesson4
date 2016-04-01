package ua.od.hillel;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Стивен on 02.04.2016.
 */
public class Lessons4_HW_9 {
    public static void main(String[] args) {
        int length = 0, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 4095");
        int operation = scanner.nextInt();
        if (operation > 0 && operation < 256) length = 8;
        if (operation > 255 && operation < 512) length = 9;
        if (operation > 511 && operation < 1024) length = 10;
        if (operation > 1023 && operation < 2048) length = 11;
        if (operation > 2047 && operation < 4096) length = 12;
        int[] array = new int[length];


        for (i = length; i > 0; i--) {
            //System.out.println(i);
            array[i - 1] = operation % 2;
            operation = operation / 2;
            //System.out.println(array[m-1]);
        }

        for (i = 0; i < length; i++) {
            System.out.println(array[i]);
        }

        //System.out.println(array[3]);
        //System.out.println(array[1]);


    }
}
