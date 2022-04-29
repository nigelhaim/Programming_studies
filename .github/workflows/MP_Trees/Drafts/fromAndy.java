package Drafts;

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


class ArithmeticSyntaxTree
{
    public SATnode new_Tnode(SATnode node, String k)
    {
        node = new SATnode(k);
        return node;
    }
    

}

public class fromAndy 
{
    public static void main(String[] args) 
    {
        //String a = "((9+(8/2))-(3*4))";
        String a = "(9+1)";
        String[] list = a.split("((?<=[+*/()!])|(?=[+*/()!]))|((?<=\\^)|(?=\\^))|([0-9]+(?<=[-])|(?=[-]))");
        ArithmeticSyntaxTree Tree = new ArithmeticSyntaxTree();

        int pharenthesis_counter = 0;
        for(int i = 0; i < list.length; i++)
        {
            String s = list[i];
            if(s.equals("("))
            {
                pharenthesis_counter++;
            }
        }
    }    
}
