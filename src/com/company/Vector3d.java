package com.company;

import java.util.Arrays;

public class Vector3d {

    private int[] point0 = new int[3];
    private int[] point1 = new int[3];
    private final String info = "Это вектор для трехмерной системы координат: ";

    public Vector3d(int[] point0, int[] point1) {
        this.point0 = point0;
        this.point1 = point1;
    }

    public int[] getPoint0() {
        return point0;
    }

    public void setPoint0(int[] point0) {
        this.point0 = point0;
    }

    public int[] getPoint1() {
        return point1;
    }

    public void setPoint1(int[] point1) {
        this.point1 = point1;
    }

    @Override
    public String toString() {
        return info + "[" + Arrays.toString(point0) + "," + Arrays.toString(point1) + "]";
    }

    public double vectorLength() {
        double point0 = this.point1[0] - this.point0[0];
        double point1 = this.point1[1] - this.point0[1];
        double point2 = this.point1[2] - this.point0[2];
        return Math.sqrt(Math.pow(point0, 2) + Math.pow(point1, 2) + Math.pow(point2, 2));
    }

    public static double scalarProduct(double vectorLength1, double vectorLength2, int angle) {
        double scalarProduct = vectorLength1 * vectorLength2 * Math.cos(angle * Math.PI / 180);
        return scalarProduct;


    }

    public static double vectorSum(Vector3d vector1, Vector3d vector2) {
        return vector1.vectorLength() + vector2.vectorLength();
    }

    public static double vectorSubtraction(Vector3d vector1, Vector3d vector2) {
        return vector1.vectorLength() - vector2.vectorLength();
    }

    public static int[][][] getMass(int i) {
        int[][][] mass = new int[i][2][3];
        for (int count = 0; count < i; count++) {
            for (int counter = 0; counter < 2; counter++) {
                for (int counter1 = 0; counter1 < 3; counter1++) {
                    mass[count][counter][counter1] = (int) (Math.random() * 100);
                }
            }
        }
        return mass;
    }

    public static void vectorCompare(Vector3d vector1, Vector3d vector2) {
        if (vector1.vectorLength() > vector2.vectorLength()){
            System.out.println("Длина первого вектора больше длины второго вектора");
        }else{
            System.out.println("Длина второго вектора больше длины первого вектора");
        }
    }
}
