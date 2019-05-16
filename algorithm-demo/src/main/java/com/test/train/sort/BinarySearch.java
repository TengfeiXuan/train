package com.test.train.sort;

import com.test.train.util.ListTools;

import java.util.stream.IntStream;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[100];
        IntStream.range(1, 100).forEach(i -> array[i - 1] = i);
        ListTools.printArrays("排序前", array);
        System.out.println(binarySearch(array,6,0,array.length-1));
    }

    private static int binarySearch(int[] array, int target, int start, int end) {
        int mid = (end - start)/2 + start;
        if (array[mid] == target) {
            return mid;
        }
        if (start >= end) {
            return -1;
        }
        if (array[mid] < target) {
            return binarySearch(array,target,mid+1,end);
        }
        if (array[mid] > target) {
            return binarySearch(array,target,start,mid-1);
        }
        return -1;
    }
}
