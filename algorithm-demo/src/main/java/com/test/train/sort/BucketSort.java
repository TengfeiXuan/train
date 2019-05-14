package com.test.train.sort;

import com.test.train.util.ListTools;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 桶排序
 * 当要被排序的数组内的数值是均匀分配的时候，桶排序使用线性时间（Θ（n））。但桶排序并不是比较排序，他不受到 O(n log n) 下限的影响。
 * 桶排序的平均时间复杂度为线性的O(N+C)，其中C=N*(logN-logM)。
 * 如果相对于同样的N，桶数量M越大，其效率越高，最好的时间复杂度达到O(N)。当然桶排序的空间复杂度为O(N+M)，
 * 如果输入数据非常庞大，而桶的数量也非常多，则空间代价无疑是昂贵的。此外，桶排序是稳定的。
 */
public class BucketSort {
    public static void main(String[] args) {
        int[] array = ListTools.creatArray();

    }
}
