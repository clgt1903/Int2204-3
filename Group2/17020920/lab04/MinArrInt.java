package com.petehouston.maven.unittestsample;

public class MinArrInt {
    private int[] arr = new int[100];
    private int size=0;

    public void nhap(int n){
        arr[size]=n;
        size++;
    }

    public int Min(){
        int min=arr[0];
        for(int i=1;i<size;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }


}
