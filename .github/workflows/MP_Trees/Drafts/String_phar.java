package Drafts;
import java.util.*;
public class String_phar 
{
    public static void main(String[] args) 
    {
        String s = "((9+(8/2))+3*(9*3))";
        // String s = "(2*3+4)";
        //String s = "((9+3*8)/(5+10))";
        //String s = "((9+(8/2))*(3*4))";
        String[] split = s.split("((?<=[+*/()!])|(?=[+*/()!]))|((?<=\\^)|(?=\\^))|([0-9]+(?<=[-])|(?=[-]))");
        //String[] split = s.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        LinkedList<String> list = new LinkedList<String>();

        for(int i = 0; i < split.length; i++)
        {
            String add = split[i];
            list.add(add);
        }
        list.removeFirst();
        list.removeLast();
        int in_count = 0;
        System.out.println(list);
        boolean left = false, right = false, leftLast = false, rightLast = false;
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

            
            
            if(a.equals("*") || a.equals("/") && (list.get(j-1).equals(")") && list.get(j+1).equals("("))    && (in_count == 0))
            {
                break;
            }
            else if((a.equals("*") || a.equals("/")) && (!list.get(j-1).equals(")")) && (!list.get(j+1).equals("(") && ((!list.get(j-2).equals("(")) && (!list.get(j+2).equals(")")))))
            {
                list.add(counter - 1, "(");
                list.add(counter + 3,   ")");
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

        for(int i = 0; i < list.size(); i++)
        {
            String l = list.get(i);
            System.out.print(l);
        }
    }
}
