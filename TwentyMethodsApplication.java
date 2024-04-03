package com.bondarenko.twentymethods;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwentyMethodsApplication {

    public static void main(String[] args) {
        //1
        char[] testArray = {'A', 'B', 'C'};
        charArray(testArray);
    }

    public static void charArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    //1) принимает массив чаров, выводит его на экран
    //2) принимает массив интов, возвращает массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта
    //3) приминает 2 инта, а и б, возвращает большее их этих 2х чисел
    //4)принимает 3инта,возвращает большее из них
    //5) приминает 5 интов, возвращает большее из них
    //6) принимает массив чаров, возвращает строку состоящую из символов массива (symbols.toString)
    //8) принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым,
    //начиная с начала массива. Если значения в массиве нет возвращает -1
    //9) принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение
    //совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
    //10) метод принимает инт, и возвращает факториал от заданого инта
    //11.принимает инт год, и возвращает тру если год высокосный.Рік вважається високосним, якщо він ділиться на 4.
    // Винятком є роки, які кратні 100 (такі роки є високосними тільки тоді, якщо вони ще діляться на 400).
    //12) приминает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
    //13) метод принимает массив интов сортирует его по возрастанию
    //14) принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
    //15) принимает два массива интов одинаковых по длинне, возращает массив интов который состоит из перемноженных елементов входящих массивов
    //16) принимает два массива интов, возвращает массив из елементов которые не совпадают в массивах
    //17)принимает масив интов, возвращает его же но в реверсном порядке
    // 18)принимает 3 инта: -размер выходного массива, -нижняя граница, -верхняя граница
    // возвращает массив интов заданой длинный,который содержит случайные числа от нижней границы до верхней границы"
    //19)принимает 2 массива чаров, проверяет есть ли в 1 массиве, такая же последовательность символов которую
    // представляет собой второй массив.Возвращает булеан

}