package com.startjava.leasson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        //1 task
        reverseArrayValues();

        //2 task
        productArrayElements();

        //3 task
        deleteElements();

        //4 task
        ladderArrayReverse();

        //5 task
        generateUniqueNumbers();

        //6 task
        copyNonEmptyStrings();
    }

    private static void reverseArrayValues() {
        System.out.println("1. Реверс значений массива");
        int[] intsArray = {1, 5, 2, 4, 3, 7, 6};
        int length = intsArray.length;

        System.out.println("\nДо модификации\n" + Arrays.toString(intsArray));

        for (int i = 0; i <= length; i++) {
            int temp = intsArray[i];
            length--;
            intsArray[i] = intsArray[length];
            intsArray[length] = temp;
        }

        System.out.println("\nПосле модификации\n" + Arrays.toString(intsArray));
    }

    private static void productArrayElements() {
        System.out.println("\n2. Вывод произведения элементов массива");
        int[] multipliers = new int[10];
        int length = multipliers.length;

        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }

        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= multipliers[i];
            System.out.print(multipliers[i] + (i < length - 2 ? " * " : " = " + result));
        }
        System.out.println("\n" + multipliers[0] + " " + multipliers[9]);
    }

    private static void deleteElements() {
        System.out.println("\n3. Удаление элементов массива");

        Random random = new Random();
        double[] randomNums = new double[15];
        int length = randomNums.length;

        for (int i = 0; i < length; i++) {
            randomNums[i] = random.nextDouble();
        }

        int middleIndex = length / 2;

        System.out.println("Исходный массив:");
        outputNums(randomNums, middleIndex);

        int numZeros = 0;
        double middleCellValue = randomNums[middleIndex];
        System.out.println("\nИзмененный массив:");
        for (int i = 0; i < length; i++) {
            if (randomNums[i] >= middleCellValue) {
                numZeros++;
                randomNums[i] = 0;
            }
        }
        outputNums(randomNums, middleIndex);

        System.out.println("\nКоличество обнуленных ячеек: " + numZeros);
    }

    private static void outputNums(double[] array, int index) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            System.out.printf("%8.3f", array[i]);
            if (i == index) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void ladderArrayReverse() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");

        char[] alphabet = new char[26];
        int length = alphabet.length;

        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    private static void generateUniqueNumbers() {
        System.out.println("\n5. Генерация уникальных чисел");

        int[] uniqueNums = new int[30];
        int length = uniqueNums.length;

        int increasingNum = 0;

        while (increasingNum < length) {
            boolean unique = false;
            int numRandom = (int) (Math.random() * 40) + 60;

            for (int i = 0; i < increasingNum; i++) {
                if (uniqueNums[i] == numRandom) {
                    unique = true;
                    break;
                }
            }

            if (!unique) {
                uniqueNums[increasingNum] = numRandom;
                increasingNum++;
            }
        }

        int count = 1;
        Arrays.sort(uniqueNums);
        for (int i = 0; i < length; i++) {
            System.out.printf("%3d ", uniqueNums[i]);
            count++;
            if (count == 11) {
                System.out.println();
                count = 1;
            }
        }
    }

    private static void copyNonEmptyStrings() {
        System.out.println("\n6. Копирование не пустых строк");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.println(Arrays.toString(srcStrings));

        int count = 0;
        for (String s : srcStrings) {
            if (!s.isBlank()) {
                srcStrings[count++] = s;
            }
        }

        String[] destStrings = new String[count];
        System.arraycopy(srcStrings, 0, destStrings, 0, count);
        System.out.println(Arrays.toString(destStrings));
    }
}

