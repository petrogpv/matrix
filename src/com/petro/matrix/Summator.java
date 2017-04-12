package com.petro.matrix;

public class Summator {
    public static Matrix sum(Matrix firstMatrix, Matrix secondMatrix) {
        if (firstMatrix.getVerticalSize() != secondMatrix.getVerticalSize()
                || firstMatrix.getHorizontalSize() != secondMatrix.getHorizontalSize()) {
            throw new ArithmeticException("Structural constraint: matrices have different size. Calculation impossible.");
        }

        Matrix resultMatrix = MatrixFactory.createMatrix(firstMatrix.getVerticalSize(),
                firstMatrix.getHorizontalSize());
        int elementsSum;

        for (int i = 0; i < resultMatrix.getVerticalSize(); i++) {
            for (int j = 0; j < resultMatrix.getHorizontalSize(); j++) {
                elementsSum = firstMatrix.getElement(i, j) + secondMatrix.getElement(i, j);
                resultMatrix.setElement(i, j, elementsSum);
            }
        }
        return resultMatrix;
    }
}
