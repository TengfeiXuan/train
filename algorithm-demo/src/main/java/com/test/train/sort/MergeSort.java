package com.test.train.sort;

import com.test.train.util.ListTools;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 归并排序（MERGE-SORT）是建立在归并操作上的一种有效的排序算法,该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。
 * 将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为二路归并。
 * 归并排序具体工作原理如下（假设序列共有n个元素）：
 * 将序列每相邻两个数字进行归并操作（merge)，形成floor(n/2+n%2)个序列，排序后每个序列包含两个元素
 * 将上述序列再次归并，形成floor(n/4)个序列，每个序列包含四个元素
 * 重复步骤2，直到所有元素排序完毕
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = ListTools.creatArray();
        ListTools.printArrays("排序前：",array);
        mergeSort(array);
        ListTools.printArrays("排序后：",array);
    }

    private static void mergeSort(int[] array){
        sort(array,0, array.length - 1);
    }
    private static void sort(int[] array, int startIndex, int endIndex){
        if (startIndex >= endIndex) {
            return;
        }
        int mid = (startIndex + endIndex) / 2;
        //二路归并排序里面有两个Sort，多路归并排序里面写多个Sort就可以了
        sort(array, startIndex, mid);
        sort(array, mid + 1, endIndex);
        merge(array, startIndex, mid, endIndex);
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int[] tmp = new int[a.length];
        int r1 = mid + 1;
        int tIndex = left;
        int cIndex=left;
        // 逐个归并
        while(left <= mid && r1 <= right) {
            if (a[left] <= a[r1]) {
                tmp[tIndex++] = a[left++];
            } else {
                tmp[tIndex++] = a[r1++];
            }
        }
        // 将左边剩余的归并
        while (left <=mid) {
            tmp[tIndex++] = a[left++];
        }
        // 将右边剩余的归并
        while ( r1 <= right ) {
            tmp[tIndex++] = a[r1++];
        }
        //从临时数组拷贝到原数组
        while(cIndex<=right){
            a[cIndex]=tmp[cIndex];
            //输出中间归并排序结果
            System.out.print(a[cIndex]+"\t");
            cIndex++;
        }
        System.out.println();
    }
}
