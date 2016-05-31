package DataStructures.Tree.BinaryTree.BST.Implementation;

import java.util.Queue;
import java.util.LinkedList;

class BST
{
     private BSTNode root;                 // This is the reference/pointer to the root node and not the root node, itself.

     public void insert(int data)
     {
          root = insert(root, data);
     }
     private BSTNode insert(BSTNode node, int data)                   // This method will always take the root node as input and then go down the tree and build references to new nodes, returning references of the newly built nodes recursively to the appropriate side (left/right) of the appropriate parent node and then will finally (after the final pop in the recursion stack) returns the same root node which was sent as the input.
     {
          if (node == null)
          {
               node = new BSTNode(data);
          }
          else if (data <= node.data)
          {
               node.left = insert(node.left, data);                   // When the recursion stack starts shrinking/popping, it returns the reference of the child node to its parent node.
          }
          else                // if (data > node.data)
          {
               node.right = insert(node.right, data);                 // When the recursion stack starts shrinking/popping, it returns the reference of the child node to its parent node.
          }
          return node;                  // This method ultimately returns a reference of the type BSTNode.
     }

     public void insertIterative(int data)
     {
          BSTNode node = new BSTNode(data);
          if (root == null)
          {
               root = node;
               return;
          }
          BSTNode parent = null, temp = root;                    // Two pointers will be needed in this implementation.
          while (temp != null)
          {
               parent = temp;                // Since temp will be updated in the next lines, therefore, its current value is saved in the parent pointer.
               if (data <= temp.data)
                    temp = temp.left;
               else                // if (data > temp.data)
                    temp = temp.right;
          }
          if (data <= parent.data)
               parent.left = node;
          else
               parent.right = node;
     }

     public void insertNonBST(int data)                // Inserting at the left side of the left most node of the tree to make it non-BST.
     {
          BSTNode node = new BSTNode(data);
          if (root == null)
          {
               root = node;
               return;
          }
          BSTNode parent = null, temp=root;
          while (temp != null)
          {
               parent = temp;
               temp = temp.left;
          }
          parent.left = node;
     }

     public boolean search (int data)
     {
          return search(root, data);
     }
     private boolean search(BSTNode node, int data)
     {
          if (node == null)
               return false;                 // If applicable, this false will ultimately be returned to the public search method just before this method.
          if (data == node.data)
          {
               return true;                  // If applicable, this true will ultimately be returned to the public search method just before this method.
          }
          if (data < node.data)
          {
               return search(node.left,data);                    // Boolean value returned from the top of the recursion stack will be returned to every function in the implicit stack before it pops, until the whole recursion stack is empty.
          }
          else                //if (data > node.data)
          {
               return search(node.right, data);                  // Boolean value returned from the top of the recursion stack will be returned to every function in the implicit stack before it pops, until the whole recursion stack is empty.
          }
     }

     public boolean searchIterative(int data)
     {
          BSTNode temp = root;
          while (temp !=null)
          {
               if (data < temp.data)
                    temp=temp.left;
               else if (data > temp.data)
                    temp=temp.right;
               else                // if (data == temp.data)
               {
                    return true;                // If data is neither greater than value in temp nor lesser, then it is equal to the value in temp.data.
               }
          }
          return false;
     }

     public boolean isEmpty()
     {
          return  root == null;
     }

     public int countNodes()
     {
          return countNodes(root);
     }
     private int countNodes(BSTNode node)                   // The best way to explain any recursive algorithm is to explain the function calls (and their return values) of the implicit recursion stack, step by step.
     {
          if (node == null)
               return 0;
          else
          {
               int result = 1;                                   // This value will be returned to every recursive call below, for each valid node, only once.
               result += countNodes(node.left);                  // Tree will be parsed in DFS order and 1 will be added to the result, for each left node.
               result += countNodes(node.right);                 // Tree will be parsed in DFS order and 1 will be added to the result, for each right node.
               return result;                                    // Every recursive call for a valid node will return 1 else 0 (for left and right of the leaf nodes only).
          }
     }

     public int findMinimum()
     {
          BSTNode result = findMaximum(root);
          if (result == null)
               return -1;
          return result.data;

     }
     private BSTNode findMinimum(BSTNode node)                  // Minimum value will be of the left most leaf node.
     {
          if (node == null)
          {
               return null;
          }
          else
          {
               while (node.left != null)
                    node = node.left;
          }
          return node;
     }

     public int findMaximum()                                    // Maximum value will be of the right most leaf node.
     {
          BSTNode result = findMaximum(root);
          if (result == null)
               return -1;
          return result.data;
     }
     private BSTNode findMaximum(BSTNode node)                  // Return type for this method is BSTNode so that this method could be used in the delete method as well.
     {
          if (node == null)
          {
               System.out.println("Tree is empty!");
               return null;
          }
          else
          {
               while (node.right != null)
                    node = node.right;
          }
          return node;
     }

     public int findHeight()
     {
          return findHeight(root);
     }
     private int findHeight(BSTNode current)
     {
          if (current == null)
               return -1;                    // Height of an empty tree is -1.
          int leftHeight = findHeight(current.left);
          int rightHeight = findHeight(current.right);
          return Math.max(leftHeight, rightHeight)+1;
          //return Math.max(findHeight(current.left),findHeight(current.right))+1;                  // Above 3 lines can be switched with this single line.
     }

     public void levelOrder()                // a.k.a (Breadth First Traversal). Time Complexity: O(n) (Each node will be visited exactly once and it takes constant time to visit a node).  // Space Complexity: O(n) (for a perfect BT, queue will be max. filled for the last level having n/2 elements).
     {
          levelOrder(root);
     }
     private void levelOrder(BSTNode node)
     {
          if (node == null)
               return;
          Queue<BSTNode> q = new LinkedList<>();
          q.add(node);
          while (!q.isEmpty())
          {
               BSTNode current = q.poll();                  // poll method returns the first element from the front of the queue and then removes it.
               System.out.print(current.data + " ");
               if (current.left != null)                    // This print elements from left to right
               q.add(current.left);                         // For right to left printing, just interchange left and right in the whole method.
               if (current.right != null)
               q.add(current.right);
          }
     }

     public void preorder()                                 // Time: O(n) . Space: O(h) ( 'h' is height of the tree), therefore, best/average space: O(log n), worst space: O(n) (sparse tree).
     {
          preorder(root);
     }
     private void preorder(BSTNode node)
     {
          if (node == null)
               return;
          System.out.print(node.data + " ");
          preorder(node.left);
          preorder(node.right);
     }

     public void inorder()                                  // Time: O(n) . Space: O(h) ( 'h' is height of the tree), therefore, best/average space: O(log n), worst space: O(n) (sparse tree).
     {
          inorder(root);
     }
     private void inorder(BSTNode node)                     // This prints the BST in sorted increasing order.
     {
          if (node == null)
               return;
          inorder(node.left);
          System.out.print(node.data + " ");
          inorder(node.right);
     }

     public void inorderReverse()                            // Time: O(n) . Space: O(h) ( 'h' is height of the tree), therefore, best/average space: O(log n), worst space: O(n) (sparse tree).
     {
          inorderReverse(root);
     }
     private void inorderReverse(BSTNode node)               // This prints the BST in sorted decreasing order.
     {
          if (node == null)
               return;
          inorderReverse(node.right);
          System.out.print(node.data + " ");
          inorderReverse(node.left);
     }

     public void postorder()                                // Time: O(n) . Space: O(h) ( 'h' is height of the tree), therefore, best/average space: O(log n), worst space: O(n) (sparse tree).
     {
          postorder(root);
     }
     private void postorder(BSTNode node)
     {
          if (node == null)
               return;
          postorder(node.left);
          postorder(node.right);
          System.out.print(node.data + " ");
     }

     public boolean isBST()                  // CIQ                        // Check if the given binary tree is a binary search tree or not. // Popular interview question. // Time: O(n) (since each node will be visited only once).  // Another same complexity solution is to have an inorder traversal of the tree and if all the elements are sorted then it is a BST. (would need to check only if the current node value is greater (or equal) than its previously traversed node's value.
     {
          return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
     }
     private boolean isBST(BSTNode node, int min, int max)                 // Every node in the tree is given a range where its data/value could exist for the tree to be a BST, otherwise, it is not a BST.
     {
          return (node == null || node.data > min && node.data < max && isBST(node.left, min, node.data) && isBST(node.right, node.data, max));                 // Minimum value for the left nodes will remain minimum but their max value will not exceed the value of their parent's node. Maximum value for the right nodes will remain maximum but their min value should be greater than the value of their parent's node.
     }

//     public boolean isBST()                    // Check if the given binary tree is a binary search tree or not. // Popular interview question. // This is a costly method i.e. time complexity is quite high (O(n^2)).
//     {
//          return isBST(root);
//     }
//     private boolean isBST(BSTNode node)
//     {
//          return (node == null || isSubTreeLesser(node.left, node.data) && isSubTreeGreater(node.right, node.data) && isBST(node.left) && isBST(node.right));        // Every node in the left and right sub-trees will be compared with the data in the root node. And this will continue recursively for every node in the tree.
//     }
//     private boolean isSubTreeLesser(BSTNode node, int data)
//     {
//          return (node == null || node.data <= data && isSubTreeLesser(node.left, data) && isSubTreeLesser(node.right, data));                                       // This method checks if all the nodes in the left sub-tree of the root node are lesser (or equal) than the data in the root node.
//     }
//     private boolean isSubTreeGreater(BSTNode node, int data)
//     {
//          return (node == null || node.data > data && isSubTreeGreater(node.left, data) && isSubTreeGreater(node.right, data));                                      // This method checks if all the nodes in the right sub-tree of the root node are greater than the data in the root node.
//     }

     public void delete(int data)                                          // CIQ
     {
          root = delete(root, data);                                       // This sends root as the input and ultimately after the delete method finishes its execution, returns the same root which was sent as the input.
     }
     private BSTNode delete(BSTNode node, int data)                        // Recursion stack of this method works similar to the insert method. // Refer insert method for further details.
     {
          if (node == null)
               return null;
          else if (data < node.data)
               node.left = delete(node.left, data);
          else if (data > node.data)
               node.right = delete(node.right, data);
          else //if ( data == node.data)
          {
               if (node.left == null && node.right == null)                // Case 1: No child.
               {
                    node = null;
               }
               else if (node.left == null)                                 // Case 2: One child. (if the child is on the right side)
               {
                    node = node.right;
               }
               else if (node.right == null)                                // Case 2: One child. (if the child is on the left side)
               {
                    node = node.left;
               }
               else                                                        // Case 3: Two children.
               {
                    BSTNode temp = findMaximum(node.left);                 // Find maximum node of the left subtree
                    node.data = temp.data;                                 // Copy its data into the target node
                    node.left = delete(node.left,temp.data);               // Delete the node
               }
          }
          return node;
     }

     public int inorderSuccessor(int data)                       // CIQ         // Time: O(h) (h -> height of the tree) i.e. O(log n) for a balanced binary tree.
     {
          BSTNode result = inorderSuccessor(root, data);
          if (result == null)
          {
               System.out.println("Successor does not exist!");
               return -1;
          }
          return result.data;
     }
     private BSTNode inorderSuccessor(BSTNode node, int data)
     {
          BSTNode current = find(node,data);                     // Search/find the node.
          if (current == null)
               return null;
          if (current.right != null)                             // Case 1: Node has right subtree. // Find minimum in the right subtree.
               return findMinimum(current.right);
          else                                                   // Case 2: No right subtree.  // Walk the tree from root of the tree to the current node and find deepest/nearest ancestor for which current node will be in its left subtree.
          {
               BSTNode successor = null, ancestor = node;
               while (ancestor != current)
               {
                    if (current.data < ancestor.data)            // Current node is in the left subtree of the ancestor node.
                    {
                         successor = ancestor;                   // So far this is the deepest/nearest node for which the current node is in its left subtree.
                         ancestor = ancestor.left;               // Update ancestor to find the deepest/nearest (to the current) ancestor.
                    }
                    else  // if (current.data > ancestor.data)   // Current is in the right subtree of the ancestor node.
                         ancestor = ancestor.right;              // Think of this case for biggest node in the tree, whose successor doesn't exist.
               }
               return successor;
          }
     }
     private BSTNode find(BSTNode node, int data)                // Very similar to the search method.
     {
          if (node == null)
               return null;
          if (data == node.data)
          {
               return node;
          }
          if (data < node.data)
          {
               return find(node.left,data);
          }
          else
          {
               return find(node.right, data);
          }
     }

     public int inorderPredecessor(int data)                          // CIQ    // Time: O(h) (h -> height of the tree) i.e. O(log n) for a balanced binary tree.
     {
          BSTNode result = inorderPredecessor(root, data);
          if (result == null)
          {
               System.out.println("Predecessor does not exist!");
               return -1;
          }
          return result.data;
     }
     private BSTNode inorderPredecessor(BSTNode node, int data)
     {
          BSTNode current = find(node,data);                          // Search/find the node.
          if (current == null)
               return null;
          if (current.left != null)                                   // Case 1: Node has left subtree. // Find maximum in the left subtree.
               return findMaximum(current.left);
          else                                                        // Case 2: No left subtree.  // Walk the tree from root of the tree to the current node and find deepest/nearest ancestor for which current node will be in its right subtree.
          {
               BSTNode predecessor = null, ancestor = node;
               while (ancestor != current)
               {
                    if (current.data > ancestor.data)                 // Current node is in the right subtree of the ancestor node.
                    {
                         predecessor = ancestor;                      // So far this is the deepest/nearest node for which the current node is in its right subtree.
                         ancestor = ancestor.right;                   // Update ancestor to find the deepest/nearest (to the current) ancestor.
                    }
                    else  // if (current.data < ancestor.data)        // Current is in the left subtree of the ancestor node.
                         ancestor = ancestor.left;                    // Think of this case for smallest node in the tree, whose predecessor doesn't exist.
               }
               return predecessor;
          }
     }

     public void mirrorBT()                            // CIQ  // This method is applicable for any binary tree and not just BST.
     {
          mirrorBT(root);
     }
     private BSTNode mirrorBT(BSTNode node)            // Time: O(n).
     {
          if (node == null)
               return null;
          BSTNode temp = node.left;                    // Swapping left and right child nodes.
          node.left = node.right;
          node.right = temp;
          mirrorBT(node.left);                         // Every node will be traversed in DFS order, and for every node swapping will be performed.
          mirrorBT(node.right);
          return node;                                 // Finally root node of the tree will be returned which was passed as the input.
     }

     public int findClosestRecursive(int data)         // CIQ
     {
          return findClosestRecursive(root, data);
     }
     private int findClosestRecursive(BSTNode node, int data)
     {
          if (node == null)
               return -1;
          if (node.data == data)
               return data;
          BSTNode current = (data > node.data)? node.right:node.left;                         // If data is greater than current node than go right else left, until the node with the exact data is found or current node reaches a leaf node.
          if (current == null)
               return node.data;
          int childDiff = findClosestRecursive(current, data);                                // Just a way of storing absolute difference of the child node with the input data.
          return Math.abs(node.data-data) < Math.abs(childDiff-data)?node.data:childDiff;     // When recursion stack starts shrinking/popping, then it compares minimum absolute difference between its data and its child's data with the input data and returns the minimum of the two. Does this recursively until it reaches the root node and then returns the node.data who's difference is the smallest.
     }

     public int findClosestIterative(int data)         // CIQ
     {
          return findClosestIterative(root, data);
     }
     private int findClosestIterative(BSTNode node, int data)
     {
          if (node == null)
               return -1;
          if (node.data == data)
               return data;
          int closest = node.data;
          int previousDifference = Math.abs(node.data - data);
          while (node != null)
          {
               if (data < node.data )
               {
                    if (node.left == null)
                         return closest;
                    node = node.left;
               }
               else if (data > node.data)
               {
                    if (node.right == null)
                         return closest;
                    node = node.right;
               }
               int currentDifference = Math.abs(node.data - data);
               if (currentDifference < previousDifference)
               {
                    if (currentDifference == 0)
                         return node.data;
                    closest = node.data;
                    previousDifference = currentDifference;
               }
          }
         throw new IllegalArgumentException();              // This line won't ever execute.
     }

     private int leafs=0;
     public int countLeafNodes()
     {
          leafs=0;
          return countLeafNodes(root);
     }
     private int countLeafNodes(BSTNode node)
     {
          if (node == null)
               return 0;
          countLeafNodes(node.left);
          if (node.left == null && node.right == null)
               leafs++;
          countLeafNodes(node.right);
          return leafs;
     }

    public int countDeepestLevelLeafNodes() {
         return countDeepestLevelLeafNodes(root, findHeight());
     }
    private int countDeepestLevelLeafNodes(BSTNode node, int depth) {
        if (node == null)
            return 0;
        if (depth == 0)
            return 1;
        int result = 0;
        result += countDeepestLevelLeafNodes(node.left,depth-1);
        result += countDeepestLevelLeafNodes(node.right,depth-1);
        return result;
    }

}