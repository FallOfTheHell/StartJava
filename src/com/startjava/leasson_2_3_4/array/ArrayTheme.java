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
        generationUniqueNumbers();

        //6 task
        copyNonEmptyStrings();
    }

    private static void reverseArrayValues() {
        System.out.println("1. Реверс значений массива");
        int[] arrayNum = {1, 5, 2, 4, 3, 7, 6};

        System.out.println("\nДо модификации");
        for (int i = arrayNum.length - 1; i >= 0; i--) {
            System.out.print(arrayNum[i] + " ");
        }

        System.out.println("\nПосле модификации");
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + " ");
        }
    }

    private static void productArrayElements() {
        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] productArray = new int[10];

        for (int i = 0; i < productArray.length; i++) {
            productArray[i] = i;
        }

        int result = 1;
        for (int i = 1; i < productArray.length - 1;i++) {
            productArray[i] = i;
            result *= productArray[i];
            System.out.print(productArray[i] + (i < 8 ? " * " : " = " + result));
        }
        System.out.println("\n" + productArray[0] + " " + productArray[9]);
    }

    private static void deleteElements() {
        System.out.println("\n3. Удаление элементов массива");

        Random random = new Random();

        double[] array = new double[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble();
        }

        int middleIndex = array.length / 2;

        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%8.3f", array[i]);
            if (i == middleIndex) {
                System.out.println();
            }
        }
        System.out.println();

        int numZeros = 0;

        System.out.println("\nИзмененный массив:");
        for (int i = 0; i < array.length; i++) {
            if (i <= middleIndex) {
                System.out.printf("%8.3f", array[i]);
            }else {
                numZeros++;
                array[i] = 0;
                System.out.printf("%8.3f", array[i]);
            }
            if (i == middleIndex){
                System.out.println();
            }
        }

        System.out.println("\nКоличество обнуленных ячеек: " + numZeros);
    }

    private static void ladderArrayReverse() {
        System.out.println("\n\n4. Вывод элементов массива лесенкой в обратном порядке");

        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (int i = alphabet.length - 1; i >= 0; i--) {
            for (int j = alphabet.length - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    private static void generationUniqueNumbers() {
        System.out.println("\n5. Генерация уникальных чисел");

        int[] uniqueNum = new int[30];
        int endRange = 0;

        while (endRange < uniqueNum.length) {
            boolean unique = false;
            int numRandom = (int) (Math.random() * 40) + 60;

            for (int i = 0; i < endRange; i++) {
                if (uniqueNum[i] == numRandom) {
                    unique = true;
                    break;
                }
            }

            if (!unique) {
                uniqueNum[endRange] = numRandom;
                endRange++;
            }
        }

        int count = 1;
        Arrays.sort(uniqueNum);
        for (int i = 0; i < uniqueNum.length; i++) {
            System.out.printf("%3d ", uniqueNum[i]);
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

        String[] destStrings = new String[srcStrings.length];
        System.arraycopy(srcStrings, 0, destStrings, 0, count);
        System.out.println(Arrays.toString(destStrings));
    }
}

