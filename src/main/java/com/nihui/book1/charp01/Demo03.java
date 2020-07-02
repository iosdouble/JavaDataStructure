package com.nihui.book1.charp01;

import com.nihui.book1.charp01.bean.LNode;

/**
 * @Classname Demo03
 * @Description TODO 如何对链表进行重新排序  如何查找链表的中间节点
 * @Date 2020/6/30 5:00 PM
 * @Created by nihui
 */
public class Demo03 {

    private static LNode FindMiddleNode(LNode head){
        if (head == null|| head.next ==null){
            return head;
        }
        LNode fast = head;
        LNode slow = head;
        LNode slowPre = head;
        while (fast != null&& fast.next!=null){
            slowPre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        slowPre.next = null;
        return slow;
    }

    private static LNode Reverse(LNode head){
        if (head ==null||head.next == null){
            return head;
        }
        LNode pre = head;
        LNode cur = head.next;
        LNode next;
        pre.next = null;

        while (cur!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = cur.next;
            cur = next;
        }
        return pre;
    }

    private static void Reorder(LNode head){
        if (head ==null||head.next ==null){
            return;
        }
        LNode cur1 = head.next;
        LNode mid = FindMiddleNode(head.next);

        LNode cur2 = Reverse(mid);
        LNode tmp = null;
        while (cur1.next!=null){
            tmp = cur1.next;
            cur1.next = cur2;
            cur1 = tmp;

            tmp = cur2.next;
            cur2.next = cur1;
            cur2 = tmp;
        }
        cur1.next = cur2;
    }

    public static void main(String[] args) {
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

        System.out.print("排序前：");
        for (cur = head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data+ " ");
        }
        Reorder(head);
        System.out.println();
        System.out.print("排序后：");
        for (cur = head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data+ " ");
        }
    }

}
