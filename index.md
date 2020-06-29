# 算法与数据结构

&emsp;&emsp;对于算法和数据结构来说，数据结构就是数据的组织形式，而是算法就是处理这些数据的一个规则。

&emsp;&emsp;数据的主要组成结构，数组（静态数组、动态数组）、线性表、链表（单向链表、双向链表、循环链表）、
队列、栈、树（二叉树、查找树、平衡树、线索树、线索树、堆）、图等的定义、存储和操作 · Hash（存储地址计算，冲突处理）

&emsp;&emsp;当然不同的人有不同的分类方法，个人认为主要有两大类一类是线性。，一类是非线性。这样的话整个非线性的就可以分为树，图，哈希，集合等，而线
性的数据结构就可以分为 数组，线性表，链表，队列，栈等。

```
&emsp;&emps;**注意**

&emsp;&emps;在很多的面试中被问及HashMap
```

&emsp;&emsp;首先需要介绍的就是两个基本的数据结构，链表和二叉树

## 链表数据结构
```java
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(){

    }

    public void add(int val){
        ListNode node = new ListNode(val);
        if (next == null){
            next = node;
            return;
        }
        ListNode temp = next;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }
}
```
&emsp;&emsp;上面代码是为了演示方便所以添加了一个增加链表元素的方法，这里使用的是头插法，也就是说从链表的头部开始逐渐往前插入，每次进入新的元素的时候，将这个元素加入
到第一个节点的位置，将其余节点向后移动

## 二叉树数据结构

```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
```

&emsp;&emsp;上面这段代码很好的诠释了二叉树这种数据结构。有一个表示值的变量和两个指向左右节点的指针组成。







