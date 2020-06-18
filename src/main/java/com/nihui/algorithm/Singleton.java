package com.nihui.algorithm;

/**
 * @Classname Singleton
 * @Description TODO
 * @Date 2020/6/17 3:16 PM
 * @Created by nihui
 */
public class Singleton {
    private static class SingletonHodler {
        private static Singleton ourInstance = new Singleton(); }
    public static Singleton getInstance() {
        return SingletonHodler.ourInstance; }
    private Singleton() {
    }
}
