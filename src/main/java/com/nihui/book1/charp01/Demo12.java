package com.nihui.book1.charp01;

import java.sql.SQLOutput;

/**
 * @Classname Demo12
 * @Description TODO 如何展开链表列表
 * @Date 2020/9/8 2:29 PM
 * @Created by nihui
 * @Version 1.0
 * @Description Demo12 @see JavaDataStructure
 */
public class Demo12 {
    private class Node{
        int data;
        Node right,down;
        Node(int data){
            this.data = data;
            this.right = null;
            this.down = null;
        }
    }

    private Node head;

    private Node merge(Node a,Node b){
        /**
         * 如果其中一个链表为空，则直接返回另外一个链表
         */
        if(a==null){
            return b;
        }
        if (b==null){
            return a;
        }
        /**
         * 把两个链表中比较小的节点赋值给result
         */
        Node result;
        if (a.data<b.data){
            result = a;
            result.down = merge(a.down,b);
        }else {
            result = b;
            result.down = merge(a,b.down);
        }
        return result;
    }

    /**
     * 链表扁平化处理
     */

    public Node flatten(Node root){
        if (root==null||root.right==null){
            return root;
        }
        root.right = flatten(root.right);
        root = merge(root,root.right);
        return root;
    }

    private Node insert(Node head_ref,int data){
        Node new_node = new Node(data);
        new_node.down = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.down;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Demo12 L = new Demo12();
        L.head = L.insert(L.head,31);
        L.head = L.insert(L.head,8);
        L.head = L.insert(L.head,6);
        L.head = L.insert(L.head,3);


        L.head.right = L.insert(L.head.right,21);
        L.head.right = L.insert(L.head.right,11);

        L.head.right.right = L.insert(L.head.right.right,50);
        L.head.right.right = L.insert(L.head.right.right,22);
        L.head.right.right = L.insert(L.head.right.right,15);


        L.head.right.right.right = L.insert(L.head.right.right.right,55);
        L.head.right.right.right = L.insert(L.head.right.right.right,40);
        L.head.right.right.right = L.insert(L.head.right.right.right,39);
        L.head.right.right.right = L.insert(L.head.right.right.right,30);

        L.head = L.flatten(L.head);
        L.printList();
    }
}
