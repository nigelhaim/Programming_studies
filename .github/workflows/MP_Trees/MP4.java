/* ABUSAMAN, Farida A.
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

        while(temp_node !=null){
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
}

public class MP4
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        Tree rawTree = new Tree();
        Tnode root = null;
        boolean integer = false;
        boolean looping = true;
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

                    }
                    else if (num == 4)
                    {
                        System.out.print("Inorder: ");
                        rawTree.inorderTraversal(root);
                
                        System.out.print("\n" + "Preorder: ");
                        rawTree.preorderTraversal(root);
                
                        System.out.print("\n" + "Postorder: ");
                        rawTree.postorderTraversal(root);
                        System.out.println();
                    }
                    else if (num == 5)
                    {

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
                            root = rawTree.push(root, input);   
                        }
                    }
                    else if (num == 7)
                    {

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
        System.out.println("2. Create a Syntax Tree for an Arithmetic Expression");
        System.out.println("3. Display Binary Tree");
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