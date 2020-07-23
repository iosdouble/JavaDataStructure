package com.nihui.huawei;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Classname Demo002
 * @Description TODO 求解立方根
 * @Date 2020/7/23 9:25 AM
 * @Created by nihui
 */
public class Demo002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();
        System.out.println(getCubeRoot(v));
    }

    // x^3 = n
    // x^3 - n = 0;
    public static double getCubeRoot(double num){

        if (num == 0) {
            return num;
        }

        double num1,num2;
        num1 = num;
        num2 = (2*num1/3)+(num/(num1*num1*3));//利用牛顿迭代法求解

        while(Math.abs(num2-num1)>0.000001){
            num1=num2;
            num2=(2*num1/3)+(num/(num1*num1*3));
        }
        DecimalFormat df = new DecimalFormat("#.0");
        return Double.parseDouble(df.format(num2));
    }
}
