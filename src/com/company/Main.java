package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] point21 = {1, 2};
        int[] point22 = {3, 5};
        int[] point23 = {2, 4};
        int[] point31 = {4, 5, 6};
        int[] point32 = {6, 8, 9};
        int[] point33 = {5, 6, 8};
        double angle = 60;
        int size = doubleInputInt("Введите размерность пространства: ");

        Vector2d vector2d = new Vector2d(point21, point22);
        Vector2d vector2d2 = new Vector2d(point21, point23);
        Vector3d vector3d = new Vector3d(point31, point32);
        Vector3d vector3d2 = new Vector3d(point31, point33);
        VectorNd vectorNd = new VectorNd(size);
        VectorNd vectorNd2 = new VectorNd(size);

        //Расчёт длины вектора
        System.out.println(vector2d);
        System.out.println("Длина вектора: " + vector2d.vectorLength());
        System.out.println("\n" + vector2d2);
        System.out.println("Длина вектора: " + vector2d2.vectorLength());
        System.out.println("\n" + vector3d);
        System.out.println("Длина вектора: " + vector3d.vectorLength());
        System.out.println("\n" + vector3d2);
        System.out.println("Длина вектора: " + vector3d2.vectorLength());
        System.out.println("\n" + vectorNd);
        System.out.println("Длина вектора: " + vectorNd.vectorLength(size));
        System.out.println("\n" + vectorNd);
        System.out.println("Длина вектора: " + vectorNd2.vectorLength(size));
        System.out.println("\n");

        //Расчёт скалярного произведения векторов
        System.out.println("Скалярное произведение двумерных векторов: " +
                Vector2d.scalarProduct(vector2d.vectorLength(), vector2d2.vectorLength(), angle));
        System.out.println("Скалярное произведение трехмерных векторов: " +
                Vector2d.scalarProduct(vector3d.vectorLength(), vector3d2.vectorLength(), angle));
        System.out.println("Скалярное произведение N-мерных векторов: " +
                Vector2d.scalarProduct(vectorNd.vectorLength(size), vectorNd2.vectorLength(size), angle));
        System.out.println("\n");

        //Расчёт суммы векторов
        System.out.println("Сумма двумерных векторов: " + Vector2d.vectorSum(vector2d, vector2d2));
        System.out.println("Сумма трехмерных векторов: " + Vector3d.vectorSum(vector3d, vector3d2));
        System.out.println("Сумма N-мерных векторов: " + VectorNd.vectorSum(vectorNd, vectorNd2, size));
        System.out.println("\n");

        //Расчёт разницы векторов
        System.out.println("Разница двумерных векторов: " + Vector2d.vectorSubtraction(vector2d, vector2d2));
        System.out.println("Разница трехмерных векторов: " + Vector3d.vectorSubtraction(vector3d, vector3d2));
        System.out.println("Разница N-мерных векторов: " + VectorNd.vectorSubtraction(vectorNd, vectorNd2, size));
        System.out.println("\n");

        //Создание массива векторов
        int i = doubleInputInt("Введите количество векторов: ");
        int[][][] mass2d = Vector2d.getMass(i);
        int[][][] mass3d = Vector3d.getMass(i);
        int[][][] massNd = VectorNd.getMass(i, size);
        for (int counter = 0; counter < i; counter++) {
            System.out.println(counter + 1 + "-й вектор двумерной системы координат: " + Arrays.deepToString(mass2d[counter]));
        }
        System.out.println("\n");
        for (int counter = 0; counter < i; counter++) {
            System.out.println(counter + 1 + "-й вектор трехмерной системы координат: " + Arrays.deepToString(mass3d[counter]));
        }
        System.out.println("\n");
        for (int counter = 0; counter < i; counter++) {
            System.out.println(counter + 1 + "-й вектор N-мерной системы координат: " + Arrays.deepToString(massNd[counter]));
        }
        System.out.println("\n");

        //Сравнение векторов
        Vector2d.vectorCompare(vector2d, vector2d2);
        Vector3d.vectorCompare(vector3d, vector3d2);
        VectorNd.vectorCompare(vectorNd, vectorNd2, size);
    }

    public static int doubleInputInt(String condition) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print(condition);
        while (!sc.hasNextInt()) {
            System.out.print(condition);
            sc = new Scanner(System.in);
        }
        number = sc.nextInt();
        return (number);
    }
}
