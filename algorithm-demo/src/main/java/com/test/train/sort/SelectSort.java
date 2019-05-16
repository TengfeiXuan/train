package com.test.train.sort;

import com.test.train.util.ListTools;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 重复第二步，直到所有元素均排序完毕。
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = ListTools.creatArray();
        ListTools.printBeforeSort(array);
        selectSort(array);
        ListTools.printAfterSort(array);
    }

    private static void selectSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = min;
            array[minIndex] = tmp;
        }
    }
}
