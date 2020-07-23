package com.nihui.huawei;

import java.util.Scanner;

/**
 * @Classname Demo001
 * @Description TODO 求解两个数的最小公倍数
 * @Date 2020/7/23 9:11 AM
 * @Created by nihui
 */
public class Demo001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anInt = scanner.nextInt();
        int bnInt = scanner.nextInt();
        int result = result(anInt,bnInt);
        System.out.println(result);

    }

    private static int result(int anInt, int bnInt) {
        int add = anInt*bnInt;
        int z = anInt>bnInt?anInt:bnInt;
        while (z<=add){
            if (z%anInt==0&&z%bnInt==0){
                return z;
            }
            z++;
        }
        return 0;
    }
}
