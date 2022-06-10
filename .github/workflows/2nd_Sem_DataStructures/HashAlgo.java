import java.util.HashMap;
import java.util.LinkedList;

public class HashAlgo 
{
    public static void main(String[] args) 
    {
        /*
            Find the calculation of every name
        */
        LinkedList<String>[] string_arr = new LinkedList[11];
        for(int i = 0; i < string_arr.length; i++){
            string_arr[i] = new LinkedList<>();
        }
        
        String mia = "Mia";
        int value_mia = getHashValue(mia);
        string_arr[value_mia].add(mia); 

        String sue = "Sue";
        int value_sue = getHashValue(sue);
        string_arr[value_sue].add(sue); 

        String tim = "Tim";
        int value_tim = getHashValue(tim);
        string_arr[value_tim].add(tim);

        for(int i = 0; i < string_arr.length; i++){
            System.out.print(i);
            for(int j = 0; j < string_arr[i].size(); j++){
                String name = string_arr[i].get(j);
                System.out.print("->\t" + name);
            }
            System.out.println();
        }
    } 
    public static int getHashValue(String name){
        int value = 0;
        String[] arr = name.split("");
        for(int i = 0; i < arr.length; i++){
            System.out.println("Char value of: " + arr[i] + " = " + (int) arr[i].charAt(0));
            value += arr[i].charAt(0);
        }
        System.out.println("The total value of the name is: " + value);
        value = value % 11;
        System.out.println("The position in the array is: " + value);
        return value;
    }
}
