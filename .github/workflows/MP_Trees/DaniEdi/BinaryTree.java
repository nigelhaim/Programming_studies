// Edison J. Javier III Sophia Durana 1CSA  MP 4 - BINARY TREE

import java.util.*;

public class BinaryTree
{
    static Scanner in = new Scanner(System.in);
    
    static StringBuilder sb = new StringBuilder();
    
    public static class Node
    {
        String data;
        Node left;
        Node right;
        
        Node(String data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public Node key;
    public BinaryTree()
    {
        this.key = null;
    }
    
    public static void main(String[] args) 
    {
        String input;
        boolean isBST = true;
        
        System.out.print("This program will operate with the available "
                + "functions in the Menu down below:\n");
        // display menu
        printMenu();
        input = in.nextLine();
        
        BinaryTree bt = new BinaryTree();
        BinaryTree st = new BinaryTree();
        while(!input.equals("8"))
        {
            switch(input)
            {
				// 1. Create a Binary Search Tree (BST)
                case "1": if(!bt.bstDeleter())
                              break;
                          isBST = true;
                          
                          String binary;
                          System.out.print("Input the values of tree (ex."
                          + "5 1 2 3... || Only letters or integers): ");
                          binary = in.nextLine();
                          String[] listB = binary.split(" ");
                          
                          for(int i = 0; i < listB.length; i++)
                          {
                              if(bt.validator(listB[i], "b"))
                                  bt.createBinaryTree(listB[i]);
                              else
                              {
                                  boolean flag = false;
                                  String newInput = "";
                                  while(flag != true)
                                  {
                                      System.out.print("Type again the correct"
                                              + " value: ");
                                      newInput = in.nextLine();
                                      flag = bt.validator(newInput, "b");
                                  }
                                  bt.createBinaryTree(newInput);
                              }
                          }
                          
                          System.out.println();
                          break;
                
				// 2. Create a Syntax Tree for an Arithmetic Expression		
                case "2": if(!st.bstDeleter())
                              break;
                          isBST = false;
                          String syntax;
                          System.out.print("Input the values of tree (ex."
                          + "1+2-3 || Only integers and operators): ");
                          syntax = in.nextLine();
                          char chList[] = syntax.toCharArray();
                          /*
                          for(int i = 0; i < chList.length; i++)
                          {
                              String ch = Character.toString(chList[i]);
                              System.out.println(ch);
                              if(!st.validator(ch, "s"))
                              {
                                  boolean flag = false;
                                  String newInput = "";
                                  while(flag != true)
                                  {
                                      System.out.print("Type again the correct"
                                              + " value: ");
                                      newInput = in.nextLine();
                                      flag = st.validator(newInput, "s");
                                  }
                                  chList[i] = newInput.charAt(0);
                              }
                          }*/
                          
                          syntax = st.postfixConverter(chList);
                          System.out.println(syntax);
                          
                          st.createSyntaxTree(syntax);
                          break;
                
				// 3. Display Binary Tree				
                case "3": String type1;
                          System.out.print("What kind of tree did you make (B for BST | S for "
                                  + "Syntax Tree): ");
                          type1 = (in.nextLine()).toLowerCase();
                          if(type1.equals("b") && bt.treeChecker(type1))
                          {
                              System.out.println("This is the tree diagram: ");
                              bt.printTree(type1);    
                          }
                          else if(type1.equals("s") && st.treeChecker(type1))
                          {
                              System.out.println("This is the tree diagram: ");
                              //st.printTree(this.key);
                          }
                          System.out.println();
                          
                          break;
                
				// 4. Traverse a Binary Tree				
                case "4": String type2;
                          System.out.print("What kind of tree did you make (B for BST | S for "
                                  + "Syntax Tree): ");
                          type2 = (in.nextLine()).toLowerCase();
                          if(type2.equals("b") && bt.treeChecker(type2))
                              bt.traverseBinaryTree(type2);
                          else if(type2.equals("s") && st.treeChecker(type2))
                              st.traverseBinaryTree(type2);
                          System.out.println();
                          break;
                
				// 5. Search a Node in BST				
                case "5": if(bt.treeChecker("b"))
                          {
                              ifFalseBST(isBST);
                              if(bt.searchBinaryTreeNode())
                                  System.out.println("Node has been found as it"
                                          + " exists in the BST");
                              else
                                  System.out.println("Node has not been found as it"
                                          + " doesn't exist in the BST");
                              break;
                          }
                
                          else
                              break;
                
				// 6. Insert a Node in BST
                case "6": if(bt.treeChecker("b"))
                          {
                              ifFalseBST(isBST);
                              String str;
                              System.out.print("Input something to insert to the"
                                      + " tree: ");
                              str = in.nextLine();
                              if(bt.validator(str, "b"))
                                  bt.insertBinaryTreeNode(str);
                              else
                              {
                                  boolean flag = false;
                                  String newInput = "";
                                  while(flag != true)
                                  {
                                      System.out.print("Type again the correct"
                                              + " value: ");
                                      newInput = in.nextLine();
                                      flag = bt.validator(newInput, "b");
                                  }
                                  bt.insertBinaryTreeNode(newInput);
                              }
                              break;   
                          }
                          
                          else
                              break;
                
				// 7. Delete a Node in BST
                case "7": if(bt.treeChecker("b"))
                          {
                              ifFalseBST(isBST);
                              if(bt.deleteBinaryTreeNode())
                                  System.out.println("Node has been deleted");
                              else
                                  System.out.println("Node can't be deleted from "
                                          + "the BST for it does not exist");
                              break;
                          }
                          
                          else
                              break;
                
                // if input is more than 7
                default: System.out.print("Invalid input - Try again\n"); 
            }
            
            printMenu();
            input = in.nextLine();
        }
        
        if(input.equals("8")) // end the program
        {
            System.out.println("\nGoodbye! Program has ended\n");
            System.exit(0);
        }
        
        System.out.println();
    }

    // prints menu instructions
    public static void printMenu()
    {
        System.out.print("\n\t\t\tMenu \n====================================="
                + "================= \n\n1. Create a Binary Search Tree (BST)"
                + "\n2. Create a Syntax Tree for an Arithmetic Expression \n3."
                + " Display Binary Tree \n4. Traverse Binary Tree \n5. Search a"
                + " Node in BST \n6. Insert a Node in BST \n7. Delete a Node in"
                + " BST \n8. Quit \n\nHello! What operation in the menu would "
                + "you like to execute (1-8): ");
    }
    
    public void createBinaryTree(String s)
    {
        this.key = insertBinaryNode(key, capitalizer(s));
        printLeafNodes(key);
    }
    
    public static Node insertBinaryNode(Node key, String data)
    {
        char c = ' ';
        int num = 0;
        if(data.charAt(0) >= 'A' && data.charAt(0) <= 'Z')
            c = data.charAt(0);
        else
            num = Integer.parseInt(data);
            
        if(key == null)
        {
            key = new Node(data);
            return key;
        }
        
        else if(c <= key.data.charAt(0) || num <= Integer.parseInt(key.data))
            key.left = insertBinaryNode(key.left, data);
        
        else
            key.right = insertBinaryNode(key.right, data);
        
        return key;
    }
    
    public boolean bstDeleter()
    {
        String ans;
        if(key != null)
        {
            System.out.print("Do you want to clear the existing tree?: ");
            ans = (in.nextLine()).toLowerCase();
            if(ans.equals("y"))
               this.key = null;
            else if(ans.equals("n"))
                return false;
        }
        
        return true;
    }
    
    public boolean syntaxTreeDeleter()
    {
        String ans;
        if(key != null)
        {
            System.out.print("Do you want to clear the existing tree?: ");
            ans = (in.nextLine()).toLowerCase();
            if(ans.equals("y"))
               this.key = null;
            else if(ans.equals("n"))
                return false;
        }
        
        return true;
    }
    
    public String postfixConverter(char[] c)
    {
        String str = "";
        Stack<Character> s = new Stack<>();
        
        for(int i = 0; i < c.length; i++)
        {
            // add to returning String if it's an operand
            if((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= '0' && c[i] <= '9'))
            {
                str += c[i];
            }
            
            // push if '('
            else if(c[i] == '(')
            {
                s.push(c[i]);
            }
            
            // pop the contents of stack if ')'
            else if(c[i] == ')')
            {
                //char temp = s.pop();
                while(!s.isEmpty() && s.peek() != '(')
                {
                    str += s.pop();
                    //temp = s.pop();
                }
                s.pop();
            }
            
            // for the operators
            else //if(c[i] == '+' || c[i] == '-' || c[i] == '*' || c[i] == '/' || c[i] == '%')
            {
                while(s.isEmpty() == false && !(s.peek() == '(') && precedence(s.peek()) >= precedence(c[i]))
                    str += s.pop();  
                s.push(c[i]);
            }
        }
        
        // pop the remaining content
        while(!s.isEmpty())
            str += s.pop();
            
        return str;
    }
    
    // this method will determine the precedence
    public static int precedence(char c)  
    {
        if(c == '+' || c == '-')
            return 1;  
        else if (c == '*' || c == '/' || c == '%')
            return 2;
        else if(c == '^')
            return 3;
        
        return 0;  
    }  
    
    public void createSyntaxTree(String postfix)
    {
        this.key = insertSyntaxNode(postfix);
    }
    
    public Node insertSyntaxNode(String data)
    {
        Stack<Node> syntax = new Stack<>();
        Node keyTemp, a, b;
        
        for(int i = 0; i < data.length(); i++)
        {
            String d = Character.toString(data.charAt(i));
            if(!operatorChecker(d))
            {
                keyTemp = new Node(d);
                syntax.push(keyTemp);
            }
        
            else
            {
                keyTemp = new Node(d);
                a = syntax.pop();
                b = syntax.pop();
            
                keyTemp.left = b;
                keyTemp.right = a;
            
                syntax.push(keyTemp);
            }
        }
        
        keyTemp = syntax.pop();
        return keyTemp;
    }
    
    // pang print lang to check
    public static void printLeafNodes(Node node) 
    {
        // base case 
        if (node == null)
            return;
        if (node.left == null && node.right == null)
            System.out.print(node.data + " ");
        
        printLeafNodes(node.left); 
        printLeafNodes(node.right); 
    }
    
    public void print() 
    {
        traversePreOrder(sb, "", "", key);
        System.out.println(sb.toString());
    }
    
    public static void traversePreOrder(StringBuilder sb, String padding, String pointer, Node key) 
    {
        if(key != null) 
        {
            sb.append(padding);
            sb.append(pointer);
            sb.append(key.data);
            sb.append("\n");

            StringBuilder paddingBuilder = new StringBuilder(padding);
            paddingBuilder.append("│  ");

            String paddingForBoth = paddingBuilder.toString();
            String pointerForRight = "└──";
            String pointerForLeft = (key.right != null) ? "├──" : "└──";

            traversePreOrder(sb, paddingForBoth, pointerForLeft, key.left);
            traversePreOrder(sb, paddingForBoth, pointerForRight, key.right);
        }
    }
    
    public void traverseBinaryTree(String s)
    {
        if(s.equals("b"))
        {
            System.out.print("Preorder sequence: ");
            preorder(this.key);
            System.out.print("\nInorder sequence: ");
            inorder(this.key);
            System.out.print("\nPostorder sequence: ");
            postorder(this.key);
        }
        
        else if(s.equals("s"))
            System.out.print("This is the result of the arithmetic "
                    + "expression: " + arithmeticSyntax(this.key));
    }
    
    public static void preorder(Node key)
    {
        if(key == null)
            return;
        
        else
        {
            System.out.print(key.data + " ");
            preorder(key.left);
            preorder(key.right);
        }
    }
    
    public static void inorder(Node key)
    {
        if(key == null)
            return;
        
        else
        {
            preorder(key.left);
            System.out.print(key.data + " ");
            preorder(key.right);
        }
    }
    
    public static void postorder(Node key)
    {
        if(key == null)
            return;
        
        else
        {
            preorder(key.left);
            preorder(key.right);
            System.out.print(key.data + " ");
        }
    }
    
    public double arithmeticSyntax(Node key)
    {
        if(key == null)
            return 0;
        
        if(key.left == null && key.right == null)
            return Double.parseDouble(key.data);
        
        double a = arithmeticSyntax(key.left);
        double b = arithmeticSyntax(key.right);
        
        double ans;
        
        if(key.data.equals("+"))
            return ans = a + b;
        if(key.data.equals("-"))
            return ans = a - b;
        if(key.data.equals("*"))
            return ans = a * b;

        return ans = a / b;
    }
    
    // prints message when BST is non-existent
    public static void ifFalseBST(boolean flag) 
    {
        if(flag == false)
        {
            System.out.print("\nThe tree is not a BST \nKindly create one"
		+ "first by selecting option (1) from the Menu");
            return;
        }
        else
            return;
    }    
    
    public boolean searchBinaryTreeNode()
    {
        String searcher;
        System.out.print("Type the key you are searching for: ");
        searcher = in.nextLine();
        this.key = searchNode(key, searcher);
        if(key != null)
            return true;
        else
            return false;
    }
    
    public Node searchNode(Node key, String searcher)
    {
        char c = ' ';
        int num = 0;
        if(searcher.charAt(0) >= 'A' && searcher.charAt(0) <= 'Z')
            c = searcher.charAt(0);
        else
            num = Integer.parseInt(searcher);
        
        if(key == null)
            return key;
        if(key.data.equals(searcher))
            return key;
        if(key.data.charAt(0) > c || Integer.parseInt(key.data) > num)
            return searchNode(key.left, searcher);
        
        return searchNode(key.right, searcher);
    }
    
    public void insertBinaryTreeNode(String s)
    {
        this.key = insertBinaryNode(key, capitalizer(s));
    }
    
    public boolean deleteBinaryTreeNode()
    {
        String deleter;
        System.out.print("Type the node you wish to delete: ");
        deleter = in.nextLine();
        this.key = deleteNode(key, deleter);
        if(key != null)
            return true;
        else
            return false;
    }
	
    public Node deleteNode(Node key, String deleter)
    {
        char c = ' ';
        int num = 0;
        if(deleter.charAt(0) >= 'A' && deleter.charAt(0) <= 'Z')
            c = deleter.charAt(0);
        else
            num = Integer.parseInt(deleter);
        
        if(key == null)
            return key;
            
        if(key.data.charAt(0) < c || Integer.parseInt(deleter) < num)
            key.right = deleteNode(key.right, deleter);
        else if(key.data.charAt(0) > c || Integer.parseInt(deleter) > num)
            key.left = deleteNode(key.left, deleter);
        else if(key.data.equals(deleter))
	{
            // if there's no child
            if(key.right == null && key.left == null)
                return null;
            // only 1 child
            if(key.left == null && key.right != null)
                return key.right;
            else if(key.right == null && key.left != null)
                return key.left;
            else
                // has 2 children
                key.data = inorderScan(key.right); // to get the min value
		key.right = deleteNode(key.right, key.data);
	}
		
            return key;
    }
    
    public String inorderScan(Node key) 
    {
        String min = key.data;
        
        while(key.left != null)
        {
            min = key.left.data;
            key = key.left;
		}
	
        return min;
    }
    
    public String capitalizer(String s)
    {
        String capital = s.toUpperCase();
        return capital;
    }
    
    public boolean validator(String input, String type)
    {
        char ch = capitalizer(input).charAt(0);
        
        if(type.equals("b"))
        {   
            if(input.charAt(0) >= '0' && input.charAt(0) <= '9')
                try
                {
                    Integer.parseInt(input);
                    return true;
                }
                catch(NumberFormatException nfe)
                {
                    System.err.println("Node data can only be an integer - "
                            + "Try again");
                    return false;
                }
            
            else if(!(input.charAt(0) >= 'A' && input.charAt(0) <= 'Z'))
            {
                try
                {
                    throw new InputMismatchException();
                }
                catch(InputMismatchException ime)
                {
                    System.err.println("Node data can only be a letter from"
                            + " A to Z - Try again");
                    return false;
                }
            }
        }
        
        else if(type.equals("s"))
        {
            if((operatorChecker(input)))// || (ch >= '0' && ch <= '9'))
            {
                try
                {
                    throw new InputMismatchException();
                }
                catch(InputMismatchException ime)
                {
                    System.err.println("Node data can only be an integer or an"
                            + " arithmetic operator (+, -, *, /) - Try again");
                    return false;
                }
            }
            else
                return true;
        }
        
        return true;
    }
    
    public boolean operatorChecker(String input)
    {
        char c = input.charAt(0);
        if(c == '+' || c == '-')
            return true;
        else if(c == '*' || c == '/')
            return true;
        
        return false;
    }
    
    public boolean treeChecker(String s)
    {
        s = s.toLowerCase();
        
        if(this.key == null)
        {
            if(s.equals("b"))
            {
                System.out.print("\nBinary Tree does not exist \nKindly create "
                        + "one first by selecting option (1) from the Menu");
                return false;
            }
                
            else if(s.equals("s"))
            {
                System.out.print("\nSyntax Tree does not exist \nKindly create "
                        + "one first by selecting option (2) from the Menu");
                return false;
            }
        }
        
        return true;
    }
	

    public void formatTree(Node root){
        if(root == null)
        {
            return;    
        }
         Queue<Node> level  = new LinkedList<>();
         level.add(root);
         while(!level.isEmpty()){
             Node node = level.poll();
             System.out.print(node.data + " ");
             if(node.left!= null)
                level.add(node.left);
             if(node.right!= null)
                level.add(node.right);  
         }
         System.out.println();
    }
	
	public void printTree(String s) {
		if (s.equals("b")) {
			formatTree(this.key);
		}
	}
}
