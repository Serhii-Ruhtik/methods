package com.gavrilyuk.twentymethods;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TwentyMethodsApplication {

    public static void main(String[] args) {
        //1 робила Анастасія
        char[] testArray = {'A', 'B', 'C'};
        charArray(testArray);

        //2
        int[] arrayTaskSecond = {1, 2, 3, 4, 5};
        intToChar(arrayTaskSecond);


        //3✅
        int a = 50;
        int b = 20;
        System.out.println("Task 3 " + max(a, b));

        //4✅
        int x = 30;
        int y = 400;
        int c = 50;
        System.out.println("Task 4 " + max(x, y, c));

        //5✅
        int one = 60;
        int two = 70;
        int three = 800;
        int four = 90;
        int five = 100;
        System.out.println("Task 5 = " + max(one, two, three, four, five));

        //6✅
        char[] string = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        System.out.println("Task 6 = " + charToString(string));

        //8✅
        int[] array8 = {10, 20, 60, 40, 50, 80, 30, 90};
        int num8 = 40;
        System.out.println("Task 8 = " + indexOf(array8, num8));

        //9✅
        int[] array9 = {10, 20, 60, 40, 50, 80, 30, 90};
        int num9 = 20;
        System.out.println("Task 9 = " + lastIndexOf(array9, num9));


        //10✅
        int n = 5;
        System.out.println("Task 10 = " + factorialNumber(n));

        //11✅
        int year = 2025;
        System.out.println("Task 11 = " + year + " " + isLeapYear(year));

        //12✅
        int[] array12 = {10, 20, 60, 40, 50, 80, 30, 90};
        int num12 = 3;
        multiplesNum(array12, num12);

        //13✅
        int[] arrayForSort = {60, 20, 10, 40, 30, 50};
        System.out.println("Task 13 = " + Arrays.toString(sort(arrayForSort)));

        //14
        byte[] array14 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Task 14 = " + byteArray(array14));

        //15✅
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {2, 3, 4, 5, 6};
        System.out.println("Task 15 = " + Arrays.toString(multiplyArray(array1, array2)));

        //16✅
        int[] firstArray = {7, 2, 3, 8, 5, 9};
        int[] secondArray = {1, 2, 3, 4, 5, 6};
        System.out.println("Task 16 = " + Arrays.toString(notSimilar(firstArray, secondArray)));

        // 17✅
        int[] array17 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Task 17 = " + Arrays.toString(reversArray(array17)));

        //18✅
        int sizeArray = 10;
        int minLimit = 2;
        int maxLimit = 8;
        randomArrayInt(sizeArray, minLimit, maxLimit);
        System.out.println("Tack 18 = " + Arrays.toString(randomArrayInt(sizeArray, minLimit, maxLimit)));

        //19
        char[] string1 = {'H', 'e', 'l', 'l', 'o'};
        char[] string2 = { 'e', 'l', 'l', };
        System.out.println("Task 19 " + checkArraySimilarity(string1, string2));
    }



    static void charArray(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    //   ✅ Task 2
    static char[] intToChar(int [] array) {
        char[] arrayChar = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayChar[i] = (char) array[i];
        }
        System.out.println(arrayChar);
        return arrayChar;
    }

    //  ✅ Task 3
    static int max(int a, int b) {
        return a > b ? a : b;
    }

    //  ✅ Task 4
    static int max(int x, int y, int c) {
        return max(x, y) > c ? max(x, y) : c;
    }

    //  ✅ Task 5
    static int max(int one, int two, int three, int four, int five) {
        return max(one, two) > max(three, four, five) ? max(one, two) : max(three, four, five);
    }

    //  ✅ Task 6
    static String charToString(char[] array) {
        String result = "";
        for (char c : array) {
            result += c;
        }
        return result;
    }

    //  ✅ Task 8
    static int indexOf(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
               return i;
            }
        }
        return  -1;
    }

    //  ✅ Task 9
    static int lastIndexOf(int[] array, int value) {

        for (int i = array.length - 1; i >= 0 ; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //  ✅ Task 10
    static int factorialNumber(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;

        }
        return result;
    }

    //  ✅ Task 11
    static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 400 == 0 || year % 100 != 0);
    }

    //  ✅ Task 12
    static void multiplesNum(int[] array, int value) {
        System.out.print("Task 12 = ");
        int mulNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % value == 0) {
                mulNum = array[i];
                System.out.print( mulNum + " ");
            }
        }
        System.out.println();
    }

    //  ✅ Task 13
    static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int value = array[i];
                    array[i] = array[j];
                    array[j] = value;
                }
            }
        }
        return array;
    }

    //  🛠 Task 14 ✅принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
    static boolean byteArray(byte[] array14) {

        for (int i = 0; i < array14.length - 1; i++) {
            for (int j = i + 1; j < array14.length; j++) {
                if (array14[i] == array14[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //  ✅ Task 15
    static int [] multiplyArray(int[] arrayOne, int[] arrayTwo) {
        int[] result = new int[arrayOne.length];
        for (int i = 0; i < arrayOne.length; i++) {
            result[i] = arrayOne[i] * arrayTwo[i];
        }
        return result;

    }

    //  ✅ Task 16
    static int [] notSimilar(int[] firstArray, int[] secondArray) {
        int[] resultSimilar = new int[firstArray.length + secondArray.length];
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                resultSimilar[count] = firstArray[i];
                count++;
            }
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                resultSimilar[count] = secondArray[i];
                count++;
            }
        }
        int [] resultArray = new int[count];
        for (int i = 0; i < count; i++) {
            resultArray[i] = resultSimilar[i];
        }
        return resultArray;

    }

    //  ✅ Task 17
    static int[] reversArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    //  ✅ Task 18
    static int [] randomArrayInt(int sizeArray, int minLimit, int maxLimit) {
        int[] randomArray = new int[sizeArray];
        for (int i = 0; i < randomArray.length; i++) {
            int valueRandom = (int) (Math.random() * (maxLimit - minLimit + 1) + minLimit);
            randomArray[i] = valueRandom;
        }
        return randomArray;
    }

    //  🛠 Task 19
    static boolean checkArraySimilarity(char[] string1, char[] string2) {
        boolean arraySimilar = false;
        int couter = 0;

        for (int i = 0; i < string1.length; i++) {
            if (string1[i] == string2[couter]) {
                couter++;
            }else {
                couter = 0;
            }
            if (couter == string2.length) {
                return arraySimilar = true;
            }
        }
    return arraySimilar;

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
    //✅️16) принимает два массива интов, возвращает массив из елементов которые не совпадают в массивах
    //✅17)принимает масив интов, возвращает его же но в реверсном порядке
    //✅️18)принимает 3 инта: -размер выходного массива, -нижняя граница, -верхняя граница
    // возвращает массив интов заданой длинный,который содержит случайные числа от нижней границы до верхней границы"
    //✅19)принимает 2 массива чаров, проверяет есть ли в 1 массиве, такая же последовательность символов которую
    // представляет собой второй массив.Возвращает булеан

}
