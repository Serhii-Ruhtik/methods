package com.havrilyk.twentymethods;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TwentyMethodsApplication {

    public static void main(String[] args) {
        //1 робила Анастасія
        char[] testArray = {'A', 'B', 'C'};
        charArray(testArray);

        //2
        int[] arrayTask2 = {1, 2, 3, 4, 5};
        intToChar(arrayTask2);

        //3
        int a = 10;
        int b = 20;
        maxOfTwoNumerics(a, b);

        //4
        int x = 30;
        int y = 40;
        int c = 50;
        maxOfThreeNumerics(x, y, c);

        //5
        int one = 60;
        int two = 70;
        int three = 80;
        int four = 90;
        int five = 100;
        maxOfFiveNumerics(one, two, three, four, five);

        //6
        char[] string = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        charToString(string);

        //8
        int[] array8 = {10, 20, 60, 40, 50, 80, 30, 90};
        int num8 = 2;
        valueArray(array8, num8);

        //9
        int[] array9 = {10, 20, 60, 40, 50, 80, 30, 90};
        int num9 = 20;
        indexArray(array9, num9);

        //10
        int n = 4;
        factorialNumber(n);

        //11
        int year = 2024;
//        intercalaryYear(year);
        System.out.println(intercalaryYear(year));

        //12
        int[] array12 = {10, 20, 60, 40, 50, 80, 30, 90};
        int num12 = 3;
        multiplesNum(array12, num12);


        //13
        int[] arrayForSort = {60, 20, 10, 40, 30, 50};
        bubbleSort(arrayForSort);

        //14
        byte[] array14 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Task 14 = " + byteArray(array14));

        //15
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {2, 3, 4, 5, 6};
        multiplyArray(array1, array2);

        //16
        int[] array3 = {7, 2, 3, 8, 5, 9};
        int[] array4 = {1, 2, 3, 4, 5, 6};
        notSimilar(array3, array4);

        // 17
        int[] array17 = {1, 2, 3, 4, 5, 6, 7};
        reversArray(array17);

        //18
        int sizeArray = 10;
        int minLimit = 2;
        int maxLimit = 8;
        randomArrayInt(sizeArray, minLimit, maxLimit);

        //19
        char[] string1 = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        char[] string2 = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        checkArraySimilarity(string1, string2);
    }


    public static void charArray(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static char[] intToChar(int [] array) {
        System.out.print("Task 2 == ");
        char[] arrayChar = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayChar[i] = (char) array[i];
            System.out.print(arrayChar);
        }
        System.out.println();
        return arrayChar;
    }

    public static int maxOfTwoNumerics(int a, int b) {
        int max = a > b ? a : b;
//        System.out.println("task 3 = " + max);

        return max;
//        if (a > b) {
//            System.out.println("task 3 = " + a);
//        } else {
//            System.out.println("task 3 = " + b);
//        }
//        return a;
    }

    public static int maxOfThreeNumerics(int x, int y, int c) {
        int max = maxOfTwoNumerics(x, y) > c ? maxOfTwoNumerics(x, y) : c;
//        System.out.println("task 4 = " + max);
        return max;

//        if (x > y) {
//            System.out.println("Task 4 = " + x);
//        } else if (y > c) {
//            System.out.println("Task 4 = " + y);
//        } else if (c > y) {
//            System.out.println("Task 4 = " + c);
//        }
    }

    public static int maxOfFiveNumerics(int one, int two, int three, int four, int five) {
        int max1 = maxOfTwoNumerics(one, two);
        int max2 = maxOfThreeNumerics(three, four, five);
        int result = max1 > max2 ? max1 : max2;

        System.out.println("Task 5 = " + result);

        return result;
    }

    public static String charToString(char[] string) {
//        System.out.print("Task 6 = ");
        System.out.print("Task 6 = ");
        StringBuilder result = new StringBuilder();
        for (char c : string) {
            result.append(c);
        }
        System.out.println(result);
        return result.toString();
    }

    public static void valueArray(int[] array8, int num8) {
        System.out.print("Task 8 = ");
        for (int i = 0; i < array8.length; i++) {
            if (i == num8) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Value = -1");
    }

    public static void indexArray(int[] array9, int num9) {
        System.out.print("Task 9 = ");
        for (int i = array9.length - 1; i >= 0 ; i--) {
            if (array9[i] == num9) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Value = -1");
    }

    public static int factorialNumber(int n) {
        System.out.print("Task 10 = ");
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;

        }
        System.out.println(result);
        return result;
    }

    public static boolean intercalaryYear(int year) {
        System.out.print("Task 11 = " + year + " ");
        if (year % 4 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else{
            return  false;
        }
    }

    public static void bubbleSort(int[] array) {
        System.out.print("Task 13 = ");
        int repeated = 0;
        boolean changeHappened = true;

        while (changeHappened) {
            changeHappened = false;

            for (int i = 0; i < array.length - 1 - repeated; i++) {

                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    changeHappened = true;
                }
            }
            repeated++;

        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int multiplesNum(int[] array12, int num12) {
        System.out.print("Task 12 = ");
        int mulNum = 0;
        for (int j : array12) {
            if (j % num12 == 0) {
                mulNum = j;
                System.out.print(mulNum + " ");
            }
        }
        System.out.println();
        return mulNum;
    }

    public static boolean byteArray(byte[] array14) {

        for (int i = 0; i < array14.length - 1; i++) {
            for (int j = i + 1; j < array14.length; j++) {
                if (array14[i] == array14[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int [] multiplyArray(int[] array1, int[] array2) {
        System.out.print("Task 15 = ");
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] * array2[i];
        }
//        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result));
        return result;

    }

    public static void notSimilar(int[] array3, int[] array4) {
        System.out.print("Task 16 = ");
        int[] resultSimilar = new int[array3.length];
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] != array4[i]) {
                resultSimilar[i] = array3[i];
            }
//            System.out.print(resultSimilar[i] + " ");
        }

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] != array4[i]) {
                resultSimilar[i] = array4[i];
            }
//            System.out.print(resultSimilar[i] + " ");
        }
        System.out.println(Arrays.toString(resultSimilar));

    }

    public static void reversArray(int[] array17) {
        System.out.print("Task 17 = ");
        for (int i = 0; i < array17.length / 2; i++) {
            int temp = array17[i];
            array17[i] = array17[array17.length - 1 - i];
            array17[array17.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array17));
    }

    public static int [] randomArrayInt(int sizeArray, int minLimit, int maxLimit) {
        System.out.print("Tack 18 = ");
        int[] randomArray = new int[sizeArray];
        for (int i = 0; i < randomArray.length; i++) {
            int valueRandom = (int) (Math.random() * (maxLimit - minLimit + 1) + minLimit);
            randomArray[i] = valueRandom;

            System.out.print(randomArray[i] + " ");
        }
        System.out.println();
        return randomArray;
    }

    public static void checkArraySimilarity(char[] string1, char[] string2) {
        System.out.print("Task 19 = ");
        boolean arraySimilar = true;

        if (string1.length != string2.length) {
            arraySimilar = false;
        } else {
            for (int i = 0; i < string1.length; i++) {
                if (string1[i] != string2[i]) {
                    arraySimilar = false;
                    break;
                }
            }
        }
         System.out.println(arraySimilar);
    }




    //✅1) принимает массив чаров, выводит его на экран
    //🤷‍♂️2) принимает массив интов, возвращает массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта
    //✅3) приминает 2 инта, а и б, возвращает большее их этих 2х чисел
    //✅4)принимает 3инта,возвращает большее из них
    //✅5) приминает 5 интов, возвращает большее из них
    //✅6) принимает массив чаров, возвращает строку состоящую из символов массива (symbols.toString)
    //✅8) принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым,
    //начиная с начала массива. Если значения в массиве нет возвращает -1
    //✅9) принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение
    //совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
    //✅10) метод принимает инт, и возвращает факториал от заданого инта
    //✅11.принимает инт год, и возвращает тру если год высокосный.Рік вважається високосним, якщо він ділиться на 4.
    // Винятком є роки, які кратні 100 (такі роки є високосними тільки тоді, якщо вони ще діляться на 400).
    //✅12) приминает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
    //✅13) метод принимает массив интов сортирует его по возрастанию
    //✅14) принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
    //✅15) принимает два массива интов одинаковых по длинне, возращает массив интов который состоит из перемноженных елементов входящих массивов
    //🤷‍♂️16) принимает два массива интов, возвращает массив из елементов которые не совпадают в массивах
    //✅17)принимает масив интов, возвращает его же но в реверсном порядке
    //✅️18)принимает 3 инта: -размер выходного массива, -нижняя граница, -верхняя граница
    // возвращает массив интов заданой длинный,который содержит случайные числа от нижней границы до верхней границы"
    //✅19)принимает 2 массива чаров, проверяет есть ли в 1 массиве, такая же последовательность символов которую
    // представляет собой второй массив.Возвращает булеан

}
