package com.nihui.algorithm;

import com.nihui.data.base.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Classname PrintLinkList
 * @Description TODO
 * @Date 2020/6/17 5:49 PM
 * @Created by nihui
 */
public class PrintLinkList {
    public static void main(String[] args) {

        ListNode listNode = new ListNode();

        listNode.add(1);
        listNode.add(2);
        listNode.add(3);
        listNode.add(4);



//        ArrayList<Integer> integers = printListFromTailToHead(listNode);
        ArrayList<Integer> integers = printListReverse2(listNode);
        for (Integer item: integers) {
            System.out.print(item);
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            list.add(stack.pop().val);
        }
        return list;
    }


    public static ArrayList<Integer> printListReverse2(ListNode headNode){
        ArrayList<Integer> list = new ArrayList<>();
        if (headNode!= null){
            if (headNode.next != null){
                list = printListReverse2(headNode.next);
            }
            list.add(headNode.val);
        }
        return list;
    }
}
