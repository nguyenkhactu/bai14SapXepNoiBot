package com.company;

public class BubbleSort {
    static int[] list = {1,4,6,4,5,6,7,8,9};
    public static void bubbleSort(int[]list){
        boolean needNextpass = true;
        for (int k = 1;k < list.length && needNextpass;k++){
            needNextpass = false;
            for (int i = 0;i < list.length - k;i++){
                if (list[i] > list[i + 1]){
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextpass = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}

