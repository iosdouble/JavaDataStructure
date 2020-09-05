package com.nihui.book1.charp01;

/**
 * @Classname Demo09
 * @Description TODO 如何合并两个有序链表
 * @Date 2020/8/2 8:52 PM
 * @Created by nihui
 */

import com.nihui.book1.charp01.bean.LNode;

/**
 *
 */
public class Demo09 {

    public static LNode ConstructList(int start){
        int i = start;
        LNode head = new LNode();
        head.next = null;
        LNode tmp = null;
        LNode cur = head;
        for (; i <7 ; i+=2) {
            tmp = new LNode();
            tmp.data = i;
            tmp.next = null;
            cur.next = tmp;
            cur = tmp;
        }
        return head;
    }


    public static void PrintList(LNode head){
        for (LNode cur = head.next; cur!=null;cur = cur.next) {
            System.out.print(cur.data+" ");
        }
    }


    public static LNode Merge(LNode head1,LNode head2){

        if (null == head1 || head1.next == null){
            return head2;
        }
        if (null == head2 || head2.next == null){
            return head1;
        }

        LNode cur1 = head1.next;
        LNode cur2 = head2.next;
        LNode head = null;
        LNode cur = null;
        // 合并之后链表的头结点为第一个节点元素最小的哪个链表的头结点
        if (cur1.data>cur2.data){
            head = head2;
            cur = cur2;
            cur2 = cur2.next;
        }else {
            head = head1;
            cur = cur1;
            cur1 = cur1.next;
        }

        //每次找链表剩余节点的最小值对应的节点连接到合并后链表的尾部
        while (cur1!=null&&cur2!=null){
            if (cur1.data<cur2.data){
                cur.next = cur1;
                cur = cur1;
                cur1 = cur1.next;
            }
            else {
                cur.next = cur2;
                cur = cur2;
                cur2 = cur2.next;
            }
        }

        // 当遍历完一个链表后把另外一个链表剩余结点连接到合并后的链表之后

        if (cur1!=null){
            cur.next = cur1;
        }
        if (cur2!=null){
            cur.next = cur2;
        }
        return head;

    }



    public static void main(String[] args) {
        LNode head1 = ConstructList(1);
        LNode head2 = ConstructList(2);
        PrintList(head1);
        System.out.println();
        PrintList(head2);
        System.out.println();
        LNode merge = Merge(head1, head2);
        PrintList(merge);
    }

}
