package com.petro;


public class Matrix {
    private int [][] arr;

    public Matrix(int v, int h) {
        arr = new int[v][h];
    }

    public int getElement (int v, int h){
        return arr [v][h];
    }

    public void setElement (int v, int h, int val){
        arr [v][h] = val;
    }

    public int getHorizontalSize(){
        return arr[0].length;
    }
    public int getVerticalSize(){
        return arr.length;
    }

    @Override
    public String toString() {
        String s = "{";
        for (int i = 0;  i< arr.length; i++){
            s += "{";
            for (int j = 0; j < arr[0].length; j++){

                    s+= "" + arr[i][j] + "";
                if (j!= arr[0].length-1){
                    s+=", ";
                }
            }
            s += "}";
            if (i!= arr.length-1){
                s+=", ";
            }
        }
        s += "}";
        return s;
    }
}
