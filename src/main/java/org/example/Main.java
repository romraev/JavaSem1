package org.example;

import java.util.Random;

//Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main
//        *Пункты реализовать в разных методах
//
//        int i = new Random().nextInt(k); //это кидалка случайных чисел!)
public class Main {
    public static void main(String[] args) {

        int i = Methods.newRand(); //1
        System.out.println(i);
        int n = Methods.firstByte(i); //2
        System.out.println(n);
        int[] m1 = Methods.theeseNumbers(i, n); //3
        Methods.printArr(m1);
        int[] m2 = Methods.thoseNumbers(i, n); //4
        Methods.printArr(m2);
    }


}