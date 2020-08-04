package com.nihui.huawei;

import java.util.Scanner;

/**
 * @Classname Demo003
 * @Description TODO 字符逆序
 * @Date 2020/7/23 9:40 AM
 * @Created by nihui
 */
public class Demo003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();

        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i]);
        }

    }
}
