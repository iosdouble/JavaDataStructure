package com.nihui.book1.charp01;

import com.nihui.book1.charp01.bean.LNode;

/**
 * @Classname Demo08
 * @Description TODO 如何把链表以K个结点为一组进行翻转
 * @Date 2020/7/31 5:02 PM
 * @Created by nihui
 */
public class Demo08 {

    /**
     * 对不带头节点的单链表翻转
     */

    private static LNode Reverse(LNode head){
        if (head == null|| head.next == null){
            return head;
        }

        LNode pre = head;
        LNode cur = head.next;
        LNode next = cur.next;
        pre.next = null;
        //使当前遍历到的节点cur指向其前驱结点
        while (cur!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = cur.next;
            cur = next;
        }

        return pre;
    }

    /**
     * 对链表K翻转
     */

    public static void ReverseK(LNode head,int k){
        if (head==null||head.next ==null||k<2){
            return;
        }

        int i = 1;
        LNode pre = head;
        LNode begin = head.next;
        LNode end = null;
        LNode pNext = null;
        while (begin!=null){
            end = begin;
            for (;i<k;i++){
                if (end.next!=null){
                    end = end.next;
                }else {
                    return ;
                }
            }

            pNext = end.next;
            end.next = null;
            pre.next = Reverse(begin);
            begin.next = pNext;
            pre = begin;
            begin = pNext;
            i = 1;
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

        System.out.print("顺序输出：");
        PrintList(head);
        ReverseK(head,3);
        System.out.println();
        System.out.print("逆序输出: ");
        PrintList(head);


    }
}
