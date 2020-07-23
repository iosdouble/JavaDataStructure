package com.nihui;

import java.util.HashMap;
import java.util.UUID;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/6/17 7:04 PM
 * @Created by nihui
 */
public class Test {

    private static int hash = 0;
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
    public static void main(String[] args) {
//        Object key = 10;
//        int h = (key.hashCode());
//        System.out.println(h);
//
//        int h1 = h^ (h >>> 16);
//        System.out.println(h >>> 16);
//        System.out.println(h1);

//        System.out.println(10&12);
//        int hash = hash(10);
//        System.out.println(hash);

//        -XX:+PrintGCDetails
//        HashMap<Integer,Object> hashMap = new HashMap<>();
//        int count = 1;
//        while (count<100){
//            byte[] bytes = new byte[1024*1024*1024];
//            hashMap.put(count++,count++);
//        }
//        System.out.println(hashMap.size());


        String s ="Ea";

        String d ="FB";

//        System.out.println(s.hashCode());
//
//        System.out.println(d.hashCode());
//
//        char value[] = "Ea".toCharArray();
//
//        char value2[] = "FB".toCharArray();
//
//        System.out.println((int)value[0]+" "+(int)value[1]);
//
//        System.out.println((int)value2[0]+" "+(int)value2[1]);
//
//        System.out.println(31*69+97);
//
//        System.out.println(31*70+66);

//
//        HashMap<String,Integer> hashMap= new HashMap<>();
//        hashMap.put(s,1);
//        hashMap.put(d,2);
//        System.out.println(hashMap.size());

//        HashMap<Object,Object> hashMap = new HashMap<>();
//        for (int i = 0; i <10000000 ; i++) {
//            String str = "s"+i;
//            int hash = hash(str);
//            System.out.println("操作前的："+str.hashCode());
//            System.out.println("操作后的: "+ hash);
//
//            hashMap.put(str,i);
//
//        }
//        System.out.println(hashMap.size());
        HashMap<String,Integer> hashMap= new HashMap<>();
        for (int i = 0; i < 100000000 ; i++) {
            String s1 = generateShortUUID();
            String s2 = generateShortUUID();
            int hash1 = hashCode(s1.toCharArray());
            int hash2 = hashCode(s2.toCharArray());
            if (hash1 == hash2) {
                hashMap.put(s1, 1);
            }
        }
        System.out.println(hashMap.size());
    }
    public static int  hashCode(char[] value) {
        int h = hash;
        if (h == 0 && value.length > 0) {
            char val[] = value;

            for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
            }
            hash = h;
        }
        return h;
    }
    public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z" };
    public static String generateShortUUID() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();
    }


}
