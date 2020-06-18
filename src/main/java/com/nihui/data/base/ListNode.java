package com.nihui.data.base;

/**
 * @Classname ListNode
 * @Description TODO 链表数据结构
 * @Date 2020/6/17 3:10 PM
 * @Created by nihui
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(){

    }

    public void add(int val){
        ListNode node = new ListNode(val);
        if (next == null){
            next = node;
            return;
        }
        ListNode temp = next;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }
}
