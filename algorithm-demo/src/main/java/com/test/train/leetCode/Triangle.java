package com.test.train.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xuantf
 * @version: 1.0.0
 */
public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = triangle(5);
        System.out.println(triangle);
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
                }else {
                    objects.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(objects);

        }
        return result;
    }
}
