package DataStructures.Tree.BinaryTree.BST.Implementation;

class Main
{
    public static void main(String[] args)
    {
        BST tree = new BST();
        System.out.println(tree.isEmpty());
        tree.insert(15);
        System.out.println(tree.isEmpty());
        tree.insert(10);
        tree.insert(20);
        tree.insertIterative(8);
        tree.insertIterative(17);
        tree.insertIterative(12);
        tree.insertIterative(25);
        System.out.println(tree.countLeafNodes());
        System.out.println(tree.countDeepestLevelLeafNodes());
        System.out.println(tree.countNodes());
        System.out.println(tree.search(12));
        System.out.println(tree.searchIterative(12));
        tree.preorder(); System.out.println();
        tree.inorder(); System.out.println();
        tree.inorderReverse(); System.out.println();
        tree.postorder(); System.out.println();
        System.out.println(tree.findMinimum());
        System.out.println(tree.findMaximum());
        System.out.println(tree.findHeight());
        tree.levelOrder(); System.out.println();
        System.out.println(tree.isBST());
        //tree.insertNonBST(27);
        //tree.inorder(); System.out.println();  // Not in sorted order anymore.
        //System.out.println(tree.isBST());
        tree.inorder(); System.out.println();
        System.out.println(tree.countLeafNodes());
        tree.delete(20);
        tree.inorder(); System.out.println();
        tree.insert(20);
        tree.inorder(); System.out.println();
        System.out.println(tree.findClosestRecursive(21));
        System.out.println(tree.findClosestIterative(21));
        System.out.println(tree.findHeight());
        System.out.println(tree.inorderSuccessor(20));
        System.out.println(tree.inorderPredecessor(20));
        tree.mirrorBT();
        tree.inorder(); System.out.println();       // Elements are printed in sorted decreasing order after mirroring the BST and then traversing inorder.
    }

}