package com.test.train.leetCode;

import com.test.train.sort.QuickSort;
import com.test.train.util.ListTools;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 示例 1:
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素
 */
public class DeleteSortedList {
    public static void main(String[] args) {
        int[] array = ListTools.creatArray();
        QuickSort.quickSort(array, 0, array.length - 1);
        ListTools.printAfterSort(array);
        int delete = delete(array);
        ListTools.printAfterSort(array);
        System.out.println(delete);
    }

    private static int delete(int[] array) {
        int i = 0, j = i + 1;
        int result = 1;
        int length = array.length;
        while (j <= length - 1) {
            if (array[i] != array[j]) {
                result++;
                if (j != i + 1) {
                    int temp = array[i + 1];
                    array[i + 1] = array[j];
                    array[j] = temp;
                }
                i++;
            }
            j++;
        }

        return result;
    }
}
