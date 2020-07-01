package com.nihui.test;

/**
 * @Classname Shuixianhua
 * @Description TODO
 * @Date 2020/7/1 11:45 AM
 * @Created by nihui
 */
public class Shuixianhua {
    public static void main(String[] args) {
        int i = 0;
        for (i = 1;i<1000;i++){
            test1(i);
        }
    }

    public static void test(int number){
        int sum = 0;
        int count = number;
        int index = 0;

        while (number%10!=0){
            index = number%10;
            double pow = Math.pow(index, 3);
            sum += pow;
            number/=10;
        }
        if (count == sum){
            System.out.println(count);
        }

    }

    public static void test1(int number){

        int sum = 0;
        String s = String.valueOf(number);
        char[] chars = s.toCharArray();
        for (int i = 0;i<chars.length;i++){
          double index = Math.pow(Double.valueOf(String.valueOf(chars[i])),3);
          sum += index;
        }
        if (sum==number){
            System.out.println(number);
        }

    }


}
