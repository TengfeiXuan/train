package com.test.train.sort;

import com.test.train.util.ListTools;

import java.util.Arrays;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 插入排序
 * 所谓插入排序法，就是检查第i个数字，如果在它的左边的数字比它大，进行交换，这个动作一直继续下去，
 * 直到这个数字的左边数字比它还要小，就可以停止了。插入排序法主要的回圈有两个变数：i和j，
 * 每一次执行这个回圈，就会将第i个数字放到左边恰当的位置去。
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = ListTools.creatArray();
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array){
        int length = array.length;
        int target;
        int j;
        for (int i = 1; i < length; i++) {
            target = array[i];
            j=i;
            while (j > 0 && target < array[j-1]){
                array[j] = array[j-1];
                j--;
            }
//            for (j=i; j>0 && target < array[j-1]; j--) {
//                array[j] = array[j-1];
//            }
            array[j] = target;
        }
    }
}
