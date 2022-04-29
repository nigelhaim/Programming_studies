package Drafts;
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

    SATnode(String[] arr)
    { 
        array = arr;
        leftChild = null;
        rightChild = null;
    }
    SATnode(String data)
    {
        this.data = data;
    }  
}

class ArithmeticSyntaxTree
{
    public SATnode new_Tnode(SATnode node, String k)
    {
        node = new SATnode(k);
        return node;
    }

    /*public SATnode pushleftp(SATnode node)
    {
        return node.leftChild;
    }

    public SATnode pushoperator(SATnode node, String value)
    {
        if(node == null)
        {
            return new_Tnode(value);
        }
        return node.rightChild;
    }
    
    */
    int element_counter = 0;
    public SATnode pushArray(SATnode node, String[] value)
    {
        if(element_counter > value.length)
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
        /*if(value.equals("("))
        {
            SATnode new_node = new_null_Tnode();
            return new_node;
        }

        else if(value.equals("+") || value.equals("-") ||value.equals("*") || value.equals("/"))
        {
            if(node == null)
            {
                node.data = value;
            }
            SATnode new_node = new_null_Tnode();
            return new_node;
        }

        else if(value.equals(")"))
        {
            
        }
        else
        {
            if(node == null)
            {
                node.data = value;
                return node;
            }
        }*/
    }

    void inorderTraversal(SATnode node)
    {
        if(node == null)
        {
            System.out.print("null ");
            return;
        }

        System.out.print(node.data + " ");

        if(node.leftChild != null){
            inorderTraversal(node.leftChild);
        }
        if(node.rightChild != null){
            inorderTraversal(node.rightChild);
        }
    }
}
public class SyntaxArithmeticTree 
{    public static void main(String[] args)
    {
        String a = "((9+(8/2))-(3*4))";
        //String a = "(1+1)";
        String[] list = a.split("((?<=[+*/()!])|(?=[+*/()!]))|((?<=\\^)|(?=\\^))|([0-9]+(?<=[-])|(?=[-]))");
        ArithmeticSyntaxTree Tree = new ArithmeticSyntaxTree();
        SATnode root = new SATnode();
        int open_count = 0;

        Tree.pushArray(root, list);
        System.out.println();
        Tree.inorderTraversal(root);
    }    
}
