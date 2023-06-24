package org.example;

import java.util.Arrays;
import java.util.Random;

public class Methods {
    public static int newRand() {
        int i = new Random().nextInt(2000);
        return i;
    }

    public static int firstByte(int x) {
        int bytes = Integer.toBinaryString(x).length();
        System.out.println(Integer.toBinaryString(x));
        return bytes;
    }

    public static int[] theeseNumbers(int x, int l) {
        int[] array = new int[2];
        int count = 0;
        for (int i = x; i < Short.MAX_VALUE; i++) {
            if (i%l == 0) {
                array[count] = i;
                count++;
                int[] arr = Arrays.copyOf(array, array.length+1);
                array = arr;
            }
        }
        return array;
    }

    public static int[] thoseNumbers(int x, int l) {
        int[] array = new int[1];
        int count = 0;
        for (int i = Short.MIN_VALUE; i < x; i++) {
            if (i%l != 0) {
                array[count] = i;
                count++;
                int[] arr = Arrays.copyOf(array, array.length+1);
                array = arr;
            }
        }
        return array;
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.print("]");
        System.out.print("\n");
    }
}
