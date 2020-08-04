package com.nihui.book1.charp01;

import com.nihui.book1.charp01.bean.LNode;

/**
 * @Classname Demo07
 * @Description TODO 如何把链表相邻元素翻转
 * @Date 2020/7/31 4:52 PM
 * @Created by nihui
 */
public class Demo07 {

    /**
     * 把链表相邻元素翻转
     * @param head
     */
    public static void reverse2(LNode head){
        if (head ==null|| head.next ==null){
            return;
        }

        LNode cur = head.next;
        LNode pre = head;
        LNode next = null;
        while (cur!=null&&cur.next!=null){
            next = cur.next.next;
            pre.next = cur.next;
            cur.next.next = cur;
            cur.next = next;
            pre = cur;
            cur = next;
        }
    }

    public static LNode ConstructList(){
        int i = 1;
        LNode head = new LNode();
        head.next = null;
        LNode tmp = null;
        LNode cur = head;
        //构造第一个链表
        for (;i<8;i++){
            tmp = new LNode();
            tmp.data = i;
            tmp.next = null;
            cur.next = tmp;
            cur = tmp;
        }
        return head;
    }

    public static void PrintList(LNode head){
        for (LNode cur = head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data+" ");
        }
    }


    public static void main(String[] args) {
        LNode head = ConstructList();

        System.out.println("顺序输出：");
        PrintList(head);
        reverse2(head);
        System.out.println();
        System.out.println("逆序输出：");
        PrintList(head);
    }
}
