package com.test.train.sort;

import com.test.train.util.ListTools;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xuantf
 * @version: 1.0.0
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = ListTools.creatArray();
        ListTools.printBeforeSort(array);
        shellSort(array);
        ListTools.printAfterSort(array);
    }

    private static void shellSort(int[] array) {
        int length = array.length;
        int grap = 1;
        while (grap < length) {
            grap = grap * 3 + 1;
        }
        while (grap > 0) {
            for (int i = grap; i < length; i++) {
                int temp = array[i];
                int j = i - grap;
                while (j >= 0 && array[j] > temp) {
                    array[j + grap] = array[j];
                    j -= grap;
                }
                array[j + grap] = temp;
            }
            grap = (int) Math.floor(grap / 3);
        }
    }
}
