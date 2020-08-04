package com.nihui.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Classname Demo006
 * @Description TODO Redraiment走法
 * @Date 2020/7/24 10:23 AM
 * @Created by nihui
 */

//186 13 322 264 328 110 120 73 20 35 240 97 150 221 284 324 46 219 239 284 128 251 298 319 304 36 144 236 163 122
public class Demo006 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int nextInt = scanner.nextInt();
//        int count = 0;
//        int[] pInput = new int[nextInt];
//        while (count<nextInt){
//           pInput[count] = scanner.nextInt();
//           count++;
//        }
        int [] pInput = {186, 13 ,322, 264, 328 ,110, 120, 73, 20, 35, 240, 97, 150, 221, 284 ,324, 46, 219, 239, 284, 128 ,251, 298 ,319 ,304, 36, 144, 236, 163, 122};
//        int[] quchong = quchong(pInput);
        List<Integer> list = new ArrayList<>();
//        solt(quchong,0,quchong.length-1);
        int i = GetResult(pInput.length, pInput, list);
        System.out.println(i);
    }

    public static int GetResult(int num, int[] pInput, List pResult){

        int index = 0;
        int step = 0;
        int temp = pInput[0];
        while (index<num){
            temp = pInput[index];
            for (int i = index+1; i < pInput.length; i++) {
                if (temp<pInput[i]){
                    step++;
                }else {
                    continue;
                }
            }
            index++;
            pResult.add(step);
            step = 0;
        }
        System.out.println(pResult.toString());
        return (int) pResult.get(0);
    }

    public  static  void solt(int[] pInput,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = pInput[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=pInput[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=pInput[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = pInput[j];
                pInput[j] = pInput[i];
                pInput[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        pInput[low] = pInput[i];
        pInput[i] = temp;
        //递归调用左半数组
        solt(pInput, low, j-1);
        //递归调用右半数组
        solt(pInput, j+1, high);
    }

    public static int[]  quchong(int[] str){
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<str.length; i++) {
            if(!list.contains(str[i])) {
                list.add(str[i]);
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
