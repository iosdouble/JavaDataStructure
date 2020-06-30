package com.nihui.book1.charp01;

import com.nihui.book1.charp01.bean.LNode;

/**
 * @Classname Demo02
 * @Description TODO 如何计算两个单链表所代表的数之和
 * @Date 2020/6/29 6:19 PM
 * @Created by nihui
 */
public class Demo02 {

    public static LNode add(LNode h1,LNode h2){
        if (h1 == null||h1.next == null){
            return h2;
        }

        if (h2 == null|| h2.next == null){
            return h1;
        }

        int c = 0;
        int sum = 0;

        LNode p1 = h1.next;
        LNode p2 = h2.next;

        LNode temp = null;

        LNode resultHead = new LNode();
        resultHead.next = null;
        LNode p = resultHead;

        while (p1!=null&& p2!= null){
            temp = new LNode();
            temp.next = null;
            sum = p1.data +p2.data+c;
            temp.data = sum%10;
            c = sum/10;
            p.next = temp;
            p = temp;
            p1 = p1.next;
            p2 = p2.next;
        }
        if (p1==null){
            while (p2 != null){
                temp = new LNode();
                temp.next = null;
                sum = p2.data + c;
                temp.data = sum%10;
                c = sum/10;
                p.next = temp;
                p = temp;
                p2 = p2.next;
            }
        }

        //15546631181
        if (p2==null){
            while (p1 != null){
                temp = new LNode();
                temp.next = null;
                sum = p1.data + c;
                temp.data = sum%10;
                c = sum/10;
                p.next = temp;
                p = temp;
                p1 = p1.next;
            }
        }
        if (c==1){
            temp = new LNode();
            temp.next = null;
            temp.data = 1;
            p.next = temp;
        }
        return resultHead;
    }

    public static void main(String[] args) {
        int i = 1;
        LNode head1 = new LNode();
        head1.next = null;
        LNode head2 = new LNode();
        head2.next = null;
        LNode temp = null;
        LNode cur = head1;
        LNode addResult = null;
        for (;i<7;i++){
            temp = new LNode();
            temp.data = i+2;
            temp.next = null;
            cur.next = temp;
            cur = temp;
        }
        cur = head2;
        for (i=9;i>4;i--){
            temp = new LNode();
            temp.data = i;
            temp.next = null;
            cur.next = temp;
            cur = temp;
        }
        System.out.print("Head: ");
        for (cur=head1.next;cur!=null;cur = cur.next){
            System.out.print(cur.data+" ");
        }
        System.out.print("\nHead2: ");
        for (cur=head2.next;cur!=null;cur = cur.next){
            System.out.print(cur.data+" ");
        }
        addResult =add(head1,head2);
        System.out.print("\n相加后的和 ");
        for (cur=addResult.next;cur!=null;cur = cur.next){
            System.out.print(cur.data+" ");
        }
    }
}
