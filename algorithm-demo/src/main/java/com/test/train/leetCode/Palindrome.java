package com.test.train.leetCode;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 判断字符串是否是回文
 */
public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
    }

    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (!Character.isLetterOrDigit(str.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(str.charAt(end))) {
                end--;
            } else {
                if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
