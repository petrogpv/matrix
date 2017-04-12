package com.petro;

public class Main {

    public static void main(String[] args) {
	    Matrix matrix = MatrixFactory.createMatrix(3,3);
        Matrix matrix2 = MatrixFactory.createMatrix(3,3);
        System.out.println(matrix.toString());
        System.out.println(matrix2.toString());
    }
}
