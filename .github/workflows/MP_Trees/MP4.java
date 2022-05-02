/* 
 *ABUSAMAN, Farida A.
 * SEBASTIAN, Nigel Haim N.
 * 1CSA
 */

import java.util.*;



class Tnode implements TreePrinter.PrintableNode
{
    Tnode leftChild;
    Tnode rightChild;
    int data;
    boolean character; 
    Tnode(int data)
    {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }
    public void setCharacter(){
        character = true;
    }
    @Override
    public Tnode getLeft() {
        return leftChild;
    }  

    @Override
    public Tnode getRight() {
        return rightChild;
    }

    @Override
    public String getText() {
        if(character)
        {
            char r = (char)data;
            return Character.toString(r);
        }
        else 
        {
            return Integer.toString(data);
        }
    }
}
class SATnode implements SATreePrinter.SATPrintableNode
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

    @Override
    public SATnode getLeft() {
        return leftChild;
    }  

    @Override
    public SATnode getRight() {
        return rightChild;
    }

    @Override
    public String getText() {
        return data;
    }
}
class ArithmeticSyntaxTree
{
    public SATnode new_Tnode(SATnode node, String k)
    {
        node = new SATnode(k);
        return node;
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

    void inorderTraversal(SATnode node)
    {
        if(node.leftChild != null){
            inorderTraversal(node.leftChild);
        }

        if(node.data != null);
        { 
            System.out.print(node.data + " ");
        }

        if(node.rightChild != null){
            inorderTraversal(node.rightChild);
        }
    }

    void preorderTraversal(SATnode node)
    {
        if(node.data != null);
        { 
            System.out.print(node.data + " ");
        }
        if(node.leftChild != null){
            inorderTraversal(node.leftChild);
        }
        if(node.rightChild != null){
            inorderTraversal(node.rightChild);
        }
    }

    void postorderTraversal(SATnode node)
    {
        if(node.leftChild != null){
            inorderTraversal(node.leftChild);
        }
        if(node.rightChild != null){
            inorderTraversal(node.rightChild);
        }
        if(node.data != null);
        { 
            System.out.print(node.data + " ");
        }
    }

    public static int evaluation(SATnode node)
    {
        int result = 0;
        if(node.leftChild == null && node.rightChild == null){
            return Integer.parseInt(node.data);
        }
        else
        {
            String op = node.data;
            if(node.leftChild != null && node.rightChild != null)
            {
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
        }
        return result;  
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
        if(node == null)
        {
            return;
        }
        if(node.leftChild != null && node.rightChild != null)
        {
            System.out.print(node.data + " ");
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

        ArithmeticSyntaxTree SyntaxTree = new ArithmeticSyntaxTree();
        SATnode SATroot = new SATnode();
        boolean BSTexistence = false;
        boolean SATexistence = false;
        boolean bst = false;
        boolean integer = false;
        boolean character = false;
        boolean looping = true;
        int number_of_nodes = 0;
        TreePrinter printer = new TreePrinter();
        SATreePrinter SATprinter = new SATreePrinter();
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
                                    character = true;
                                    root.setCharacter();
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
                        System.out.print("Please input an algebric expression inside a closed Pharentheses\nExample: (((9+(8/2))*3)+(3*4))\n");
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
                        SyntaxTree.pushArray(SATroot, split);
                        SATexistence = true;
                    }
                    else if (num == 3)
                    {
                        if(BSTexistence)
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
                            printer.print(root);    
                        }

                        else if(SATexistence)
                        {
                            SATprinter.print(SATroot);
                        }
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
                            number_of_nodes++;
                        }

                        else if(character)
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
                        else if (!integer && !character)
                        {
                            System.out.println("Please make a Binary Search Tree or Arithmetic Syntax tree  first");
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
        System.out.println(list);
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
            if((a.equals("*") || a.equals("/")) && (!list.get(j-1).equals(")")) && (!list.get(j+1).equals("(")))
            {
                list.add(counter - 1, "(");
                list.add(counter + 3, ")");
                list.addFirst("(");
                list.addLast(")");
                break;
            }
            else if((a.equals("*") || a.equals("/")) && (in_count == 0) && !(list.get(j-1).equals(")") || list.get(j+1).equals("(")))
            {
                list.add(counter + 2,")");
                list.add(counter - 2, "(");
                list.addFirst("(");
                list.addLast(")");
                break;
            }

            else if((a.equals("*") || a.equals("/")) && (list.get(j+2).equals("(") || list.get(j-1).equals(")")) && (in_count == 0))
            {
                list.addFirst("(");
                list.add(counter + 3, ")");
                list.addFirst("(");
                list.addLast(")");
                break;
            }

            else if((a.equals("*") || a.equals("/")) && (list.get(j+1).equals("(") && list.get(j-3).equals(")")) && (in_count == 0))
            {
                list.addLast(")");;
                list.add(counter - 1, "(");
                list.addFirst("(");
                list.addLast(")");
                break;
            }
            counter++;
        }
        for(int i = 0; i < output.length; i++)
        {
            output[i] = list.get(i);
        }
        return output;
    }
}
class TreePrinter
{
    /** Node that can be printed */
    public interface PrintableNode
    {
        /** Get left child */
        Tnode getLeft();


        /** Get right child */
        Tnode getRight();


        /** Get text to be printed */
        String getText();
    }


    /**
     * Print a tree
     * 
     * @param root
     *            tree root node
     */
    public static void print(Tnode root)
    {
        List<List<String>> lines = new ArrayList<List<String>>();

        List<PrintableNode> level = new ArrayList<PrintableNode>();
        List<PrintableNode> next = new ArrayList<PrintableNode>();

        level.add(root);
        int nn = 1;

        int widest = 0;

        while (nn != 0) {
            List<String> line = new ArrayList<String>();

            nn = 0;

            for (PrintableNode n : level) {
                if (n == null) {
                    line.add(null);

                    next.add(null);
                    next.add(null);
                } else {
                    String aa = n.getText();
                    line.add(aa);
                    if (aa.length() > widest) widest = aa.length();

                    next.add(n.getLeft());
                    next.add(n.getRight());

                    if (n.getLeft() != null) nn++;
                    if (n.getRight() != null) nn++;
                }
            }

            if (widest % 2 == 1) widest++;

            lines.add(line);

            List<PrintableNode> tmp = level;
            level = next;
            next = tmp;
            next.clear();
        }

        int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            int hpw = (int) Math.floor(perpiece / 2f) - 1;

            if (i > 0) {
                for (int j = 0; j < line.size(); j++) {

                    // split node
                    char c = ' ';
                    if (j % 2 == 1) {
                        if (line.get(j - 1) != null) {
                            c = (line.get(j) != null) ? '|' : '+';
                        } else {
                            if (j < line.size() && line.get(j) != null) c = '+';
                        }
                    }
                    System.out.print(c);

                    // lines and spaces
                    if (line.get(j) == null) {
                        for (int k = 0; k < perpiece - 1; k++) {
                            System.out.print(" ");
                        }
                    } else {

                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? " " : "-");
                        }   
                        System.out.print(j % 2 == 0 ? "+" : "+");
                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? "-" : " ");
                        }
                    }
                }
                System.out.println();
            }

            // print line of numbers
            for (int j = 0; j < line.size(); j++) {

                String f = line.get(j);
                if (f == null) f = "";
                int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
                int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);

                // a number
                for (int k = 0; k < gap1; k++) {
                    System.out.print(" ");
                }
                System.out.print(f);
                for (int k = 0; k < gap2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            perpiece /= 2;
        }
    }
}

class SATreePrinter
{
    /** Node that can be printed */
    public interface SATPrintableNode
    {
        /** Get left child */
        SATnode getLeft();


        /** Get right child */
        SATnode getRight();


        /** Get text to be printed */
        String getText();
    }


    /**
     * Print a tree
     * 
     * @param root
     *            tree root node
     */
    public static void print(SATnode root)
    {
        List<List<String>> lines = new ArrayList<List<String>>();

        List<SATPrintableNode> level = new ArrayList<SATPrintableNode>();
        List<SATPrintableNode> next = new ArrayList<SATPrintableNode>();

        level.add(root);
        int nn = 1;

        int widest = 0;

        while (nn != 0) {
            List<String> line = new ArrayList<String>();

            nn = 0;

            for (SATPrintableNode n : level) {
                if (n == null) {
                    line.add(null);

                    next.add(null);
                    next.add(null);
                } else {
                    String aa = n.getText();
                    line.add(aa);
                    if (aa.length() > widest) widest = aa.length();

                    next.add(n.getLeft());
                    next.add(n.getRight());

                    if (n.getLeft() != null) nn++;
                    if (n.getRight() != null) nn++;
                }
            }

            if (widest % 2 == 1) widest++;

            lines.add(line);

            List<SATPrintableNode> tmp = level;
            level = next;
            next = tmp;
            next.clear();
        }

        int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            int hpw = (int) Math.floor(perpiece / 2f) - 1;

            if (i > 0) {
                for (int j = 0; j < line.size(); j++) {

                    // split node
                    char c = ' ';
                    if (j % 2 == 1) {
                        if (line.get(j - 1) != null) {
                            c = (line.get(j) != null) ? '|' : '!';
                        } else {
                            if (j < line.size() && line.get(j) != null) c = '+';
                        }
                    }
                    System.out.print(c);

                    // lines and spaces
                    if (line.get(j) == null) {
                        for (int k = 0; k < perpiece - 1; k++) {
                            System.out.print(" ");
                        }
                    } else {

                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? " " : "-");
                        }   
                        System.out.print(j % 2 == 0 ? "!" : "!");
                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? "-" : " ");
                        }
                    }
                }
                System.out.println();
            }

            // print line of numbers
            for (int j = 0; j < line.size(); j++) {

                String f = line.get(j);
                if (f == null) f = "";
                int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
                int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);

                // a number
                for (int k = 0; k < gap1; k++) {
                    System.out.print(" ");
                }
                System.out.print(f);
                for (int k = 0; k < gap2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            perpiece /= 2;
        }
    }
}