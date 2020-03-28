/*
 *  Created by IntelliJ IDEA.
 *  User: ABHISHEK
 *  Date: 28-03-2020
 *  Time: 19:01
 */
package problem2.node;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}