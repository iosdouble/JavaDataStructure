package com.nihui.book1.charp01;

import com.nihui.book1.charp01.bean.LNode;

/**
 * @Classname Demo03
 * @Description TODO 如何对链表进行重新排序
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
}
