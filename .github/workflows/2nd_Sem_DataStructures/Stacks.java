import java.lang.*;
public class Stacks{
    static int max_value = 101;
    static int[] array = new int[max_value];
    static int top = -1;
    public static void main(String[] args) {
        Push(2);printer();
        Push(5);printer();
        Push(10);printer();
        Pop();printer();
        Push(12);printer();
    }
    public static void Pop(){
        if(top != -1){
            top--;
        }
        else{
            System.out.println("Error: No elements to pop\n");
            return;
        }
    }   

    public static void Push(int num){
        if(top != max_value - 1){
            ++top;
            array[top] = num;
            return;
        }
        else{
            System.out.println("Error Stack overflow\n");
            return;
        }
    }

    static int top(){
        return array[top];
    }

    public static void printer(){
        System.out.print("Stack:  ");
        for(int i = 0; i <= top; i++){
            int num = array[i];
            System.out.print(num + " ");
        }
        System.out.println();
    }
}