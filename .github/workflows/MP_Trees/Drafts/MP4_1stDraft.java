package Drafts;
import java.util.*;
class ListN//Initiates the linked list
{
    String input; 
    ListN next;
    ListN(String data)//Represents the value of a node 
    {
        input = data;
        next = null;
    }
}

//Represents the binary tree
class BinaryNode
{
    String input;
    BinaryNode left  = null;
    BinaryNode right = null;

    BinaryNode(String input)
    {
        this.input = input;
        left = right = null;
    }
}

public class MP4_1stDraft 
{
    ListN head;
    BinaryNode root;

    void push(String new_input)
    {
        ListN new_node = new ListN(new_input);
        new_node.next = head;
        head = new_node;
    }

    BinaryNode convertList2Binary(BinaryNode node)
    {
        Queue<BinaryNode> q = new LinkedList<BinaryNode>();

        if (head == null)
        {
            node = null;
            return null;
        }

        node = new BinaryNode(head.input);
        q.add(node);

        head = head.next;

        while(head != null)
        {
            BinaryNode parent = q.peek();

            BinaryNode leftChild = null; 
            BinaryNode rightChild = null;

            leftChild = new BinaryNode(head.input);

            q.add(leftChild);
            head = head.next;
            if(head != null)
            {
                rightChild = new BinaryNode(head.input);
                q.add(rightChild);
                head = head.next;
            }

            parent.left = leftChild;
            parent.right = rightChild;

            q.poll();
        }
        return node;
    }

    void inorderTraversal(BinaryNode node)
    {
        if (node != null)
        {
            inorderTraversal(node.left);
            System.out.print(node.input + " ");
            inorderTraversal(node.right);
        }
    }

    void preorderTraversal(BinaryNode node)
    {
        if(node !=  null)
        {
            System.out.print(node.input + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    void postorderTraversal(BinaryNode node)
    {
        if(node !=  null)
        {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.input + " ");
        }
    }

    public void printAtGivenLevel(BinaryNode node, int level) {
        if (node == null) {
          return;
        }
        
        if(level == 1) {
          System.out.print(node.data + " ");
          return;
        }
        
        printAtGivenLevel(node.left, level - 1);
        printAtGivenLevel(node.right, level - 1);
      }
    
    public static void main(String[] args) 
    {
        /*
            -   Ordered Binary Trees because of the specific ordering of nodes
	        -   Useful for locating data  
            -   Binary tree with unique information called keys in the nodes that has the
        */  

        /*1st draft from geeks for geeks
        [
            Construct Complete Binary Tree from its Linked List Representation || https://www.geeksforgeeks.org/given-linked-list-representation-of-complete-tree-convert-it-to-linked-representation/
            Tree Traversals (Inorder, Preorder and Postorder)                  || https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
        ]
        */

        MP4_1stDraft tree = new MP4_1stDraft();
        tree.push("36"); /* Last node of Linked List */
        tree.push("30");
        tree.push("25");
        tree.push("15");
        tree.push("12");
        tree.push("10");/* First node of Linked List */
        BinaryNode node = tree.convertList2Binary(tree.root);
  
        System.out.println("Inorder Traversal of the"+
                        " constructed Binary Tree is:");
        tree.inorderTraversal(node);

        System.out.println();

        System.out.println("Preorder Traversal of the"+
        " constructed Binary Tree is:");
        tree.preorderTraversal(node);

        System.out.println();

        System.out.println("Postorder Traversal of the"+
        " constructed Binary Tree is:");
        tree.postorderTraversal(node);

        System.out.println();
        System.out.print("Tree\n");
    }    
}

