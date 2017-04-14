package com.petro.matrix;

public class Main {

    private static Matrix matrix;
    private static Matrix matrix2;
    private int i;
    private int r;

    public static void main(String[] args) {

        matrix = MatrixFactory.createMatrix(2, 7);
        matrix2 = MatrixFactory.createMatrix(2, 7);

        System.out.println(matrix.toString());
        System.out.println("+");
        System.out.println(matrix2.toString());
        System.out.println("=");
        System.out.println(Summator.sumMatrices(matrix, matrix2).toString());

    }
}
