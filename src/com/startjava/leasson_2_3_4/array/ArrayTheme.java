package com.startjava.leasson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        //1 task
        reversArray();

        //2 task
        workArray();

        //3 task
        deleteElement();

        //4 task
        ladderArray();

        //5 task
        generationUniqueNumber();

        //6 task
        copyLines();
    }

    public static void reversArray() {
        System.out.println("1. Реверс значений массива");
        int[] reverse = {1, 5, 2, 4, 3, 7, 6};

        System.out.println("До реверса");
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }

        System.out.println("\nПосле реверса");
        for (int i = reverse.length - 1; i >= 0; i--) {
            System.out.print(reverse[i] + " ");
        }
    }

    public static void workArray() {
        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] works = new int[10];
        works[0] = 0;
        works[1] = 1;
        works[2] = 2;
        works[3] = 3;
        works[4] = 4;
        works[5] = 5;
        works[6] = 6;
        works[7] = 7;
        works[8] = 8;
        works[9] = 9;
        int result = 1;
        for (int i = 1; i < works.length - 1; i++) {
            works[i] = i;
            result *= works[i];
            System.out.print(works[i] + (i < works.length - 2 ? "*" : "=" + result));
        }
        System.out.println("\n" + works[0] + " " + works[9]);
    }

    public static void deleteElement() {
        System.out.println("\n3. Удаление элементов массива");

        Random random = new Random();

        double[] deleteArray = new double[15];
        for (int i = 0; i < deleteArray.length; i++) {
            deleteArray[i] = random.nextDouble();
        }

        for (int i = 0; i < deleteArray.length - 8; i++) {
            System.out.printf("%10.3f", deleteArray[i]);
        }
        System.out.println();
        int middleIndex = deleteArray.length / 2;
        for (int i = 7; i < deleteArray.length; i++) {
            deleteArray[i] = 0;
            System.out.printf("%10.3f", deleteArray[i]);
        }
    }

    public static void ladderArray() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");

        char[] letters = new char[26];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ('A' + i);
        }

        for (int i = letters.length - 1; i >= 0; i--) {
            for (int j = letters.length - 1; j >= i; j--) {
                System.out.print(letters[j] + " ");
            }
            System.out.println();
        }
    }

    public static void generationUniqueNumber() {
        System.out.println("\n5. Генерация уникальных чисел");

        int[] randomArray = new int[30];
        int endRange = 0;

        while (endRange < 30) {
            boolean alreadyExists = false;
            int numRandom = (int) (Math.random() * 40) + 60;

            for (int i = 0; i < endRange; i++) {
                if (randomArray[i] == numRandom) {
                    alreadyExists = true;
                    break;
                }
            }

            if (!alreadyExists) {
                randomArray[endRange] = numRandom;
                endRange++;
            }
        }

        int count = 1;
        Arrays.sort(randomArray);
        for (int i = 0; i < randomArray.length; i++) {
            System.out.printf("%3d ", randomArray[i]);
            count++;
            if (count == 11) {
                System.out.println();
                count = 1;
            }
        }
    }

    public static void copyLines() {
        System.out.println("\n6. Копирование не пустых строк");
        String[] linesArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.println(Arrays.toString(linesArray));
        String[] copyArray = new String[linesArray.length];
        int count = 0;

        //TODO: в 147 строке какую запись лучше использовать?
        // "s.strip().length() > 0" или "!s.isBlank"?
        for (String s : linesArray) {
            if (!s.isBlank()) {
                copyArray[count++] = s;
            }
        }

        String[] result = new String[copyArray.length];
        System.arraycopy(copyArray, 0, result, 0, count);
        System.out.println(Arrays.toString(result));
    }
}

