package com.test.train.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 杨辉三角
 */
public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = triangle(5);
        System.out.println(triangle);
        List<Integer> row = getRow(4);
        System.out.println(row);
    }

    private static List<List<Integer>> triangle(int num) {
        List<List<Integer>> result = new ArrayList<>();
        if (num < 1) {
            return result;
        }
        for (int i = 0; i < num; i++) {
            ArrayList<Integer> objects = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    objects.add(1);
                } else {
                    objects.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(objects);

        }
        return result;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        long index = 1;
        for (int i = 0; i <= rowIndex; i++) {
            res.add((int) index);
            index = index * (rowIndex - i) / (i + 1);
        }
        return res;
    }
}
