package com.nihui.kaoshi;

/**
 * @Classname Main2
 * @Description TODO
 * @Date 2020/7/28 10:10 AM
 * @Created by nihui
 */
public class Main2 {
    public static void main(String[] args) {
        int count = 0;

        int[] ints = find();
        print(ints);
        findPerson(ints,5,3);


    }

    private static void print(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+"\t");
        }
    }

    public static int[] find() {
        int[] ins = new int[200];
        for (int count = 1,j=0; count < 200; count++,j++) {
            if (count % 7 == 0 || String.valueOf(count).contains("7")) {
                ins[j] = count;
            }
        }
        return ins;
    }

    public static void findPerson(int[] ints,int allPerson,int count){
        int k = 0 ;
        int index = 0;
        int counts[] = new int[allPerson];
        int s = 0;
        for (int i = 0; i <ints.length; i++) {
            if (s==allPerson){
                s = 0;
            }
            s++;

            if (ints[i]==0){
                continue;
            }

            if (ints[i]!=0){
                counts[s]++;
                k++;
            }

            if (k==count){
                break;
            }
        }
        System.out.println();
        print(counts);
    }

}
