package com.test.train.sort;

import com.test.train.util.ListTools;

/**
 * @author: xuantf
 * @version: 1.0.0
 */
public class CountSort {
    public static void main(String[] args) {
        int[] array = ListTools.creatArray();
        ListTools.printBeforeSort(array);
        countSort(array);
        ListTools.printAfterSort(array);
    }

    private static void countSort(int[] array) {
        int length = array.length;
        int max = array[0];
        for (int i = 1; i < length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        int[] ary = new int[max + 1];
        for (int value: array) {
            ary[value]++;
        }
        int j = 0;
        for (int i = 0; i < ary.length; i++) {
            while (ary[i] > 0) {
                array[j] = i;
                j++;
                ary[i]--;
            }
        }
    }
}
