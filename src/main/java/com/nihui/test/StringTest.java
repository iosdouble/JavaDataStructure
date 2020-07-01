package com.nihui.test;

/**
 * @Classname StringTest
 * @Description TODO
 * @Date 2020/6/30 8:18 PM
 * @Created by nihui
 */
public class StringTest {

//    public static String test(String str){
//
//        for (int i = str.length();i>0;i--){
//            for (int j = 0; j <=str.length()-i; j++) {
//                String sub = str.substring(j,i+j);
//                int count = 0;
//                for (int k = 0; k <sub.length()/2 ; k++) {
//                    // i+i
//                }
//            }
//        }
//        return null;
//    }


//    public static Boolean test(String str) {
//        char[] chars = str.toCharArray();
//        for (int j = 0; j <= str.length()/2; j++) {
//           if (chars[j]!=chars[str.length()-1]){
//               return false;
//           }
//        }
//        return true;
//    }




    public static int test(TreeNode node) {
        if (node==null){
            return 0;
        }

        int left = test(node.left);

        int right = test(node.right);

        if (left>right){
            return left+1;
        }else {
            return right+1;
        }
    }


    public static void main(String[] args) {

    }
}
