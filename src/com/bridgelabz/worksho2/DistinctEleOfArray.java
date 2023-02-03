package com.bridgelabz.worksho2;

import java.util.ArrayList;
import java.util.List;

public class DistinctEleOfArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{4, 5, 6, 7, 8};
        boolean contains = false;
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if( arr1[i]==arr2[j]){
                    contains = true;
                    break;
                }
            }
            if(!contains ) {
                list1.add(arr1[i]);

            }else {
                contains = false;

            }
        }
        System.out.println(list1);
    }
}
