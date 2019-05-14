package com.test.train.sort;

import com.test.train.util.ListTools;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = ListTools.creatArray();
        ListTools.printArrays("排序前：", array);
        quickSort(array, 0, array.length - 1);
        ListTools.printArrays("排序后：", array);
    }

    public static void quickSort(int[] array, int start, int end) {
        int low = start;
        int height = end;
        if (low >= height) {
            return;
        }
        int i1 = array[low];
        while (low < height) {
            while (low < height && array[height] >= i1) {
                height--;
            }
            if (low < height) {
                int temp = array[low];
                array[low] = array[height];
                array[height] = temp;
                low++;
            }
            while (low < height && i1 >= array[low]) {
                low++;
            }
            if (low < height) {
                int temp = array[low];
                array[low] = array[height];
                array[height] = temp;
                height--;
            }
        }
        if (low > start) {
            quickSort(array, start, low);
        }
        if (low < end) {
            quickSort(array, low + 1, end);
        }
    }
}
