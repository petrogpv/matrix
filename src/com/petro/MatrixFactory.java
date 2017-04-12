package com.petro;


public class MatrixFactory {
    public static Matrix createMatrix(int v, int h) {
        Matrix matrix = new Matrix(v,h);

        for (int i = 0; i < matrix.getVerticalSize(); i++){
            for (int j = 0; j < matrix.getHorizontalSize(); j++){
                matrix.setElement(i,j,(int)(Math.random()*10));
            }
        }
        return matrix;
    }


}
