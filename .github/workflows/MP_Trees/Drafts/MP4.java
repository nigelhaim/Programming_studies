package Drafts;

//https://www.youtube.com/watch?v=81PpYQ0AN_w&list=PLt4nG7RVVk1jqwwQUTByTcTcHxIlMllfy                                                                                                                                                                                                                                                                          
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
}

public class MP4 
{
    public static void main(String[] args)
    {
        Tree a = new Tree();
        Tnode root = null;
        root = a.push(root, 10);   
        root = a.push(root, 11);        
        root = a.push(root, 7);
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
        a.node_printer(root);
        System.out.println();
        a.node_printer_external(root);
        System.out.println();
        System.out.println(a.treeHeight(root));
    }
}
