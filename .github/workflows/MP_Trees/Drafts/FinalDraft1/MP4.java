/* 
 *ABUSAMAN, Farida A.
 * SEBASTIAN, Nigel Haim N.
 * 1CSA
 */

import java.util.*;
class SATnode
{
    String data;
    SATnode leftChild;
    SATnode rightChild;
    String[] array;
    SATnode(){
        data = null;
        leftChild = null;
        rightChild = null;
    }

    SATnode(String data)
    {
        this.data = data;
    }  
}
class Tree{
    boolean character;
    void make_character(boolean tf)
    {
        character = tf;
    }
    public SATnode new_node(String k){
        SATnode n_node  = new SATnode(k);
        return n_node;
    }

    public void search(SATnode node, String value)
    {
        if(node == null)
        {
            return;
        }
        int integer_val = Integer.parseInt(value);
        int data = Integer.parseInt(node.data);
        if(value.equals(node.data))
        {
            if(character)
            {
                System.out.print("Found node with the value of: " + (char)integer_val);
            }
            else 
            {
                System.out.print("Found node with the value of: " + value);
            }
        }
        else if(integer_val < data)
        {
            search(node.leftChild, value);
        }

        else if(integer_val > data)
        {
            search(node.rightChild, value);
        }

    }
    
    public SATnode push(SATnode node, String value){
        if(node == null){
            return new_node(value);
        }
        int integer_val = Integer.parseInt(value);
        int data = Integer.parseInt(node.data);
        if(integer_val < data){
            node.leftChild = push(node.leftChild, value);
        }
        else if(integer_val > data){
            node.rightChild = push(node.rightChild, value);
        }
        return node;
    }

    public SATnode pop(SATnode node, String value)
    {
        if(node == null){
            return null;
        }
        int integer_val = Integer.parseInt(value);
        int data = Integer.parseInt(node.data);
        
        if (integer_val < data){
            node.leftChild = pop(node.leftChild, value);
        }

        else if(integer_val > data){
            node.rightChild = pop(node.rightChild, value);
        }

        else {
            if(node.leftChild == null || node.rightChild == null){
                SATnode temp = null;
                temp = node.leftChild == null ? node.rightChild : node.leftChild;
                if(temp == null){
                    return null;
                }

                else{
                    SATnode successor = Successor(node);
                    node.data = successor.data;
                    node.rightChild = pop(node.rightChild, 4);
                    return node;
                }
            }   
        }
        return node;
    }

    public SATnode Successor(SATnode node){
        if(node == null){
            return null;
        }

        SATnode temp_node = node.rightChild;

        while(temp_node != null){
            temp_node = temp_node.leftChild;
        }
        return temp_node;
    }
    void data_printer(SATnode node)
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

    void inorderTraversal(SATnode node)
    {
        if(node == null){
            return;
        }
        inorderTraversal(node.leftChild);
        data_printer(node);
        inorderTraversal(node.rightChild);
        
    }

    void preorderTraversal(SATnode node)
    {
        if(node == null){
            return;
        }
        data_printer(node); 
        preorderTraversal(node.leftChild);
        preorderTraversal(node.rightChild);
    }

    void postorderTraversal(SATnode node)
    {
        if(node == null){
            return;
        }
        postorderTraversal(node.leftChild);
        postorderTraversal(node.rightChild);
        data_printer(node);
       
    }

    void node_printer_internalNodes(SATnode node)
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

    void node_printer_externalNodes(SATnode node)
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
    public int treeHeight(SATnode node)
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
    int element_counter = 0;
    public SATnode pushArray(SATnode node, String[] value)
    {
        if(element_counter >= value.length)
        {
            return node;
        }

        String s = value[element_counter];

        if(s.equals("("))
        {
            element_counter++;
            node.leftChild = new SATnode();
            pushArray(node.leftChild, value);
        }
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
        {
            element_counter++;
            node.data = s;
            node.rightChild = new SATnode();
            pushArray(node.rightChild, value);
        }   
        if(s.equals(")"))
        {
            element_counter++;
            return node;
        }
        if(!s.equals("("))
        {
            element_counter++;
            node.data = s;
            return node;
        }
        pushArray(node, value);
        return node;
    }

    public static int evaluation(SATnode node)
    {
        int result = 0;
        if(node.leftChild != null && node.rightChild != null)
        {
            return Integer.parseInt(node.data);
        }
        else
        {
            String op = node.data;
            int x = evaluation(node.leftChild);
            int y = evaluation(node.rightChild);

            switch(op)
            {
                case("+"): result = x + y; break;
                case("-"): result = x - y; break;
                case("*"): result = x * y; break;
                case("/"): result = x / y; break;
            }
        }
        return result;  
    }

}

public class MP4
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        Tree rawTree = new Tree();
        SATnode root = null;

        ArithmeticSyntaxTree SyntaxTree = new ArithmeticSyntaxTree();
        SATnode SATroot = new SATnode();
        boolean BSTexistence = false;
        boolean SATexistence = false;
        boolean bst = false;
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
                                BSTexistence = true;
                                bst = true;
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
                        System.out.print("Please input an algebric expression inside a closed Pharentheses\nExample: ((9+(8/2))*3+(3*4))\n");
                        System.out.print("Enter Expression: ");
                        String original = in.next();
                        String[] split = original.split("((?<=[+*/()!])|(?=[+*/()!]))|((?<=\\^)|(?=\\^))|([0-9]+(?<=[-])|(?=[-]))");
                        int open_count = 0;
                
                        LinkedList<String> list = new LinkedList<String>();
                
                        for(int i = 0; i < split.length; i++)
                        {
                            String add = split[i];
                            list.add(add);
                        }
                        System.out.println(list);
                        split = precedence(list);
                        SyntaxTree.pushArray(SATroot, split);
                        SATexistence = true;
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
                        if(BSTexistence)
                        {
                            System.out.print("Inorder: ");
                            rawTree.inorderTraversal(root);
                    
                            System.out.print("\n" + "Preorder: ");
                            rawTree.preorderTraversal(root);
                    
                            System.out.print("\n" + "Postorder: ");
                            rawTree.postorderTraversal(root);
                            System.out.println();
                        }

                        else if(SATexistence)
                        {
                            System.out.print("Inorder: ");
                            SyntaxTree.inorderTraversal(SATroot);
                    
                            System.out.print("\n" + "Preorder: ");
                            SyntaxTree.preorderTraversal(SATroot);
                    
                            System.out.print("\n" + "Postorder: ");
                            SyntaxTree.postorderTraversal(SATroot);
                            System.out.println();
                            System.out.println("The result of the arithmetic expression: " + SyntaxTree.evaluation(SATroot));
                        }

                        else
                        {
                            System.out.print("Tree doesn't exist! \nPlease create a tree");
                            continue;
                        }
                    }
                    else if (num == 5 && BSTexistence)
                    {
                        if(bst)
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
                    }
                    else if (num == 6 && BSTexistence)//Insert a Node in BST
                    {
                        if(integer)
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
                    }
                    else if (num == 7 && BSTexistence)
                    {
                        if(bst)
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


    public static String[] precedence(LinkedList<String> list)
    {
        String[] output = new String[list.size()];
        list.removeFirst();
        list.removeLast();
        int in_count = 0;  
        boolean left = false;
        boolean right = false;
        int counter = 0;
        boolean last = false;
        for(int j = 0; j < list.size(); j++)
        {
            String a = list.get(j);
            if(a.equals("("))
            {
                in_count++;
            }
            else if(a.equals(")"))
            {
                in_count--;
            }

            //if((a.equals("*") || a.equals("/")) && (!(list.get(j+3).equals("(")) || (list.get(j+3).equals("+") || (list.get(j+3).equals("-")))) && (in_count == 0))
            if((a.equals("*") || a.equals("/")) && (!(list.get(j+2).equals("("))) && (in_count == 0) && (last == false))
            {
                left = true;
                break;
            }

            if((a.equals("+") || a.equals("-")) && (!(list.get(j+2).equals("("))) && (in_count == 0) && (last == false))
            {
                right = true;
                break;
            }
            counter++;
        }

        if(left)
        {
            list.addFirst("(");
            list.add(counter+3, ")");
            list.addFirst("(");
            list.addLast(")");
        }
        else if(right)
        {
            list.addLast(")");
            list.add(counter+1, "(");
            list.addFirst("(");
            list.addLast(")");
        }

        for(int f = 0; f < output.length; f++)
        {
            String s = list.get(f);
            output[f] = s;
        }
        return output;
    }
}
/*Tasks:
    Make Binary Search Tree
    Make Arithmetic Syntax tree
    Print Trees*/