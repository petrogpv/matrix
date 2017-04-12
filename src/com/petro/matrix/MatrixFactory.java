package com.petro.matrix;


public class MatrixFactory {
    public static Matrix createMatrix(int v, int h) {
        Matrix matrix = new Matrix(v, h);

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                matrix.setElement(i, j, (int) (Math.random() * 10));
            }
        }
        return matrix;
    }


}
