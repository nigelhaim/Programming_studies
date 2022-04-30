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

    public static int evaluation(SATnode node)
    {
        int result = 0;
        if(node.leftChild == null && node.rightChild == null)
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
public class SyntaxArithmeticTree 
{    public static void main(String[] args)
    {
        String original = "((9+(8/2))*3+(3*4))";
        String[] split = original.split("((?<=[+*/()!])|(?=[+*/()!]))|((?<=\\^)|(?=\\^))|([0-9]+(?<=[-])|(?=[-]))");
        ArithmeticSyntaxTree Tree = new ArithmeticSyntaxTree();
        SATnode root = new SATnode();
        int open_count = 0;

        LinkedList<String> list = new LinkedList<String>();

        for(int i = 0; i < split.length; i++)
        {
            String add = split[i];
            list.add(add);
        }
        System.out.println(list);
        //split = precedence(list);
        Tree.pushArray(root, split);
        System.out.println();
        Tree.inorderTraversal(root);
        System.out.println();
        System.out.println(Tree.evaluation(root));
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
