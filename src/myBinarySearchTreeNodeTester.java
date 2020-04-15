import static org.junit.jupiter.api.Assertions.*;

class myBinarySearchTreeNodeTester {


    @org.junit.jupiter.api.Test
    void insert() {
       myBinarySearchTreeNode a = new myBinarySearchTreeNode(5);
       a.insert(3);
       a.insert(10);
       a.insert(7);
       a.insert(12);
       a.insert(5);
       a.insert(2);
       a.print();
    }

    @org.junit.jupiter.api.Test
    void insert1() {
        int[] hello = {5,1,2,3,4,5,6,9,8,10};
        myBinarySearchTreeNode a = new myBinarySearchTreeNode(hello);
        a.print();
        System.out.println(a.depth(4));
    }

    @org.junit.jupiter.api.Test
    void insert2() {
        int[] hello = {5,1,2,3,4,11,7,8,10,6,12,13,14,15,16};
        myBinarySearchTreeNode a = new myBinarySearchTreeNode(hello);
        a.print();
        System.out.println(a.height());
    }

}