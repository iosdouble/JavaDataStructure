package com.nihui.kaoshi;

import java.util.Scanner;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/7/28 9:20 AM
 * @Created by nihui
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String string = scanner.nextLine();

        String s = find(string);
        int abc = findString(nextLine, s);
        System.out.println(abc);

    }

    public static int findString(String source,String tag){
        int i = source.indexOf(tag);
        if (i>=0){
            return i;
        }else {
            return 0;
        }
    }

    public static String find(String tag){
        char[] chars = tag.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='['){
                for (int j = i+1; j < chars.length; j++) {
                    if (chars[j]==']'){
                        return stringBuilder.toString();
                    }
                    stringBuilder.append(chars[j]);
                }

            }
        }
        return null;
    }

    public static String changString(String source,int index,String tag){
        char[] chars = source.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < source.length(); ++i) {

            if (i==index){
                builder.append('[');
            }
            builder.append(chars[i]);

            if (i==index+tag.length()-1){
                builder.append(']');
            }
        }
        if (source.length()==(index+tag.length())){
            builder.append(']');
        }
        return builder.toString();
    }

}
