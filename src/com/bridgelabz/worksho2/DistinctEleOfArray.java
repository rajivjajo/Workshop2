package com.bridgelabz.worksho2;

import java.util.*;

public class DistinctEleOfArray {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        Set<Integer> union = new HashSet<>(list1);
        union.addAll(list2);

        Set<Integer> intersection = new HashSet<>(list1);
        intersection.retainAll(list2);
        union.removeAll(intersection);
        for (Integer n : union) {
            System.out.println(n);
        }
    }
}