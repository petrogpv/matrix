package com.petro.matrix;

public class Main {

    public static void main(String[] args) {

        Matrix matrix = MatrixFactory.createMatrix(2, 7);
        Matrix matrix2 = MatrixFactory.createMatrix(2, 7);

        System.out.println(matrix.toString());
        System.out.println("+");
        System.out.println(matrix2.toString());
        System.out.println("=");
        System.out.println(Summator.sumMatrices(matrix, matrix2).toString());
    }
}
