/* 
 *ABUSAMAN, Farida A.
 * SEBASTIAN, Nigel Haim N.
 * 1CSA
 */

import java.util.*;
class Tnode
{
    Tnode leftChild;
    Tnode rightChild;
    int data;
    Tnode(int data)
    {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }  
}

class Tree{
    boolean character;
    void make_character(boolean tf)
    {
        character = tf;
    }
    public Tnode new_node(int k){
        Tnode n_node  = new Tnode(k);
        return n_node;
    }

    public void search(Tnode node, int value)
    {
        if(node == null)
        {
            return;
        }
        if(value == node.data)
        {
            if(character)
            {
                System.out.print("Found node with the value of: " + (char)value);
            }
            else 
            {
                System.out.print("Found node with the value of: " + value);
            }
        }
        else if(value < node.data)
        {
            search(node.leftChild, value);
        }

        else if(value > node.data)
        {
            search(node.rightChild, value);
        }

    }
    
    public Tnode push(Tnode node, int value){
        if(node == null){
            return new_node(value);
        }
        if(value < node.data){
            node.leftChild = push(node.leftChild, value);
        }
        else if(value > node.data){
            node.rightChild = push(node.rightChild, value);
        }
        return node;
    }

    public Tnode pop(Tnode node, int value)
    {
        if(node == null){
            return null;
        }

        if (value < node.data){
            node.leftChild = pop(node.leftChild, value);
        }

        else if(value > node.data){
            node.rightChild = pop(node.rightChild, value);
        }

        else {
            if(node.leftChild == null || node.rightChild == null){
                Tnode temp = null;
                temp = node.leftChild == null ? node.rightChild : node.leftChild;
                if(temp == null){
                    return null;
                }

                else{
                    Tnode successor = Successor(node);
                    node.data = successor.data;
                    node.rightChild = pop(node.rightChild, 4);
                    return node;
                }
            }   
        }
        return node;
    }

    public Tnode Successor(Tnode node){
        if(node == null){
            return null;
        }

        Tnode temp_node = node.rightChild;

        while(temp_node != null){
            temp_node = temp_node.leftChild;
        }
        return temp_node;
    }
    void data_printer(Tnode node)
    {
        if(character)
        {
            System.out.print((char)node.data + " ");
        }
        else
        {
            System.out.print(node.data + " ");
        }
    }

    void inorderTraversal(Tnode node)
    {
        if(node == null){
            return;
        }
        inorderTraversal(node.leftChild);
        data_printer(node);
        inorderTraversal(node.rightChild);
        
    }

    void preorderTraversal(Tnode node)
    {
        if(node == null){
            return;
        }
        data_printer(node); 
        preorderTraversal(node.leftChild);
        preorderTraversal(node.rightChild);
    }

    void postorderTraversal(Tnode node)
    {
        if(node == null){
            return;
        }
        postorderTraversal(node.leftChild);
        postorderTraversal(node.rightChild);
        data_printer(node);
       
    }

    void node_printer_internalNodes(Tnode node)
    {
        if(node.leftChild != null || node.rightChild != null)
        {
            System.out.print(node.data);
            if(node.leftChild != null)
            {
                node_printer_internalNodes(node.leftChild);
            }
            if(node.rightChild != null)
            {
                node_printer_internalNodes(node.rightChild);
            }

        }
    }

    void node_printer_externalNodes(Tnode node)
    {
        if(node.leftChild == null && node.rightChild == null)
        {
            System.out.print(node.data + " ");
        }
        if(node.leftChild != null)
        {
            node_printer_externalNodes(node.leftChild); 
        }
        if(node.rightChild != null)
        {
            node_printer_externalNodes(node.rightChild);   
        }

        if(node == null)
        {
            return;
        }
    }
    public int treeHeight(Tnode node)
    {
        int leftHeight = 0;
        int rightHeight = 0;

        if(node.leftChild != null)
        {
            leftHeight = treeHeight(node.leftChild);
        }

        if(node.rightChild != null)
        {
            rightHeight = treeHeight(node.rightChild);
        }

        int max_height = (leftHeight > rightHeight) ? leftHeight : rightHeight;

        return (max_height + 1);
    }
    
}

public class MP4
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        Tree rawTree = new Tree();
        Tnode root = null;
        boolean existance = false;
        boolean integer = false;
        boolean looping = true;
        int number_of_nodes = 0;
        while (looping)
        {
            try
            {
                int num = 0;
                do
                {
                    displayMenu();
                    System.out.print("Enter the number of your desired action: ");
                    num = validateNum(in.nextInt());

                    if (num == 1)
                    {
                        boolean looping1 = true;
                        while(looping1)
                        {
                            try
                            {
                                System.out.println("\nBinary Search Tree");
                                System.out.println("\nThere are 2 types of inputs: Number and Character");
                                System.out.print("What is your type of input? [ N | C ] : ");
                                char input = in.next().toUpperCase().charAt(0);
                                validateInput(input);
    
                                if (input == 'N')
                                {
                                    integer = true;
                                }
                                else if (input == 'C')
                                {
                                    rawTree.make_character(true);
                                    integer = false;
                                }
                                existance = true;
                                looping1  = false;
                            }
                            catch (InputMismatchException e)
                            {
                                System.err.println("\nInputMismatchException: Your input is invalid. Please try again.\n\n");
                                in.nextLine();
                                looping1 = true;
                            }
    
                        }
                    }
                    else if (num == 2)
                    {
                        
                    }
                    else if (num == 3)
                    {
                        System.out.println();
                        System.out.print("The internal nodes of the binary tree: ");
                        rawTree.node_printer_internalNodes(root);
                        System.out.println();
                        System.out.print("The external nodes of the binary tree: ");
                        rawTree.node_printer_externalNodes(root);
                        System.out.println();
                        System.out.print("The number of edges in a binary tree: " + (number_of_nodes - 1));
                        System.out.println();
                        System.out.print("The height of the binary Tree: ");
                        System.out.print(rawTree.treeHeight(root));
                        System.out.println();
                    }
                    else if (num == 4)
                    {
                        if(existance)
                        {
                            System.out.print("Inorder: ");
                            rawTree.inorderTraversal(root);
                    
                            System.out.print("\n" + "Preorder: ");
                            rawTree.preorderTraversal(root);
                    
                            System.out.print("\n" + "Postorder: ");
                            rawTree.postorderTraversal(root);
                            System.out.println();
                        }

                        else
                        {
                            System.out.print("Tree doesn't exist! \nPlease create a tree");
                            continue;
                        }
                    }
                    else if (num == 5)
                    {
                        if(integer)
                        {
                            System.out.print("Enter the desired integer: ");
                            int search = in.nextInt();
                            rawTree.search(root, search);
                        }
                        else
                        {
                            System.out.print("Enter the desired character: ");
                            char search = in.next().toUpperCase().charAt(0);
                            rawTree.search(root, search);
                        }
                    }
                    else if (num == 6)//Insert a Node in BST
                    {
                        System.out.print("Insert Node Value: ");
                        if(integer)
                        {
                            int input = in.nextInt();
                            root = rawTree.push(root, input);    
                        }
                        else
                        {
                            char input = in.next().toUpperCase().charAt(0);
                            while(!(input >= 'A' && input <= 'Z'))
                            {
                                System.out.println("Invalid input only A-Z: ");
                                input = in.next().toUpperCase().charAt(0);
                            }
                            if(input >= 'A' && input <= 'Z')
                            {
                                root = rawTree.push(root, input);  
                            } 
                        }
                        number_of_nodes++;
                    }
                    else if (num == 7)
                    {
                        System.out.print("Input the node value to be deleted: ");
                        if(integer)
                        {
                            int input = in.nextInt();
                            root = rawTree.pop(root, input);    
                        }
                        else
                        {
                            char input = in.next().toUpperCase().charAt(0);
                            root = rawTree.pop(root, input);   
                        }

                    }
                    else if (num == 8)
                    {
                        quitProgram();
                    }
                } while (num != 8);

                looping = false;
            }
            catch (InputMismatchException e)
            {
                System.err.println("\nInputMismatchException: Your input must be a number value. Please try again.\n\n");
                in.nextLine();
                looping = true;
            }
        }
    }

    public static void displayMenu()
    {
        System.out.println();
        System.out.println("Menu\n");
        System.out.println("1. Create a Binary Search Tree (BST)");
        System.out.println("2. Create a Syntax Tree for an Arithmetic Expression //Not working");
        System.out.println("3. Display Binary Tree //Not working");
        System.out.println("4. Traverse Binary Tree");
        System.out.println("5. Search a Node in BST");
        System.out.println("6. Insert a Node in BST");
        System.out.println("7. Delete a Node in BST");
        System.out.println("8. Quit\n");
    }

    public static int validateNum(int num)
    {
        while (num > 8 || num < 1)
        {
            System.out.println("\nThe number that you entered is invalid. Please try again.");
            System.out.print("Enter a valid number [1-8]: "); 
            num = in.nextInt();
        }
        return num;
    }

    public static char validateInput(char input)
    {
        while (input != 'N' && input != 'C')
        {
            System.out.println("\nYour input is invalid. Please try again.");
            System.out.print("Enter a valid input type [ N | C ]: "); 
            input = in.next().toUpperCase().charAt(0);
        }
        return input;
    }

    public static void quitProgram()
    {
        System.out.println("\nThank you for using this program! The program will now close.");
        System.exit(0);
    }
}