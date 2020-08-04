package com.nihui.book1.charp01;

import com.nihui.book1.charp01.bean.LNode;

/**
 * @Classname Demo06
 * @Description TODO 如何将单链表向右旋转K个位置
 * @Date 2020/7/1 3:23 PM
 * @Created by nihui
 */
public class Demo05 {

    public static void RotateK(LNode head,int k){
        if (head==null||head.next==null){
            return;
        }
        // fast 指针先走完k步，然后与slow 指针同时向后走

        LNode slow,fast,tmp;
        slow = fast = head.next;
        int i;
        for (i = 0;i<k&&fast!=null;++i){ //向前k步
            fast = fast.next;
        }
        //判断k是否已超过链表长度
        if(i<k){
            return ;
        }
        // 循环结束后slow 指向链表倒数第k+1个元素，fast指向链表最后一个元素

        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        tmp = slow;
        slow = slow.next;
        tmp.next = null;
        fast.next = head.next;
        head.next = slow;
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
        System.out.print("旋转前：");
        PrintList(head);
        RotateK(head,3);
        System.out.print("\n旋转后：");
        PrintList(head);

    }
}
