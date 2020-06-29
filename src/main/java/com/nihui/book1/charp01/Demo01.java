package com.nihui.book1.charp01;

import com.nihui.book1.charp01.bean.LNode;

/**
 * @Classname Demo01
 * @Description TODO 如何从无序链表中移除重复项
 * @Date 2020/6/29 5:46 PM
 * @Created by nihui
 */
public class Demo01 {

    public static void removeDup(LNode head){
        if (head ==null || head.next==null){
            return ;
        }

        LNode ourterCur = head.next; // 用于外层循环，指向链表第一个节点
        LNode innerCur = null; // 内层循环来遍历ourterCur 后面的节点
        LNode innerPre = null; // innerCur 的前驱节点

        for (;ourterCur !=null;ourterCur=ourterCur.next){
            for (innerCur = ourterCur.next,innerPre = ourterCur;innerCur!=null;){
                //找到重复的节点并删除

                if (ourterCur.data == innerCur.data){
                    innerPre.next = innerCur.next;
                    innerCur = innerCur.next;
                }else {
                    innerPre = innerCur;
                    innerCur = innerCur.next;
                }
            }
        }
    }


    private static LNode removeDupRecureion(LNode head){

        if (head == null){
            return head;
        }
        LNode pointer = null;
        LNode cur = head;

        // 对以head.next 为首的子链表删除重复的节点
        head.next = removeDupRecureion(head.next);
        pointer = head.next;
        // 找出以head.next 为首的子链表中与head数据相同的元素并删除。
        while (pointer != null){
            if (head.data == pointer.data){
                cur.next = pointer.next;
                pointer = cur.next;
            }else {
                pointer = pointer.next;
                cur = cur.next;
            }
        }
        return head;
    }

    // 对带有头节点的单链表删除重复节点输入参数：head ：链表头节点。
    private static void removeDup1(LNode head){
        if (head ==null){
            return;
        }
        head.next = removeDupRecureion(head.next);
    }

    public static void main(String[] args) {
        int i = 1;
        LNode head = new LNode();
        head.next = null;
        LNode temp = null;
        LNode cur = head;

        for (; i < 7; i++) {
            temp = new LNode();
            if (i%2==0){
                temp.data = i+1;
            }else if (i%3==0){
                temp.data = i-2;
            }else {
                temp.data = i;
            }
            temp.next = null;
            cur.next = temp;
            cur =temp;
        }
        System.out.println("删除重复节点之前");
        for (cur = head.next;cur!=null;cur = cur.next){
            System.out.print(cur.data+" ");
        }

        removeDup(head);
        System.out.println("\n 删除重复节点之后");
        for (cur = head.next;cur!=null;cur = cur.next){
            System.out.print(cur.data+" ");
        }
    }
}
