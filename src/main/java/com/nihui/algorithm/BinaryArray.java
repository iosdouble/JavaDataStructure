package com.nihui.algorithm;

/**
 * @Classname BinaryArray
 * @Description TODO
 * @Date 2020/6/17 3:17 PM
 * @Created by nihui
 */
public class BinaryArray {
    public static int count = 0;
    public static void main(String[] args) {

        int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(array.length);
        System.out.println(find2(array,2));
    }


    public static boolean find1(int[][] array,int target){
        if (array==null||array.length==0){
            return false;
        }
        if (array.length == 1){
            for (int item:array[0]) {
                if (target==item){
                    return true;
                }
            }
        }

        int row = 0;
        int column = array[0].length-1;

        while (row < array.length && column>=0){
            if (array[row][column] == target){
                return true;
            }
            if (array[row][column]>target){
                column--;
            }else {
                row++;
            }
        }
        return false;
    }


    public static boolean find2(int[][] array,int target){
        if (array==null || array.length==0){
            return false;
        }
        int left = 0;
        int right = array.length * array[0].length-1;
        int col = array[0].length;

        while (left<=right){
            System.out.println(count++);
            int mid = (left+right)/2;
            int value = array[mid/col][mid%col];

            if (value == target){
                return true;
            }else if (value<target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;
    }

}
