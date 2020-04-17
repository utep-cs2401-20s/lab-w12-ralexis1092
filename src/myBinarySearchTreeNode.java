class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;

  /**
   * Created a new node with empty child pointers
   *
   * @param inValue the value of the new node
   */
  myBinarySearchTreeNode(int inValue){

    this.myValue = inValue;

  }

  /**
   * Creates a new Binary Search Tree rooted at the first value in the array
   * by inserting elements into the tree in the order they are given in A.
   *
   * @param A an array that will be used to create a binary search tree
   */

  myBinarySearchTreeNode(int[] A){

    this.myValue = A[0];
    for(int i = 1; i < A.length; i++){
      insert(A[i]);
    }

  }

  /**
   * This method takes a new integer as input and decides
   *    if it should be place:
   *       * as the left child,
   *       * as the right child,
   *       * in the left subtree,
   *       * or in the right subtree.
   *    If the value already exists in the tree, no action is taken.
   *
   * @param inValue the value that will be added as a new node in the binary search tree
   */
  public void insert(int inValue){

    if(inValue > this.myValue){
      if(this.right == null){
        this.right = new myBinarySearchTreeNode(inValue);
      }
      else{
        this.right.insert(inValue);
      }
    }
    else if(inValue < this.myValue){
      if(this.left == null){
        this.left = new myBinarySearchTreeNode(inValue);
      }
      else{
        this.left.insert(inValue);
      }
    }
    else{
      System.out.println("Error: Value " + inValue +" is a duplicate value");
    }
    
  }

  /**
   * This method recursively calculates the height of the entire (sub)tree.
   * This method will take O(n) time
   *
   * @return The height of the root node
   */
  public int height(){
    int left = 0;
    int right = 0;
    if(this.right == null && this.left == null){
      return 0;
    }
    if(this.left != null){
      left = 1 + this.left.height();
    }
    if(this.right != null){
      right = 1 + this.right.height();
    }
    if(left>right){
      return left;
    }
    else{
      return right;
    }
  }

  /**
   * This method recursively calculates the depth of a given search value.
   * If the given value is not in the tree, this method returns -1.
   * Note that if the tree is a proper BST, this method should complete in O(log n) time.
   * Additionally, remember that the depth is the number of nodes on the path from a node to the root
   * (i.e. the number of the recursive calls).
   *
   * @param search the value that will be searched on the binary tree search
   * @return the depth of the node of the value given
   */
  public int depth(int search){
    if(search != myValue && this.left == null && this.right == null){
      return -1;
    }
    //searches if the current value is my value
    if(search == myValue){
      return 0;
    }
    //goes to the left if the value is less than myValue
    if(search < myValue){
      int left = this.left.depth(search);
      if(left == -1){
        return -1;
      }
      return 1 + left;
    }
    //goes to the right if the value is greater than myValue
    else{
      int right = this.right.depth(search);
      if(right == -1){
        return -1;
      }
      return 1 + right;
    }
  }

  /**
   * This method recursively calculates the number of nodes in the (sub)tree.
   *
   * @return the total number of nodes in the binary search tree
   */
  public int size(){
    int left = 0;
    int right = 0;
    if(this.right == null && this.left == null){
      return 1;
    }
    if(this.left != null){
      left = this.left.size();
    }
    if(this.right != null){
      right = this.right.size();
    }
    return 1 + left + right;
  }

  /**
   * Utility function included so you can debug your solution.
   */
  public void print() { print(""); }

  /**
   * helper method for the print method
   * @param prefix
   */
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }
  
} 
