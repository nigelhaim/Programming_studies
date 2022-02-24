
class Stack 
{

    private int Max_val;
    private char[] sArr;
    private int top;

    Stack(int s) 
    {
        Max_val = s;
        sArr = new char[Max_val];
        top = -1;
    }

    public void push(char c) 
    {
        if (isFull() == true) 
        {
            System.out.println("Stack Overflow");
        } 
        else 
        {
            top++;
            sArr[top] = c;
        }
    }

    public char pop() 
    {
        if (isEmpty() == true) 
        {
            System.out.println("Stack is empty");
            return ' ';
        } 
        else 
        {
            return sArr[top--];
        }
    }

    public boolean isEmpty() 
    {
        return (top == -1);
    }

    public char peeker() 
    {
        return sArr[top];
    }

    public boolean isFull() 
    {
        return (top == Max_val - 1);
    }

    public int clear(int top) 
    {
        return top = -1;
    }

}