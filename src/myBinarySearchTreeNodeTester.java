import static org.junit.jupiter.api.Assertions.*;

class myBinarySearchTreeNodeTester {

    /**
     * Test Case 1
     *       Method: insert(int inValue)
     *
     *       Input: myBinarySearchTreeNode a = new myBinarySearchTreeNode(5)
     *              inValue = 3
     *
     *       Expected Outcome: a binary search tree with the root being 5 and an children at the left of value 3
     *
     *       Reason: This is a common use of the method insert and it has to be tested to ensure that the array
     *               constructor works accordingly. The method should create a note as the left child of 5 since
     *               3 is smaller than 5
     *
     *       Outcome: The code managed to create a node with value 3 as the left child of node 5
     *
     */
    @org.junit.jupiter.api.Test
    void insertTest1() {

       myBinarySearchTreeNode a = new myBinarySearchTreeNode(5);
       a.insert(3);
       int[] array = {5,3};
       myBinarySearchTreeNode expected = new myBinarySearchTreeNode(array);

       assertEquals(expected.myValue,a.myValue);
       assertEquals(expected.left.myValue,a.left.myValue);
       assertEquals(expected.left.right,a.left.right);
       assertEquals(expected.left.left,a.left.left);

    }

    /**
     * Test Case 2
     *       Method: insert(int inValue)
     *
     *       Input: myBinarySearchTreeNode a = new myBinarySearchTreeNode(5)
     *              inValue = 5
     *
     *       Expected Outcome: a binary search tree with the root being 5 and an error print statement
     *
     *       Reason: This is a common use of the method insert and it has to be tested to ensure that the array
     *               constructor works accordingly. The method should not create another node and it should print
     *               an error duplicate statement
     *
     *       Outcome: The code managed to leave the binary search tree as it was and print the error statement
     *
     */
    @org.junit.jupiter.api.Test
    void insertTest2() {

        myBinarySearchTreeNode a = new myBinarySearchTreeNode(5);
        a.insert(5);
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode(5);

        assertEquals(expected.myValue,a.myValue);
        assertEquals(expected.right,a.right);
        assertEquals(expected.left,a.left);

    }

    /**
     * Test Case 3
     *       Method: height()
     *
     *       Input: int[] array = {10,2,5,7,3,8,4,14,13,16};
     *              myBinarySearchTreeNode a = new myBinarySearchTreeNode(array)
     *
     *       Visual: 10
     *               ├ 2
     *               │ └ 5
     *               │   ├ 3
     *               │   │ └ 4
     *               │   └ 7
     *               │     └ 8
     *               └ 14
     *                 ├ 13
     *                 └ 16
     *
     *
     *       Expected Outcome: 4 (The pathway that reaches node 8 or node 4 are the largest with a size of 4)
     *
     *       Reason: This test case is used to determine whether the recursive call can correctly return the height
     *               of the largest sub tree of a node. The right side of 10 is smaller, therefore the height that
     *               should be returned should be from the height from the left + 1
     *
     *       Outcome: The code managed to leave the binary search tree as it was and print the error statement
     *
     */
    @org.junit.jupiter.api.Test
    void heightTest1() {

        int[] array = {10,2,5,7,3,8,4,14,13,16};
        myBinarySearchTreeNode a = new myBinarySearchTreeNode(array);
        assertEquals(4,a.height());

    }

    /**
     * Test Case 4
     *       Method: depth()
     *
     *       Input: int[] array = {20,28,32,14,33,27,9,15,22};
     *              myBinarySearchTreeNode a = new myBinarySearchTreeNode(array)
     *              search = 27
     *
     *       Visual: 20
     *               ├ 14
     *               │ ├ 9
     *               │ └ 15
     *               └ 28
     *                 ├ 27
     *                 │ ├ 22
     *                 └ 32
     *                   └ 33
     *
     *
     *       Expected Outcome: 2 (The pathway that reaches node 27 or node 4 has a size of 2)
     *
     *       Reason: This test case is used to determine whether the recursive call can correctly return the depth
     *               of a certain node in the binary search tree. I searched a node that is not a leaf to make sure
     *               that it works differently to the height method
     *
     *       Outcome: The code managed to return the depth of the node 27 correctly.
     *
     */
    @org.junit.jupiter.api.Test
    void depthTest1() {

        int[] array = {20,28,32,14,33,27,9,15,22};
        myBinarySearchTreeNode a = new myBinarySearchTreeNode(array);
        assertEquals(2,a.depth(27));

    }

    /**
     * Test Case 5
     *       Method: size()
     *
     *       Input: int[] array = {50,44,96,52,23,13,72,87,38,19,56,89,17};
     *              myBinarySearchTreeNode a = new myBinarySearchTreeNode(array)
     *
     *       Visual: 50
     *               ├ 44
     *               │ ├ 23
     *               │ │ ├ 13
     *               │ │ │ └ 19
     *               │ │ │   ├ 17
     *               │ │ └ 38
     *               └ 96
     *                 ├ 52
     *                 │ └ 72
     *                 │   ├ 56
     *                 │   └ 87
     *                 │     └ 89
     *
     *
     *       Expected Outcome: 13 (The number of nodes in the Binary Search Tree)
     *
     *       Reason: This test case is used to determine whether the recursive call can correctly return the number
     *               of nodes in the tree. I used a tree with multiple paths to check if it can truly return the number
     *               regardless of the number of paths
     *
     *       Outcome: The code managed to return the number of nodes correctly
     *
     */
    @org.junit.jupiter.api.Test
    void size1() {

        int[] array = {50,44,96,52,23,13,72,87,38,19,56,89,17};
        myBinarySearchTreeNode a = new myBinarySearchTreeNode(array);
        assertEquals(array.length,a.size());

    }

}