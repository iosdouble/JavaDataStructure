package com.nihui.book1.charp01;

import com.nihui.book1.charp01.bean.LNode;

/**
 * @Classname Demo10
 * @Description TODO 如何在只给定单链表中某个结点的指针情况下删除该节点
 * @Date 2020/9/5 9:14 AM
 * @Created by nihui
 * @Version 1.0
 * @Description Demo10 @see JavaDataStructure
 */
public class Demo10 {

    public static void printList(LNode head){
        for (LNode cur = head.next;cur!=null;cur = cur.next){
            System.out.print(cur.data+" ");
        }
    }

    public static boolean RemoveNode(LNode p){
        // 如果节点为空 ，或者节点无后继节点，则无法删除

        if (p == null || p.next == null){
            return false;
        }

        p.data = p.next.data;
        LNode tmp = p.next;
        p.next = tmp.next;
        return true;
    }


    public static void main(String[] args) {
        int i = 1;
        LNode head = new LNode();
        head.next = null;
        LNode tmp = null;
        LNode cur = head;
        LNode p = null;
        for (; i < 8; i++) {
            tmp = new LNode();
            tmp.data = i;
            tmp.next = null;
            cur.next = tmp;
            cur = tmp;
            if (i==5){
                p = tmp;
            }
        }
        System.out.print("删除节点"+p.data+"前链表");
        printList(head);
        boolean result = RemoveNode(p);
        System.out.println();
        if (result){
            System.out.print("删除节点后 链表：");
            printList(head);
        }
    }

}
