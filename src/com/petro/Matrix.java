package com.petro;


public class Matrix {
    private int[][] arr;

    public Matrix(int v, int h) {
        arr = new int[v][h];
    }

    public int getElement(int v, int h) {
        return arr[v][h];
    }

    public void setElement(int v, int h, int val) {
        arr[v][h] = val;
    }

    public int getHorizontalSize() {
        return arr[0].length;
    }

    public int getVerticalSize() {
        return arr.length;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");

        for (int i = 0; i < getVerticalSize(); i++) {
            stringBuilder.append("{");
            for (int j = 0; j < getHorizontalSize(); j++) {
                stringBuilder.append(getElement(i, j));
                if (j != getHorizontalSize() - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("}");
            if (i != getVerticalSize() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}
