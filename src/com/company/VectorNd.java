package com.company;

import java.util.Arrays;

public class VectorNd {

    private int[][] vector;
    private final String info = "Это вектор для N-мерной системы координат: ";

    public VectorNd(int i) {
        this.vector = new int[2][i];
        for (int count = 0; count < i; count++){
            this.vector[0][count] = (int) (Math.random()*100);
            this.vector[1][count] = (int) (Math.random()*100);
        }
    }

    public int[][] getVector() {
        return vector;
    }

    public void setVector(int[][] vector) {
        this.vector = vector;
    }

    @Override
    public String toString() {
        return info + Arrays.deepToString(this.vector);
    }

    public double vectorLength(int i) {
        int mass = 0;
        for (int counter = 0; counter < i; counter++){
            mass += Math.pow(this.vector[1][counter] - this.vector[0][counter],2);
        }
        return Math.sqrt(mass);
    }

    public static double scalarProduct(double vectorLength1, double vectorLength2, double angle) {
        return vectorLength1 * vectorLength2 * Math.cos(angle * Math.PI / 180);
    }

    public static double vectorSum(VectorNd vector1, VectorNd vector2, int size) {
        return vector1.vectorLength(size) + vector2.vectorLength(size);
    }

    public static double vectorSubtraction(VectorNd vector1, VectorNd vector2, int size) {
        return vector1.vectorLength(size) - vector2.vectorLength(size);
    }

    public static int[][][] getMass(int i, int size) {
        int[][][] mass = new int[i][2][size];
        for (int count = 0; count < i; count++) {
            for (int counter = 0; counter < 2; counter++) {
                for (int counter1 = 0; counter1 < size; counter1++) {
                    mass[count][counter][counter1] = (int) (Math.random() * 100);
                }
            }
        }
        return mass;
    }

    public static void vectorCompare(VectorNd vector1, VectorNd vector2, int size) {
        if (vector1.vectorLength(size) > vector2.vectorLength(size)){
            System.out.println("Длина первого вектора больше длины второго вектора");
        }else{
            System.out.println("Длина второго вектора больше длины первого вектора");
        }
    }
}
