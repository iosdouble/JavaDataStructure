package com.nihui.huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Classname Demo004
 * @Description TODO 记负均正
 * @Date 2020/7/23 9:44 AM
 * @Created by nihui
 */
public class Demo004 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;
        int sum = 0;
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Integer nextInt = scanner.nextInt();
            if (nextInt != null) {
                arrayList.add(nextInt);
            } else {
                break;
            }
        }

        for (Integer item : arrayList) {
            if (item < 0) {
                count++;
            } else if (item >= 0) {
                sum += item;
                index++;
            }
        }
        System.out.println(count);
        String str = String.format("%0.1f", sum / index);
        System.out.println(str);
    }
}
