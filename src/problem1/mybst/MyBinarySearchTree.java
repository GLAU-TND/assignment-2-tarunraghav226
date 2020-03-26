/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void insert(TreeNode newNode) {

        if (getRoot() == null) {
            setRoot(newNode);
            return;
        }

        TreeNode parent;
        TreeNode current = getRoot();
        boolean isLeft = true;

        while (current != null) {
            parent = current;
            if (newNode.getData() > current.getData()) {
                current = current.getRightNode();
                isLeft = false;
            } else {
                current = current.getLeftNode();
                isLeft = true;
            }

            if (isLeft)
                parent.setLeftNode(newNode);
            else
                parent.setRightNode(newNode);
        }
    }
}
