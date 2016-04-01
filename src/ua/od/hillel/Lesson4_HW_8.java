package ua.od.hillel;

/**
 * Created by Стивен on 02.04.2016.
 */
public class Lesson4_HW_8 {
    public static void main(String[] args) {
        int[] arrayTemp = new int[6];
        int temp1, temp2, tempNumber, lucky, x; //, i = 256654;
        for (int i = 100000; i < 1000000; i++) {
            tempNumber = i;
            x = 0;
            //lucky = i;
            while (tempNumber > 0) {
                arrayTemp[x] = tempNumber % 10;
                tempNumber = tempNumber / 10;
                x++;
            }
            temp1 = arrayTemp[0] + arrayTemp[1] + arrayTemp[2];
            temp2 = arrayTemp[3] + arrayTemp[4] + arrayTemp[5];
            if (temp1 == temp2) {
                System.out.println("First 3 digits: " +temp2);
                System.out.println("Second 3 digits: " + temp1);
                System.out.println("The lucky ticket:" + i);
                System.out.println("-----------------------------------");
            }
        }

    }


}
