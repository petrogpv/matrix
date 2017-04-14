package com.petro.matrix;


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

        for (int [] arrVertical: arr) {
            stringBuilder.append("{");
            for (int arrHorizontal: arrVertical) {
                stringBuilder.append(arrHorizontal).append(", ");
            }
            stringBuilder.delete(stringBuilder.length()-2, stringBuilder.length());
            stringBuilder.append("}").append(", ");
        }
        stringBuilder.delete(stringBuilder.length()-2, stringBuilder.length());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}