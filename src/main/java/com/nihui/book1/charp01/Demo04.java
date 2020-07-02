package com.nihui.book1.charp01;

import com.nihui.book1.charp01.bean.LNode;

/**
 * @Classname Demo04
 * @Description TODO 如何找出单链表中的倒数第K个元素
 * @Date 2020/7/1 2:17 PM
 * @Created by nihui
 */
public class Demo04 {

    public static LNode ConstructList(){
        int i = 1;
        LNode head = new LNode();
        head.next = null;
        LNode tmp = null;
        LNode cur = head;
        for (;i<8;i++){
            tmp = new LNode();
            tmp.data = i;
            tmp.next = null;
            cur.next = tmp;
            cur = tmp;
        }
        return head;
    }

    public static void PintLNode(LNode head){
        System.out.println(" 链表是 ：");
        for (LNode cur = head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data + " ");
        }
        System.out.println();
    }

    public static LNode FindLastK(LNode head,int k){
        if (head == null||head.next==null){
            return head;
        }
        LNode slow ,fast;
        slow = fast = head.next;
        int i ;
        for (i=0;i<k && fast!=null;++i){
            fast=fast.next;
        }
        if (i<k){
            return null;
        }
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        LNode head = ConstructList();
        PintLNode(head);
        LNode lNode = FindLastK(head, 3);
        System.out.println("倒数第三个元素是 " + lNode.data);
    }
}
