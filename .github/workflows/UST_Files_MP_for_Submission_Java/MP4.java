package Drafts;

import java.util.*;
import Drafts.TreePrinter.PrintableNode;

//https://www.youtube.com/watch?v=81PpYQ0AN_w&list=PLt4nG7RVVk1jqwwQUTByTcTcHxIlMllfy                                                                                                                                                                                                                                                                          
class Tnode implements PrintableNode
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
        return Integer.toString(data);
    }
}

class Tree{
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

    void inorderTraversal(Tnode node)
    {
        if(node == null){
            return;
        }
        inorderTraversal(node.leftChild);
        System.out.print(node.data + " ");
        inorderTraversal(node.rightChild);
        
    }

    void preorderTraversal(Tnode node)
    {
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");        
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
        System.out.print(node.data + " "); 
       
    }

    public void search(Tnode node, int value)
    {
        if(node == null)
        {
            return;
        }
        if(value == node.data)
        {
            System.out.print("Found " + value);
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

    void tree_printer(Tnode node)
    {
        if(node == null)
        {
            return;
        }
        if(node != null)
        {
            System.out.println(node.data);
        }
        if(node.leftChild != null)
        {
            System.out.print(node.leftChild.data);
        }
        if(node.rightChild != null)
        {
            System.out.println(node.rightChild.data);
        } 
    }

    void node_printer(Tnode node)
    {
        if(node.leftChild != null || node.rightChild != null)
        {
            System.out.print(node.data + " ");
            if(node.leftChild != null)
            {
                node_printer(node.leftChild);
            }
            if(node.rightChild != null)
            {
                node_printer(node.rightChild);
            }

        }

        /*if(node.leftChild != null || node.rightChild != null)
        {
            System.out.print(node.data);
            if(node.leftChild != null && node.rightChild != null)
            {
                node_printer(node.rightChild);
            }

        }*/
    }

    void node_printer_external(Tnode node)
    {
        if(node.leftChild == null && node.rightChild == null)
        {
            System.out.print(node.data + " ");
        }
        if(node.leftChild != null)
        {
            node_printer_external(node.leftChild); 
        }
        if(node.rightChild != null)
        {
            node_printer_external(node.rightChild);   
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

    /*void printTree(Tnode node)
    {
        if(node == null)
        {return;}

        if(node != null)
        {
            if(node.leftChild != null)
            {
                System.out.print(node.leftChild.data);
            }
            if(node.rightChild != null)
            {
                System.out.print(node.rightChild.data);
            }

            printTree(node.leftChild);
            printTree(node.rightChild);
            
            if(node.leftChild != null)
            {
                printTree(node.leftChild);

            }
            if(node.rightChild != null)
            {
                printTree(node.rightChild);
            }
        }
    }*/
    public String space(int num)
    {
        String s = "";

        for(int i = 0; i < num; i++)
        {
            s += "*";
        }
        return s;
    }

    public void printTree(Tnode tmpRoot, String space) {

        Queue<Tnode> currentLevel = new LinkedList<Tnode>();
        Queue<Tnode> nextLevel = new LinkedList<Tnode>();

        currentLevel.add(tmpRoot);

        while (!currentLevel.isEmpty()) {
            Iterator<Tnode> iter = currentLevel.iterator();
            while (iter.hasNext()) {
                Tnode currentNode = iter.n  ext();
                if (currentNode.leftChild != null) {
                    nextLevel.add(currentNode.leftChild);
                }
                if (currentNode.rightChild != null) {
                    nextLevel.add(currentNode.rightChild);
                }
                System.out.print(currentNode.data + " ");
            }
            System.out.println();
            currentLevel = nextLevel;
            nextLevel = new LinkedList<Tnode>();

        }



    }
}
public class TreePrinter
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
    public static void print(PrintableNode root)
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
                            c = (line.get(j) != null) ? '|' : '<';
                        } else {
                            if (j < line.size() && line.get(j) != null) c = '>';
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
                            System.out.print(j % 2 == 0 ? " " : "─");
                        }
                        System.out.print(j % 2 == 0 ? "┌" : "┐");
                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? "─" : " ");
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

public class MP4 
{
    public static void main(String[] args)
    {
        Tree a = new Tree();
        Tnode root = null;
        root = a.push(root, 10);   
        root = a.push(root, 13);        
        root = a.push(root, 7);
        root = a.push(root, 11);
        root = a.push(root, 20);
        root = a.push(root, 6);
        root = a.push(root, 8);
        root = a.push(root, 1);
        root = a.push(root, 9);
        root = a.push(root, 14);
        root = a.push(root, 22);

        /*System.out.print("Inorder: ");
        a.inorderTraversal(root);

        System.out.print("\n" + "Preorder: ");
        a.preorderTraversal(root);

        System.out.print("\n" + "Postorder: ");
        a.postorderTraversal(root);

        a.search(root, 20);

        System.out.println();
        System.out.println();

        //a.tree_printer(root);*/
        //a.node_printer(root);
        a.preorderTraversal(root);
        TreePrinter mike = new TreePrinter();
        System.out.println();
        int height = a.treeHeight(root);
        String space = a.space(height);
        // System.out.print(space);
        System.out.print(root.data);
        System.out.println();
        mike.print(root);
        //a.node_printer_external(root);
        //System.out.println();
        //System.out.println(a.treeHeight(root));
    }
}
