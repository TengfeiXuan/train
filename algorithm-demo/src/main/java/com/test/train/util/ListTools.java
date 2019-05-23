package com.test.train.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author: xuantf
 * @version: 1.0.0
 */
public class ListTools {

    public static List<Integer> creatList(){
        List<Integer> result = new ArrayList<>(25);
        IntStream.range(1,30).forEach(i -> result.add(i + new Random().nextInt(50)));
        return result;
    }

    public static int[] creatArray(){
        int[] result = new int[30];
        IntStream.range(1,30).forEach(i -> result[i-1] = i + new Random().nextInt(50));
        return result;
    }

    public static void printArrays(String str,int[] array){
        System.out.println(str + Arrays.toString(array));
    }

    public static void printBeforeSort(int[] array){
        printArrays("排序前：",array);
    }

    public static void printAfterSort(int[] array){
        printArrays("排序后：",array);
    }

}
