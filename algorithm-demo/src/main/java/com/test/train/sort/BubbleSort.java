package com.test.train.sort;

import com.test.train.util.ListTools;

import java.util.Arrays;
import java.util.List;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> list = ListTools.creatList();
        System.out.println("list:" + list);
        bubbleSort(list);
        System.out.println("sorted list:" + list);
        int[] array = ListTools.creatArray();
        System.out.println("array:" + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("sorted array:" + Arrays.toString(array));
        twoBubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }

    /**
     * 冒泡排序
     * @param array
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                int temp = array[i];
                if ( temp > array[j]) {
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * 双端起泡排序，每次循环找最大值和最小值，并将最小值放在起始位置，最大值在末尾，
     * 然后缩小范围寻找剩余位置的最大值和最小值 O(n²)
     * @param array
     */
    public static void twoBubbleSort(int[] array) {
        System.out.println(Arrays.toString(array));
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int initIndex = i;
            int lastIndex = length - i - 1;
            int min = array[initIndex];
            int max = array[lastIndex];
            int minIndex = initIndex;
            int maxIndex = lastIndex;
            for (int j = initIndex + 1; j <= lastIndex; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
                if (array[j] > max) {
                    max = array[j];
                    maxIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = min;
            array[maxIndex] = array[lastIndex];
            array[lastIndex] = max;
        }
    }
}
