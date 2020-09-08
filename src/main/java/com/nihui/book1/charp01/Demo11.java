package com.nihui.book1.charp01;

import com.nihui.book1.charp01.bean.LNode;

/**
 * @Classname Demo11
 * @Description TODO 如何判断两个单链表（无环）是否交叉
 * @Date 2020/9/8 10:05 AM
 * @Created by nihui
 * @Version 1.0
 * @Description Demo11 @see JavaDataStructure
 */
public class Demo11 {

    public static LNode IsIntersect(LNode head1,LNode head2){
        if (head1==null||head1.next==null||head2==null|head2.next==null||head1==head2){
            return null;
        }
        LNode temp1 = head1.next;
        LNode temp2 = head2.next;

        int n1 = 0,n2 = 0;
        //遍历 head1 ,找到尾节点，同时记录head1 的长度
        while (temp1.next!=null){
            temp1 = temp1.next;
            ++n1;
        }
        //遍历 head2 ，找到尾节点，同时记录head2 的长度
        while (temp2.next!=null){
            temp2 = temp2.next;
            ++n2;
        }
        // 判断head1 和 head2 是否有相同的尾节点
        if (temp1== temp2){
            //长度较长的链表先进行
            if (n1>n2){
                while (n1-n2>0){
                    head1 = head1.next;
                    --n1;
                }
            }
            if (n2>n1){
                while (n2-n1>0){
                    head2 = head2.next;
                    --n2;
                }
            }

            while (head1!=head2){
                head1 = head1.next;
                head2 = head2.next;
            }
            return head1;
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        int i = 1;
        LNode head1 = new LNode();
        head1.next = null;
        LNode head2 = new LNode();
        head2.next = null;

        LNode tmp = null;
        LNode cur = head1;
        LNode p = null;
        for (;i<8;i++){
            tmp = new LNode();
            tmp.data = i;
            tmp.next = null;
            cur.next = tmp;
            cur = tmp;
            if (i==5){
                p = tmp;
            }

        }

        cur = head2;
        for (i=1;i<5;i++){
            tmp = new LNode();
            tmp.data = i;
            tmp.next = null;
            cur.next = tmp;
            cur = tmp;
        }

        cur.next = p;
        LNode interNode = IsIntersect(head1,head2);
        if (interNode==null){
            System.out.println("两个链表不相交");
        }else {
            System.out.println("相交节点为" + interNode.data);
        }
    }
}
