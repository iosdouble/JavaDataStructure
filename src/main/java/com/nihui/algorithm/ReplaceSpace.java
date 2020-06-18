package com.nihui.algorithm;

/**
 * @Classname ReplaceSpace
 * @Description TODO
 * @Date 2020/6/17 5:45 PM
 * @Created by nihui
 */
public class ReplaceSpace {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("We Are Happy");

        String s = replaceSpace(str);
        System.out.println(s);
    }

    public static String replaceSpace(StringBuffer str){
        if (str == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")){
                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
