package com.test.train.leetCode;

import com.test.train.util.ListTools;

/**
 * @author: xuantf
 * @version: 1.0.0
 */
public class ColorSort {
    public static void main(String[] args) {
        int[] array = {2, 0, 2, 1, 1, 0};
        ListTools.printAfterSort(colorSort(array));
    }

    private static int[] colorSort(int[] array) {
        int length = array.length;
        int left = -1;
        for (int i = 0; i < length;) {
            if (array[i] == 1) {
                i++;
            }else if (array[i] == 2) {
                length--;
                change(array, i, length);
            }else {
                left++;
                change(array, i, left);
                i++;
            }
        }
        return array;
    }

    private static void change(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
