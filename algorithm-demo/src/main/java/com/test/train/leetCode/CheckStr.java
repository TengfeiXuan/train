package com.test.train.leetCode;

import java.util.Stack;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 */
public class CheckStr {
    public static void main(String[] args) {
        System.out.println(check("(){}[]{}"));
    }

    private static boolean check(String str) {
        char[] chars = str.toCharArray();
        Stack stack = new Stack();
        for (char c : chars) {
            if (isLeft(c)) {
                stack.push(c);
            }
            if (stack.empty()) {
                return false;
            }
            if (isRight(c)) {
                char peek = (char) stack.pop();
                if (!is(peek, c)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isLeft(char c) {
        return c == '{' || c == '[' || c == '(';
    }

    private static boolean isRight(char c) {
        return c == '}' || c == ']' || c == ')';
    }

    private static boolean is(char c1, char c2) {
        return (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']') || (c1 == '(' && c2 == ')');
    }
}
