package com.petro;

public class Main {

    public static void main(String[] args) {

        Matrix matrix = MatrixFactory.createMatrix(7, 7);
        Matrix matrix2 = MatrixFactory.createMatrix(7, 7);

        System.out.println(matrix.toString());
        System.out.println("+");
        System.out.println(matrix2.toString());
        System.out.println("=");
        System.out.println(Summator.sum(matrix, matrix2).toString());
    }
}
