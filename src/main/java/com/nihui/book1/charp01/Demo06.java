package com.nihui.book1.charp01;

import com.nihui.book1.charp01.bean.LNode;

/**
 * @Classname Demo06
 * @Description TODO 如何检测一个较大的单链表是否有环，如果存在环，那么如何找出环的入口点
 * @Date 2020/7/31 11:58 AM
 * @Created by nihui
 */
public class Demo06 {

    public static LNode constructList(){
        int i = 1;
        LNode head = new LNode();
        head.next = null;
        LNode tmp = null;
        LNode cur = head;
        //构造一个链表

        for (;i<8;i++){
            tmp = new LNode();
            tmp.data = i;
            tmp.next = null;
            cur.next = tmp;
            cur = tmp;
        }
        cur.next = head.next.next.next;
        return head;
    }


    /**
     * 方法功能是判断链表中是否存在环
     * @param head
     * @return
     */
    public static LNode isLoop(LNode head){
        if (head==null||head.next ==null){
            return null;
        }
        // 初始slow 与fast 都指向链表第一个节点
        LNode slow = head.next;
        LNode fast = head.next;

        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return slow;
            }
        }
        return null;
    }

    /**
     * 找出环的入口点
     * @param head
     * @param meetNode
     * @return
     */
    public static LNode findLoopNode(LNode head,LNode meetNode){
        LNode first = head.next;
        LNode second = meetNode;
        while (first!=second){
            first = first.next;
            second = second.next;
        }
        return first;
    }



    public static void main(String[] args) {

        LNode head = constructList();
        LNode meetNode = isLoop(head);
        LNode loopNode = null;
        if (meetNode!=null){
            System.out.println("有环");
            loopNode = findLoopNode(head,meetNode);
            System.out.println("环的入口点为："+loopNode.data);
        }else {
            System.out.println("无环");
        }
    }
}
